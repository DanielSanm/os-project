package com.daniel.os.repositories;

import com.daniel.os.domain.Cliente;
import com.daniel.os.domain.OS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer> {


}
