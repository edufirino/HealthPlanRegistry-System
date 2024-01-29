package br.com.ekan.exception;

public class BeneficiariesNotFoundException extends RuntimeException {

    public BeneficiariesNotFoundException() {
        super("Beneficiaries not found.");
    }

}
