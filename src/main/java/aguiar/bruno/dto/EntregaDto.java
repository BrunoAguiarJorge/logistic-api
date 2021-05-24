package aguiar.bruno.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import aguiar.bruno.model.StatusEntrega;



public class EntregaDto {

	private Long id;
	private ClientResumoDto cliente;
	private DestinatarioModel destinatario;
	private BigDecimal taxaBigDecimal;
	private StatusEntrega status;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ClientResumoDto getCliente() {
		return cliente;
	}
	public void setCliente(ClientResumoDto cliente) {
		this.cliente = cliente;
	}
	public DestinatarioModel getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(DestinatarioModel destinatario) {
		this.destinatario = destinatario;
	}
	public BigDecimal getTaxaBigDecimal() {
		return taxaBigDecimal;
	}
	public void setTaxaBigDecimal(BigDecimal taxaBigDecimal) {
		this.taxaBigDecimal = taxaBigDecimal;
	}
	public StatusEntrega getStatus() {
		return status;
	}
	public void setStatus(StatusEntrega status) {
		this.status = status;
	}
	public OffsetDateTime getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(OffsetDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}
	public OffsetDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(OffsetDateTime dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}



}
