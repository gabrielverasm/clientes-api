package br.com.binariodigital.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.binariodigital.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
