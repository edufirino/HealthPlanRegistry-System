package br.com.ekan.service;

import br.com.ekan.entities.Beneficiary;
import br.com.ekan.entities.Document;
import br.com.ekan.exception.BeneficiariesNotFoundException;
import br.com.ekan.exception.BeneficiaryNotFoundException;
import br.com.ekan.exception.DocumentAlreadyExistsException;
import br.com.ekan.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

    @Autowired
    BeneficiaryRepository repository;

    @Override
    public Beneficiary createBeneficiary(Beneficiary beneficiary) {
        try{
            beneficiary.setUpdateAt(LocalDateTime.now());
            beneficiary.setCreateAt(LocalDateTime.now());
            return repository.save(beneficiary);
        }catch (DataIntegrityViolationException e){
            throw new DocumentAlreadyExistsException();
        }
    }

    @Override
    public void updateBeneficiary(Long id, Beneficiary beneficiary) {

        Beneficiary bf = repository.findById(id).orElseThrow(BeneficiaryNotFoundException::new);
        beneficiary.setId(id);
        beneficiary.setCreateAt(bf.getCreateAt());
        beneficiary.setUpdateAt(LocalDateTime.now());
        repository.save(beneficiary);
    }

    @Override
    public Beneficiary findById(Long beneficiaryId){
        return repository.findById(beneficiaryId).orElseThrow(BeneficiaryNotFoundException::new);
    }

    @Override
    public List<Beneficiary> findAll() {
        return Optional.of(repository.findAll()).filter(i -> !i.isEmpty()).orElseThrow(BeneficiariesNotFoundException::new);
    }

    @Override
    public List<Document> findDocumentsById(Long id) {
        Beneficiary beneficiary = repository.findById(id).orElseThrow(BeneficiaryNotFoundException::new);
        return beneficiary.getDocuments();
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).orElseThrow(BeneficiaryNotFoundException::new);
        repository.deleteById(id);
    }
}