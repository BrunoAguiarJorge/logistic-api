package aguiar.bruno.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import aguiar.bruno.model.Client;
import aguiar.bruno.repository.ClientRepository;
import aguiar.bruno.services.CadastroClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CadastroClienteService cadastroClienteService;
	

	@GetMapping
	public List<Client> listar() {
		return clientRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Client> buscar(@PathVariable Long id) {
		return clientRepository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Client adicionar(@Valid @RequestBody Client cliente) {
		return cadastroClienteService.salvar(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Client> Atualizar(@Valid @PathVariable Long id, @RequestBody Client cliente){
		if (!clientRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		cliente.setId(id);
		cliente = cadastroClienteService.salvar(cliente);
		return ResponseEntity.ok(cliente);
		
		}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		if (!clientRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		cadastroClienteService.excluir(id);
		return ResponseEntity.noContent().build();

	}
	}
	

