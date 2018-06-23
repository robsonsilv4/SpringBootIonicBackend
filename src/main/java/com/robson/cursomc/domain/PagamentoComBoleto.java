package com.robson.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.robson.cursomc.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Date dataPagamento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataVencimeto;

	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(Integer id, EstadoPagamento pagamento, Pedido pedido, Date dataPagamento,
			Date dataVencimeto) {
		super(id, pagamento, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimeto = dataVencimeto;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimeto() {
		return dataVencimeto;
	}

	public void setDataVencimeto(Date dataVencimeto) {
		this.dataVencimeto = dataVencimeto;
	}
}
