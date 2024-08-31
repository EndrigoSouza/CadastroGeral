package com.cadastroGeral.cadastroGeral.mapper;



import com.cadastroGeral.cadastroGeral.dto.PessoaFisicaDTO;
import com.cadastroGeral.cadastroGeral.entity.PessoaFisica;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface PessoaFisicaMapper {

    PessoaFisicaMapper INSTANCE = Mappers.getMapper(PessoaFisicaMapper.class);

    PessoaFisicaDTO paraDTO (PessoaFisica pessoaFisica);

    PessoaFisica paraEntity(PessoaFisicaDTO pessoaFisicaDTO);

    List<PessoaFisicaDTO> paraDTO(List<PessoaFisica> pessoaFisica);

    List<PessoaFisica> paraEntity(List<PessoaFisica> PessoaFisicaDTO);
}
