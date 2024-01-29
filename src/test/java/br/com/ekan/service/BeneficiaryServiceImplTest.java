package br.com.ekan.service;

import br.com.ekan.entities.Beneficiary;
import br.com.ekan.repository.BeneficiaryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
public class BeneficiaryServiceImplTest {

    @Autowired
    BeneficiaryRepository repository;

    @Test
    public void createBeneficiaryWithSuccess() {
        var b = repository.save(createBeneficiary());

        Optional<Beneficiary> id = repository.findById(b.getId());
        Assert.isTrue(id.isPresent(), "Beneficiary created successfully");

    }


    @Test
    public void findBeneficiaryWithSuccess() {
        var b = repository.save(createBeneficiary());
        Optional<Beneficiary> id = repository.findById(b.getId());
        Assert.isTrue(id.isPresent(), "Beneficiary found");

    }

    @Test
    public void deleteBeneficiaryWithSuccess() {
        var b = repository.save(createBeneficiary());
        repository.deleteById(b.getId());
        Optional<Beneficiary> id = repository.findById(b.getId());
        Assert.isTrue(id.isEmpty(), "Beneficiary found");

    }


    private Beneficiary createBeneficiary() {
        return Beneficiary.builder().name("teste1").phone("22222222").birthDate(Date.valueOf(LocalDate.now())).build();
    }
}
