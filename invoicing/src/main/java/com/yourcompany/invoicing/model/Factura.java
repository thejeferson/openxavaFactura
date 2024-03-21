package com.yourcompany.invoicing.model;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;


/**
 * The persistent class for the factura database table.
 * 
 */
@Entity
@Table(name="factura")
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_factura", unique=true, nullable=false)
	private Integer idFactura;

	/*@Column(nullable=false)
	private Integer ambiente;*/

	@Column(length=50)
	private String autorizacion;

	/*@Column(name="campo_adicional", length=1000)
	private String campoAdicional;*/

	/*@Column(name="clave_acceso", length=50)
	private String claveAcceso;*/

	/*@Column(name="codigo_documento", nullable=false, length=2)
	private String codigoDocumento;

	@Column(name="direccion_comprador", nullable=false, length=300)
	private String direccionComprador;*/

	@Column(nullable=false, length=2)
	private String estado;

	/*private Integer exportado;

	@Column(name="exportado_xml")
	private Integer exportadoXml;  */

	/*@Temporal(TemporalType.DATE)
	@Column(name="fecha_autorizacion")
	private Date fechaAutorizacion;*/

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_emision", nullable=false)
	private Date fechaEmision;

	@Column(name="fecha_hora_autorizacion", length=50)
	private String fechaHoraAutorizacion;

	@Column(name="forma_pago", nullable=false, length=200)
	private String formaPago;

	/*@Column(name="guia_remision", length=17)
	private String guiaRemision;*/

	/*@Column(name="hora_autorizacion")
	private Time horaAutorizacion;

	@Column(name="id_sucursal", nullable=false)
	private Integer idSucursal;*/

	@Column(name="identificacion_comprador", nullable=false, length=20)
	private String identificacionComprador;

	@Column(name="mensaje_respuesta", length=1000)
	@Stereotype("TEXT_AREA")
	private String mensajeRespuesta;

	@Column(length=1000)
	private String observacion;

	/*@Column(name="plazo_pago")
	private Integer plazoPago;

	@Column(precision=10, scale=4)
	private BigDecimal propina;*/

	@Column(name="razon_social_comprador", nullable=false, length=300)
	private String razonSocialComprador;

	/*@Column(nullable=false, length=9)
	private String secuencial;

	@Column(name="tipo_emision", nullable=false)
	private Integer tipoEmision;*/

	@Column(name="tipo_identificacion_comprador", nullable=false, length=2)
	private String tipoIdentificacionComprador;


	/*@Column(name="total_con_impuesto_codigo_impuesto_imponible")
	private Integer totalConImpuestoCodigoImpuestoImponible;

	@Column(name="total_con_impuesto_codigo_porcentaje_imponible")
	private Integer totalConImpuestoCodigoPorcentajeImponible;*/




	/*@Column(name="total_sin_impuesto_base_imponible", precision=10, scale=4)
	private BigDecimal totalSinImpuestoBaseImponible;

	@Column(name="total_sin_impuesto_codigo_impuesto_imponible")
	private Integer totalSinImpuestoCodigoImpuestoImponible;

	@Column(name="total_sin_impuesto_codigo_porcentaje_imponible")
	private Integer totalSinImpuestoCodigoPorcentajeImponible;*/

	@Column(name="total_sin_impuesto_valor", precision=10, scale=4)
	private BigDecimal totalSinImpuestoValor;

	@Column(name="total_sin_impuestos", precision=10, scale=4)
	private BigDecimal totalSinImpuestos;
	@Column(name="total_descuento", precision=10, scale=4)
	private BigDecimal totalDescuento;

	@Column(name="total_con_impuesto_base_imponible", precision=10, scale=4)
	private BigDecimal totalConImpuestoBaseImponible;
	
	@Column(name="total_con_impuesto_valor", precision=10, scale=4)
	private BigDecimal totalConImpuestoValor;

	@Column(name="importe_total", precision=10, scale=4)
	private BigDecimal importeTotal;
	
	
	
	/*@Column(name="unidad_tiempo", nullable=false, length=10)
	private String unidadTiempo;

	@Column(name="valor_ret_iva", precision=10, scale=4)
	private BigDecimal valorRetIva;

	@Column(name="valor_ret_renta", precision=10, scale=4)
	private BigDecimal valorRetRenta;*/
	
	


	//bi-directional many-to-one association to FacturaDetalle
	@OneToMany(mappedBy="factura")
	private List<FacturaDetalle> facturaDetalles;

	//bi-directional many-to-one association to FacturaFormaPago
	@OneToMany(mappedBy="factura")
	private List<FacturaFormaPago> facturaFormaPagos;

	
	
	@Column(name="email_transaccion", length=1000)
	private String emailTransaccion;
	
	
	
	
	
	
	
	
	
	
	
	
	public Factura() {
	}

	public Integer getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	/*public Integer getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(Integer ambiente) {
		this.ambiente = ambiente;
	}*/

	public String getAutorizacion() {
		return this.autorizacion;
	}

	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	/*public String getCampoAdicional() {
		return this.campoAdicional;
	}

	public void setCampoAdicional(String campoAdicional) {
		this.campoAdicional = campoAdicional;
	}

	public String getClaveAcceso() {
		return this.claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}*/

	/*public String getCodigoDocumento() {
		return this.codigoDocumento;
	}

	public void setCodigoDocumento(String codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
	}

	public String getDireccionComprador() {
		return this.direccionComprador;
	}

	public void setDireccionComprador(String direccionComprador) {
		this.direccionComprador = direccionComprador;
	}*/

	public String getEmailTransaccion() {
		return this.emailTransaccion;
	}

	public void setEmailTransaccion(String emailTransaccion) {
		this.emailTransaccion = emailTransaccion;
	}

	
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	/*public Integer getExportado() {
		return this.exportado;
	}

	public void setExportado(Integer exportado) {
		this.exportado = exportado;
	}

	public Integer getExportadoXml() {
		return this.exportadoXml;
	}

	public void setExportadoXml(Integer exportadoXml) {
		this.exportadoXml = exportadoXml;
	}

	public Date getFechaAutorizacion() {
		return this.fechaAutorizacion;
	}

	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}*/

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getFechaHoraAutorizacion() {
		return this.fechaHoraAutorizacion;
	}

	public void setFechaHoraAutorizacion(String fechaHoraAutorizacion) {
		this.fechaHoraAutorizacion = fechaHoraAutorizacion;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	/*public String getGuiaRemision() {
		return this.guiaRemision;
	}

	public void setGuiaRemision(String guiaRemision) {
		this.guiaRemision = guiaRemision;
	}

	public Time getHoraAutorizacion() {
		return this.horaAutorizacion;
	}

	public void setHoraAutorizacion(Time horaAutorizacion) {
		this.horaAutorizacion = horaAutorizacion;
	}

	public Integer getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}*/

	public String getIdentificacionComprador() {
		return this.identificacionComprador;
	}

	public void setIdentificacionComprador(String identificacionComprador) {
		this.identificacionComprador = identificacionComprador;
	}

	public BigDecimal getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(BigDecimal importeTotal) {
		this.importeTotal = importeTotal;
	}

	public String getMensajeRespuesta() {
		return this.mensajeRespuesta;
	}

	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/*public Integer getPlazoPago() {
		return this.plazoPago;
	}

	public void setPlazoPago(Integer plazoPago) {
		this.plazoPago = plazoPago;
	}*/

	/*public BigDecimal getPropina() {
		return this.propina;
	}

	public void setPropina(BigDecimal propina) {
		this.propina = propina;
	}

	public String getRazonSocialComprador() {
		return this.razonSocialComprador;
	}

	public void setRazonSocialComprador(String razonSocialComprador) {
		this.razonSocialComprador = razonSocialComprador;
	}

	public String getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(String secuencial) {
		this.secuencial = secuencial;
	}

	public Integer getTipoEmision() {
		return this.tipoEmision;
	}

	public void setTipoEmision(Integer tipoEmision) {
		this.tipoEmision = tipoEmision;
	}*/

	public String getTipoIdentificacionComprador() {
		return this.tipoIdentificacionComprador;
	}

	public void setTipoIdentificacionComprador(String tipoIdentificacionComprador) {
		this.tipoIdentificacionComprador = tipoIdentificacionComprador;
	}

	public BigDecimal getTotalConImpuestoBaseImponible() {
		return this.totalConImpuestoBaseImponible;
	}

	public void setTotalConImpuestoBaseImponible(BigDecimal totalConImpuestoBaseImponible) {
		this.totalConImpuestoBaseImponible = totalConImpuestoBaseImponible;
	}

	/*public Integer getTotalConImpuestoCodigoImpuestoImponible() {
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
	}*/

	public BigDecimal getTotalConImpuestoValor() {
		return this.totalConImpuestoValor;
	}

	public void setTotalConImpuestoValor(BigDecimal totalConImpuestoValor) {
		this.totalConImpuestoValor = totalConImpuestoValor;
	}

	public BigDecimal getTotalDescuento() {
		return this.totalDescuento;
	}

	public void setTotalDescuento(BigDecimal totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	/*public BigDecimal getTotalSinImpuestoBaseImponible() {
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
	}*/
	
	

	public BigDecimal getTotalSinImpuestoValor() {
		return this.totalSinImpuestoValor;
	}

	public void setTotalSinImpuestoValor(BigDecimal totalSinImpuestoValor) {
		this.totalSinImpuestoValor = totalSinImpuestoValor;
	}

	public BigDecimal getTotalSinImpuestos() {
		return this.totalSinImpuestos;
	}

	public void setTotalSinImpuestos(BigDecimal totalSinImpuestos) {
		this.totalSinImpuestos = totalSinImpuestos;
	}

	/*public String getUnidadTiempo() {
		return this.unidadTiempo;
	}

	public void setUnidadTiempo(String unidadTiempo) {
		this.unidadTiempo = unidadTiempo;
	}

	public BigDecimal getValorRetIva() {
		return this.valorRetIva;
	}

	public void setValorRetIva(BigDecimal valorRetIva) {
		this.valorRetIva = valorRetIva;
	}

	public BigDecimal getValorRetRenta() {
		return this.valorRetRenta;
	}

	public void setValorRetRenta(BigDecimal valorRetRenta) {
		this.valorRetRenta = valorRetRenta;
	}*/

	public List<FacturaDetalle> getFacturaDetalles() {
		return this.facturaDetalles;
	}

	public void setFacturaDetalles(List<FacturaDetalle> facturaDetalles) {
		this.facturaDetalles = facturaDetalles;
	}

	public FacturaDetalle addFacturaDetalle(FacturaDetalle facturaDetalle) {
		getFacturaDetalles().add(facturaDetalle);
		facturaDetalle.setFactura(this);

		return facturaDetalle;
	}

	public FacturaDetalle removeFacturaDetalle(FacturaDetalle facturaDetalle) {
		getFacturaDetalles().remove(facturaDetalle);
		facturaDetalle.setFactura(null);

		return facturaDetalle;
	}

	public List<FacturaFormaPago> getFacturaFormaPagos() {
		return this.facturaFormaPagos;
	}

	public void setFacturaFormaPagos(List<FacturaFormaPago> facturaFormaPagos) {
		this.facturaFormaPagos = facturaFormaPagos;
	}

	public FacturaFormaPago addFacturaFormaPago(FacturaFormaPago facturaFormaPago) {
		getFacturaFormaPagos().add(facturaFormaPago);
		facturaFormaPago.setFactura(this);

		return facturaFormaPago;
	}

	public FacturaFormaPago removeFacturaFormaPago(FacturaFormaPago facturaFormaPago) {
		getFacturaFormaPagos().remove(facturaFormaPago);
		facturaFormaPago.setFactura(null);

		return facturaFormaPago;
	}

}