package aguiar.bruno.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aguiar.bruno.model.Entrega;
import aguiar.bruno.model.Ocorrencia;

@Service
public class RegistroOcorrenciaService {

	@Autowired
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public Ocorrencia registrar(Long id, String descricao) {
		Entrega entrega = buscaEntregaService.buscar(id);
				
				return entrega.adicionarOcorrencia(descricao);
	}
}
