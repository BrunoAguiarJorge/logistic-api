package aguiar.bruno.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aguiar.bruno.exception.EntidadeNaoEncontradaException;
import aguiar.bruno.model.Entrega;
import aguiar.bruno.repository.EntregaRepository;

@Service
public class BuscaEntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long id) {
		return entregaRepository.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega nao encontrada"));
	}
}
