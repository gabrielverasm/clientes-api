package br.com.binariodigital.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.binariodigital.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
