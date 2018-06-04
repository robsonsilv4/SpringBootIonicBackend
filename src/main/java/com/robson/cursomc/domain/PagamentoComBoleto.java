package com.robson.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.robson.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Date dataPagamento;
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
