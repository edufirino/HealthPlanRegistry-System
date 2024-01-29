package br.com.ekan.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class BeneficiaryResponse {

    @Schema(description = "Beneficiary id")
    private Long id;

    @Schema(description = "Beneficiary name")
    private String name;

    @Schema(description = "Beneficiary phone")
    private String phone;

    @Schema(description = "Beneficiary date of birth")
    private Date birthDate;

    @Schema(description = "Beneficiary creation date")
    private LocalDateTime createAt;

    @Schema(description = "Beneficiary updated date")
    private LocalDateTime updateAt;

    @Schema(description = "Beneficiary documents")
    private List<DocumentDto> documents;
}
