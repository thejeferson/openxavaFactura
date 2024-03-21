package com.yourcompany.invoicing.model;

import java.io.*;
import java.math.*;

import javax.persistence.*;


/**
 * The persistent class for the factura_detalle database table.
 * 
 */
@Entity
@Table(name="factura_detalle")
@NamedQuery(name="FacturaDetalle.findAll", query="SELECT f FROM FacturaDetalle f")
public class FacturaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_factura_detalle", unique=true, nullable=false)
	private Integer idFacturaDetalle;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal cantidad;

	@Column(name="codigo_auxiliar", length=25)
	private String codigoAuxiliar;

	@Column(name="codigo_principal", nullable=false, length=25)
	private String codigoPrincipal;

	@Column(nullable=false, length=300)
	private String descripcion;

	@Column(precision=10, scale=4)
	private BigDecimal descuento;

	@Column(name="precio_unitario", precision=10, scale=4)
	private BigDecimal precioUnitario;

	@Column(precision=10, scale=4)
	private BigDecimal total;

	@Column(name="total_con_impuesto_base_imponible", precision=10, scale=4)
	private BigDecimal totalConImpuestoBaseImponible;

	@Column(name="total_con_impuesto_codigo_impuesto_imponible")
	private Integer totalConImpuestoCodigoImpuestoImponible;

	@Column(name="total_con_impuesto_codigo_porcentaje_imponible")
	private Integer totalConImpuestoCodigoPorcentajeImponible;

	@Column(name="total_con_impuesto_valor", precision=10, scale=4)
	private BigDecimal totalConImpuestoValor;

	@Column(name="total_sin_impuesto_base_imponible", precision=10, scale=4)
	private BigDecimal totalSinImpuestoBaseImponible;

	@Column(name="total_sin_impuesto_codigo_impuesto_imponible")
	private Integer totalSinImpuestoCodigoImpuestoImponible;

	@Column(name="total_sin_impuesto_codigo_porcentaje_imponible")
	private Integer totalSinImpuestoCodigoPorcentajeImponible;

	@Column(name="total_sin_impuesto_valor", precision=10, scale=4)
	private BigDecimal totalSinImpuestoValor;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="id_factura", nullable=false)
	private Factura factura;

	public FacturaDetalle() {
	}

	public Integer getIdFacturaDetalle() {
		return this.idFacturaDetalle;
	}

	public void setIdFacturaDetalle(Integer idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigoAuxiliar() {
		return this.codigoAuxiliar;
	}

	public void setCodigoAuxiliar(String codigoAuxiliar) {
		this.codigoAuxiliar = codigoAuxiliar;
	}

	public String getCodigoPrincipal() {
		return this.codigoPrincipal;
	}

	public void setCodigoPrincipal(String codigoPrincipal) {
		this.codigoPrincipal = codigoPrincipal;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getDescuento() {
		return this.descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public BigDecimal getPrecioUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotalConImpuestoBaseImponible() {
		return this.totalConImpuestoBaseImponible;
	}

	public void setTotalConImpuestoBaseImponible(BigDecimal totalConImpuestoBaseImponible) {
		this.totalConImpuestoBaseImponible = totalConImpuestoBaseImponible;
	}

	public Integer getTotalConImpuestoCodigoImpuestoImponible() {
		return this.totalConImpuestoCodigoImpuestoImponible;
	}

	public void setTotalConImpuestoCodigoImpuestoImponible(Integer totalConImpuestoCodigoImpuestoImponible) {
		this.totalConImpuestoCodigoImpuestoImponible = totalConImpuestoCodigoImpuestoImponible;
	}

	public Integer getTotalConImpuestoCodigoPorcentajeImponible() {
		return this.totalConImpuestoCodigoPorcentajeImponible;
	}

	public void setTotalConImpuestoCodigoPorcentajeImponible(Integer totalConImpuestoCodigoPorcentajeImponible) {
		this.totalConImpuestoCodigoPorcentajeImponible = totalConImpuestoCodigoPorcentajeImponible;
	}

	public BigDecimal getTotalConImpuestoValor() {
		return this.totalConImpuestoValor;
	}

	public void setTotalConImpuestoValor(BigDecimal totalConImpuestoValor) {
		this.totalConImpuestoValor = totalConImpuestoValor;
	}

	public BigDecimal getTotalSinImpuestoBaseImponible() {
		return this.totalSinImpuestoBaseImponible;
	}

	public void setTotalSinImpuestoBaseImponible(BigDecimal totalSinImpuestoBaseImponible) {
		this.totalSinImpuestoBaseImponible = totalSinImpuestoBaseImponible;
	}

	public Integer getTotalSinImpuestoCodigoImpuestoImponible() {
		return this.totalSinImpuestoCodigoImpuestoImponible;
	}

	public void setTotalSinImpuestoCodigoImpuestoImponible(Integer totalSinImpuestoCodigoImpuestoImponible) {
		this.totalSinImpuestoCodigoImpuestoImponible = totalSinImpuestoCodigoImpuestoImponible;
	}

	public Integer getTotalSinImpuestoCodigoPorcentajeImponible() {
		return this.totalSinImpuestoCodigoPorcentajeImponible;
	}

	public void setTotalSinImpuestoCodigoPorcentajeImponible(Integer totalSinImpuestoCodigoPorcentajeImponible) {
		this.totalSinImpuestoCodigoPorcentajeImponible = totalSinImpuestoCodigoPorcentajeImponible;
	}

	public BigDecimal getTotalSinImpuestoValor() {
		return this.totalSinImpuestoValor;
	}

	public void setTotalSinImpuestoValor(BigDecimal totalSinImpuestoValor) {
		this.totalSinImpuestoValor = totalSinImpuestoValor;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}