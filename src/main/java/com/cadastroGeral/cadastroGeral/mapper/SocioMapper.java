package com.cadastroGeral.cadastroGeral.mapper;



import com.cadastroGeral.cadastroGeral.dto.SocioDTO;
import com.cadastroGeral.cadastroGeral.entity.Socio;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)


public interface SocioMapper {

    ResponsavelMapper INSTANCE = Mappers.getMapper(ResponsavelMapper.class);

    SocioDTO paraDTO (Socio socio);

    Socio paraEntity(SocioDTO socioDTO);

    List<SocioDTO> paraDTO(List<Socio> socio);

    List<Socio> paraEntity(List<Socio> SocioDTO);
}
