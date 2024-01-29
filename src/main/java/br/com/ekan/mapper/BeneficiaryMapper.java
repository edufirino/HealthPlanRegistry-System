package br.com.ekan.mapper;

import br.com.ekan.api.BeneficiaryRequest;
import br.com.ekan.api.BeneficiaryResponse;
import br.com.ekan.entities.Beneficiary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BeneficiaryMapper {

    Beneficiary toBeneficiary(BeneficiaryRequest request);

    BeneficiaryRequest toBeneficiaryRequest(Beneficiary beneficiary);

    BeneficiaryResponse toBeneficiaryResponse(Beneficiary beneficiary);

    List<BeneficiaryResponse> toBeneficiaryResponse(List<Beneficiary> beneficiary);
}
