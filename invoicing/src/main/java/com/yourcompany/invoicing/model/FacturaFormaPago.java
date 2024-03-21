package com.yourcompany.invoicing.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the factura_forma_pago database table.
 * 
 */
@Entity
@Table(name="factura_forma_pago")
@NamedQuery(name="FacturaFormaPago.findAll", query="SELECT f FROM FacturaFormaPago f")
public class FacturaFormaPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_factura_forma_pago", unique=true, nullable=false)
	private Integer idFacturaFormaPago;

	@Column(length=2)
	private String codigo;

	@Column(length=50)
	private String descripcion;

	@Column(precision=10, scale=4)
	private BigDecimal valor;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="id_factura", nullable=false)
	private Factura factura;

	public FacturaFormaPago() {
	}

	public Integer getIdFacturaFormaPago() {
		return this.idFacturaFormaPago;
	}

	public void setIdFacturaFormaPago(Integer idFacturaFormaPago) {
		this.idFacturaFormaPago = idFacturaFormaPago;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}