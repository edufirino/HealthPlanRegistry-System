package br.com.ekan.mapper;

import br.com.ekan.api.DocumentDto;
import br.com.ekan.entities.Document;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentMapper {
    DocumentDto toDocumentDto(Document document);
}
