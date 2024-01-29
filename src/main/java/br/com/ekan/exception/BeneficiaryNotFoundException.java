package br.com.ekan.exception;

public class BeneficiaryNotFoundException extends RuntimeException {

    public BeneficiaryNotFoundException() {
        super("Beneficiary not found.");
    }

}
