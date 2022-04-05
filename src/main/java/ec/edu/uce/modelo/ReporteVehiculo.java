package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class ReporteVehiculo {

	// DATOS DEL VEHICULO
	private Integer id;
	
	private String placa;

	private String modelo;

	private String marca;

	private Integer anioFabricacion;

	private String paisFabricacion;

	private String cilindraje;

	private BigDecimal avaluo;

	private BigDecimal valorPorDia;

	private Character estado;
	
	// DATOS DEL REGISTRO
	private BigDecimal valorICE;
	
	private BigDecimal valorTotal;

	public ReporteVehiculo() {
	}

	public ReporteVehiculo(Integer id, String placa, String modelo, String marca, Integer anioFabricacion,
			String paisFabricacion, String cilindraje, BigDecimal avaluo, BigDecimal valorPorDia, Character estado,
			BigDecimal valorICE, BigDecimal valorTotal) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.paisFabricacion = paisFabricacion;
		this.cilindraje = cilindraje;
		this.avaluo = avaluo;
		this.valorPorDia = valorPorDia;
		this.estado = estado;
		this.valorICE = valorICE;
		this.valorTotal = valorTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(Integer anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getPaisFabricacion() {
		return paisFabricacion;
	}

	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public BigDecimal getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(BigDecimal avaluo) {
		this.avaluo = avaluo;
	}

	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public BigDecimal getValorICE() {
		return valorICE;
	}

	public void setValorICE(BigDecimal valorICE) {
		this.valorICE = valorICE;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
