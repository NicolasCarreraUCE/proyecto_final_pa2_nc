package ec.edu.uce.modelo;

import java.time.LocalDateTime;

public class ReservaTO {

	private String placaVehiculo;
	
	private String modeloVehiculo;
	
	private Character estadoVehiculo;
	
	private LocalDateTime fechaInicio;
	
	private LocalDateTime fechaFin;
	
	private String cedulaCliente;
	
	public ReservaTO() {
	}

	public ReservaTO(String placaVehiculo, String modeloVehiculo, Character estadoVehiculo, LocalDateTime fechaInicio,LocalDateTime fechaFin, String cedulaCliente) {
		this.placaVehiculo = placaVehiculo;
		this.modeloVehiculo = modeloVehiculo;
		this.estadoVehiculo = estadoVehiculo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cedulaCliente = cedulaCliente;
	}

	// SET-GET
	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public String getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public Character getEstadoVehiculo() {
		return estadoVehiculo;
	}

	public void setEstadoVehiculo(Character estadoVehiculo) {
		this.estadoVehiculo = estadoVehiculo;
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

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

}
