package com.cadastroGeral.cadastroGeral.mapper;


import com.cadastroGeral.cadastroGeral.dto.InscricaoEstadualDTO;
import com.cadastroGeral.cadastroGeral.entity.InscricaoEstadual;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface InscricaoEstadualMapper {

    InscricaoEstadualMapper INSTANCE = Mappers.getMapper(InscricaoEstadualMapper.class);

    InscricaoEstadualDTO paraDTO (InscricaoEstadual inscricaoEstadualo);

    InscricaoEstadual paraEntity(InscricaoEstadualDTO inscricaoEstadualDTO);

    List<InscricaoEstadualDTO> paraDTO(List<InscricaoEstadual> inscricaoEstadual);

    List<InscricaoEstadual> paraEntity(List<InscricaoEstadual> inscricaoEstadualDTO);


}
