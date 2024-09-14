package com.cadastroGeral.cadastroGeral.mapper;


import com.cadastroGeral.cadastroGeral.dto.TelefoneDTO;
import com.cadastroGeral.cadastroGeral.entity.Telefone;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface TelefoneMapper {

    ResponsavelMapper INSTANCE = Mappers.getMapper(ResponsavelMapper.class);

    TelefoneDTO paraDTO (Telefone telefone);

    Telefone paraEntity(TelefoneDTO socioDTO);

    List<TelefoneDTO> paraDTO(List<Telefone> telefone);

    List<Telefone> paraEntity(List<Telefone> telefoneDTO);
}
