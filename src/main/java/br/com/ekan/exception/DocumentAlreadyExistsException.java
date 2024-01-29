package br.com.ekan.exception;

public class DocumentAlreadyExistsException extends RuntimeException{

    public DocumentAlreadyExistsException() {
        super("Documento já está cadastrado.");
    }

}
