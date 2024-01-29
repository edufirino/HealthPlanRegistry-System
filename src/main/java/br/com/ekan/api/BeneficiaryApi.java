package br.com.ekan.api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/beneficiaries")
public interface BeneficiaryApi {
    @Operation(summary = "Create beneficiary", tags = {"Beneficiary"})
    @PostMapping
    ResponseEntity<Void> create(@RequestBody BeneficiaryRequest request);

    @Operation(summary = "Update beneficiary by Id", tags = {"Beneficiary"})
    @PutMapping("/{id}")
    ResponseEntity<Void> update(@PathVariable Long id, @RequestBody BeneficiaryRequest request);

    @Operation(summary = "List all beneficiaries", tags = {"Beneficiary"})
    @GetMapping
    List<BeneficiaryResponse> findAll();

    @Operation(summary = "Find beneficiary by Id", tags = {"Beneficiary"})
    @GetMapping("/{id}")
    BeneficiaryResponse findById(@PathVariable Long id);

    @Operation(summary = "List all documents by beneficiary Id", tags = {"Beneficiary"})
    @GetMapping("/{id}/documents")
    List<DocumentDto> findDocumentsById(@PathVariable Long id);

    @Operation(summary = "Delete beneficiary by Id", tags = {"Beneficiary"})
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);
}
