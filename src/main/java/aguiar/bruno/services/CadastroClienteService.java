package aguiar.bruno.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aguiar.bruno.exception.NegocioException;
import aguiar.bruno.model.Client;
import aguiar.bruno.repository.ClientRepository;

@Service
public class CadastroClienteService {

	@Autowired
	private ClientRepository clientRepository;

	public Client buscar(Long id) {
		return clientRepository.findById(id)
				.orElseThrow(() -> new NegocioException("Client nao encontrado"));
	}

	@Transactional
	public Client salvar(Client cliente) {
		boolean emailEmUso = clientRepository.findByEmail(cliente.getEmail()).stream()
				.anyMatch(clienteExistente -> !clienteExistente.equals(cliente));

		if (emailEmUso) {
			throw new NegocioException("ja existe um cliente cadastrado com esse email");
		}

		return clientRepository.save(cliente);
	}

	@Transactional
	public void excluir(Long id) {
		clientRepository.deleteById(id);
	}
}
