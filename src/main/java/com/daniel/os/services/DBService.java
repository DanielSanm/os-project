package com.daniel.os.services;

import com.daniel.os.domain.Cliente;
import com.daniel.os.domain.OS;
import com.daniel.os.domain.Tecnico;
import com.daniel.os.domain.enums.Prioridade;
import com.daniel.os.domain.enums.Status;
import com.daniel.os.repositories.ClienteRepository;
import com.daniel.os.repositories.OSRepository;
import com.daniel.os.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private OSRepository osRepository;

    public void instanciaDB() {
        Tecnico t1 = new Tecnico(null, "Daniel Santos", "657.474.870-43", "(88) 88888-8888");
        Cliente c1 = new Cliente(null, "Betina Campos", "148.647.200-10", "(88) 88888-7777");

        OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

        tecnicoRepository.saveAll(Arrays.asList(t1));
        clienteRepository.saveAll(Arrays.asList(c1));
        osRepository.saveAll(Arrays.asList(os1));
    }
}
