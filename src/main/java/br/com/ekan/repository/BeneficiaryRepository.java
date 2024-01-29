package br.com.ekan.repository;

import br.com.ekan.entities.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository  extends JpaRepository<Beneficiary, Long> {
}
