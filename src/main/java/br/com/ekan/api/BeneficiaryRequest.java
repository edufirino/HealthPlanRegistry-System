package br.com.ekan.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class BeneficiaryRequest {

    @Schema(description = "Beneficiary name")
    private String name;

    @Schema(description = "Beneficiary phone")
    private String phone;

    @Schema(description = "Beneficiary date of birth")
    private Date birthDate;

    @Schema(description = "Beneficiary documents")
    List<DocumentDto> documents;


}
