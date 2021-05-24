package aguiar.bruno.dto.input;

import java.math.BigDecimal;

import javax.validation.Valid;

import com.sun.istack.NotNull;

public class EntregaInput {

	@Valid
	@NotNull
	private ClientIdInput client;
	
	@Valid
	@NotNull
	private DestinatarioInput destinatario;
	
	@NotNull
	private BigDecimal taxa;
	
	
}
