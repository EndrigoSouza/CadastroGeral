package com.cadastroGeral.cadastroGeral.mapper;



import com.cadastroGeral.cadastroGeral.dto.ResponsavelDTO;
import com.cadastroGeral.cadastroGeral.entity.Responsavel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ResponsavelMapper {

    ResponsavelMapper INSTANCE = Mappers.getMapper(ResponsavelMapper.class);

    ResponsavelDTO paraDTO (Responsavel pessoaJuridica);

    Responsavel paraEntity(ResponsavelDTO responsavelDTO);

    List<ResponsavelDTO> paraDTO(List<Responsavel> responsavel);

    List<Responsavel> paraEntity(List<Responsavel> ResponsavelDTO);
}
