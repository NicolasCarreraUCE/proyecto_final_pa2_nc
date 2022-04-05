package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class VehiculoTO {

	private String placa;

	private String modelo;

	private String marca;
	
	private Integer anioFabricacion;
	
	private Character estado;
	
	private BigDecimal valorPorDia;
	
	public VehiculoTO() {
	}

	public VehiculoTO(String placa, String modelo, String marca, Integer anioFabricacion, Character estado, BigDecimal valorPorDia) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.estado = estado;
		this.valorPorDia = valorPorDia;
	}

	// SET-GET
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

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public BigDecimal getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(BigDecimal valorPorDia) {
		this.valorPorDia = valorPorDia;
	}
	
}

