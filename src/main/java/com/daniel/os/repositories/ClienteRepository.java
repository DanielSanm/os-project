package com.daniel.os.repositories;

import com.daniel.os.domain.Cliente;
import com.daniel.os.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {



}
