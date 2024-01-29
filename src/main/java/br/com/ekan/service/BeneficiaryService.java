package br.com.ekan.service;

import br.com.ekan.entities.Beneficiary;
import br.com.ekan.entities.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BeneficiaryService {

    Beneficiary createBeneficiary(Beneficiary beneficiary);

    void updateBeneficiary(Long id, Beneficiary beneficiary);

    Beneficiary findById(Long beneficiaryId);
    List<Beneficiary> findAll();

    List<Document> findDocumentsById(Long id);

    void delete(Long id);

}