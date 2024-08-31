package com.cadastroGeral.cadastroGeral.mapper;


import com.cadastroGeral.cadastroGeral.dto.DependenteDTO;
import com.cadastroGeral.cadastroGeral.entity.Dependente;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)


public interface DependenteMapper {
    DependenteMapper INSTANCE = Mappers.getMapper(DependenteMapper.class);

    DependenteDTO paraDTO (Dependente dependente);

    Dependente paraEntity(DependenteDTO dependenteDTO);

    List<DependenteDTO> paraDTO(List<Dependente> dependente);

    List<Dependente> paraEntity(List<Dependente> dependenteDTO);




}
