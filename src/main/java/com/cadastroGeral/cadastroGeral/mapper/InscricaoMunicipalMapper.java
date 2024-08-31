package com.cadastroGeral.cadastroGeral.mapper;


import com.cadastroGeral.cadastroGeral.dto.InscricaoMunicipalDTO;
import com.cadastroGeral.cadastroGeral.entity.InscricaoMunicipal;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface InscricaoMunicipalMapper {

    InscricaoMunicipalMapper INSTANCE = Mappers.getMapper(InscricaoMunicipalMapper.class);

    InscricaoMunicipalDTO paraDTO (InscricaoMunicipal inscricaoMunicipal);

    InscricaoMunicipal paraEntity(InscricaoMunicipalDTO inscricaoMunicipalDTO);

    List<InscricaoMunicipalDTO> paraDTO(List<InscricaoMunicipal> inscricaoMunicipal);

    List<InscricaoMunicipal> paraEntity(List<InscricaoMunicipal> inscricaoMunicipalDTO);

}
