package com.cadastroGeral.cadastroGeral.mapper;

import com.cadastroGeral.cadastroGeral.dto.CnaeDTO;
import com.cadastroGeral.cadastroGeral.entity.Cnae;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface CnaeMapper {
    CnaeMapper INSTANCE = Mappers.getMapper(CnaeMapper.class);

    CnaeDTO paraDTO(Cnae cnae);

    Cnae paraEntity(CnaeDTO cnaeDTO);

    List<CnaeDTO> paraDTO(List<Cnae> cnae);

    List<Cnae> paraEntity(List<CnaeDTO> cnaeDTO);


}
