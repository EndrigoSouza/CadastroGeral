package com.cadastroGeral.cadastroGeral.mapper;


import com.cadastroGeral.cadastroGeral.dto.PessoaJuridicaDTO;
import com.cadastroGeral.cadastroGeral.entity.PessoaJuridica;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface PessoaJuridicaMapper {

    PessoaJuridicaMapper INSTANCE = Mappers.getMapper(PessoaJuridicaMapper.class);

    PessoaJuridicaDTO paraDTO (PessoaJuridica pessoaJuridica);

    PessoaJuridica paraEntity(PessoaJuridicaDTO pessoaJuridicacaDTO);

    List<PessoaJuridicaDTO> paraDTO(List<PessoaJuridica> pessoaJuridica);

    List<PessoaJuridica> paraEntity(List<PessoaJuridica> PessoaJuridicaDTO);
}
