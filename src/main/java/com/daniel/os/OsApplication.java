package com.daniel.os;

import com.daniel.os.domain.Cliente;
import com.daniel.os.domain.OS;
import com.daniel.os.domain.Tecnico;
import com.daniel.os.domain.enums.Prioridade;
import com.daniel.os.domain.enums.Status;
import com.daniel.os.repositories.ClienteRepository;
import com.daniel.os.repositories.OSRepository;
import com.daniel.os.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OsApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;

	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tecnico t1 = new Tecnico(null, "Daniel Santos", "657.474.870-43", "(88) 88888-8888");
		Cliente c1 = new Cliente(null, "Betina Campos", "148.647.200-10", "(88) 88888-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

	}
}
