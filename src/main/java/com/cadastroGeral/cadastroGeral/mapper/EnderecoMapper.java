package com.cadastroGeral.cadastroGeral.mapper;



import com.cadastroGeral.cadastroGeral.dto.EnderecoDTO;
import com.cadastroGeral.cadastroGeral.entity.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    EnderecoDTO paraDTO (Endereco endereco);

    Endereco paraEntity(EnderecoDTO enderecoDTO);

    List<EnderecoDTO> paraDTO(List<Endereco> endereco);

    List<Endereco> paraEntity(List<Endereco> enderecoDTO);


}
