package br.com.ekan.exception;

public class DocumentAlreadyExistsException extends RuntimeException{

    public DocumentAlreadyExistsException() {
        super("Document already exists.");
    }

}
