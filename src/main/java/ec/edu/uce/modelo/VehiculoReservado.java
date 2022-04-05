package ec.edu.uce.modelo;

import java.time.LocalDateTime;

public class VehiculoReservado {

	private String placa;
	
	private String modelo;
	
	private Character estado;
	
	private LocalDateTime fechaInicio;
	
	private LocalDateTime fechaFin;
	
	private String cedula;
	
	public VehiculoReservado() {
	}

	public VehiculoReservado(String placa, String modelo, Character estado, LocalDateTime fechaInicio,
			LocalDateTime fechaFin, String cedula) {
		this.placa = placa;
		this.modelo = modelo;
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cedula = cedula;
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

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
