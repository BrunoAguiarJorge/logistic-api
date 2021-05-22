package aguiar.bruno.services;

import java.time.OffsetDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aguiar.bruno.model.Client;
import aguiar.bruno.model.Entrega;
import aguiar.bruno.model.StatusEntrega;
import aguiar.bruno.repository.EntregaRepository;

@Service
public class SolicitacaoEntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	@Autowired
	private CadastroClienteService cadastroClienteService;

	@Transactional
	public Entrega solocitar(Entrega entrega) {
		Client client = cadastroClienteService.buscar(entrega.getClient().getId());
		
		entrega.setClient(client);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(OffsetDateTime.now());
		
		return entregaRepository.save(entrega);
		
	}
	
}
