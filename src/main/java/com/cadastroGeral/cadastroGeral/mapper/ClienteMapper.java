package com.cadastroGeral.cadastroGeral.mapper;

import com.cadastroGeral.cadastroGeral.dto.ClienteDTO;
import com.cadastroGeral.cadastroGeral.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO paraDTO(Cliente cliente);

    Cliente paraEntity(ClienteDTO clienteDTO);

    List<ClienteDTO> paraDTO(List<Cliente> cliente);

    List<Cliente> paraEntity(List<ClienteDTO> clienteDTO);
}
