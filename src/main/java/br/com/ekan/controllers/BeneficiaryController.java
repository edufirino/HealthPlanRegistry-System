package br.com.ekan.controllers;

import br.com.ekan.api.BeneficiaryApi;
import br.com.ekan.api.BeneficiaryRequest;
import br.com.ekan.api.BeneficiaryResponse;
import br.com.ekan.api.DocumentDto;
import br.com.ekan.mapper.BeneficiaryMapper;
import br.com.ekan.mapper.DocumentMapper;
import br.com.ekan.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
public class BeneficiaryController implements BeneficiaryApi {

    @Autowired
    private BeneficiaryService service;

    @Autowired
    private BeneficiaryMapper mapper;

    @Autowired
    private DocumentMapper documentMapper;

    @Override
    public ResponseEntity<Void> create(@RequestBody BeneficiaryRequest request) {
        var beneficiaryCreated = service.createBeneficiary(mapper.toBeneficiary(request));
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(beneficiaryCreated.getId()).toUri()).build();
    }

    @Override
    public ResponseEntity<Void> update(Long id, BeneficiaryRequest request) {
        service.updateBeneficiary(id, mapper.toBeneficiary(request));
        return ResponseEntity.ok().build();
    }

    @Override
    public List<BeneficiaryResponse> findAll() {
        return service.findAll().stream().map(mapper::toBeneficiaryResponse).toList();
    }

    @Override
    public BeneficiaryResponse findById(@PathVariable Long id) {
        return mapper.toBeneficiaryResponse(service.findById(id));
    }

    @Override
    public List<DocumentDto> findDocumentsById(Long id) {
        return service.findDocumentsById(id).stream().map(documentMapper::toDocumentDto).toList();
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}