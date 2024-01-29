package br.com.ekan.api;

import br.com.ekan.enums.DocumentType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class DocumentDto {

    @Schema(description = "Document type")
    private DocumentType documentType;

    @Schema(description = "Document number")
    private String description;

    @Schema(description = "Document creation date")
    private LocalDateTime createAt;

    @Schema(description = "Document updated date")
    private LocalDateTime updateAt;
}
