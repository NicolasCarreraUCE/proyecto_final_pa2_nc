package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteReservas {

	private String numeroReserva;
	
	private LocalDateTime fechaInicioReserva;
	
	private LocalDateTime fechaFinReserva;
	
	private BigDecimal valorTotalAPagarReserva;
	
	private LocalDateTime fechaCobroReserva;
	
	private String cedulaCliente;
	
	private String nombreCliente;
	
	private String apellidoCliente;
	
	private String placaVehiculo;
	
	private String modeloVehiculo;
	
	public ReporteReservas() {
	}

	public ReporteReservas(String numeroReserva, LocalDateTime fechaInicioReserva, LocalDateTime fechaFinReserva, BigDecimal valorTotalAPagarReserva, LocalDateTime fechaCobroReserva, String cedulaCliente, String nombreCliente, String apellidoCliente, String placaVehiculo, String modeloVehiculo) {
		this.numeroReserva = numeroReserva;
		this.fechaInicioReserva = fechaInicioReserva;
		this.fechaFinReserva = fechaFinReserva;
		this.valorTotalAPagarReserva = valorTotalAPagarReserva;
		this.fechaCobroReserva = fechaCobroReserva;
		this.cedulaCliente = cedulaCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.placaVehiculo = placaVehiculo;
		this.modeloVehiculo = modeloVehiculo;
	}

	// SET-GET
	public String getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(String numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public LocalDateTime getFechaInicioReserva() {
		return fechaInicioReserva;
	}

	public void setFechaInicioReserva(LocalDateTime fechaInicioReserva) {
		this.fechaInicioReserva = fechaInicioReserva;
	}

	public LocalDateTime getFechaFinReserva() {
		return fechaFinReserva;
	}

	public void setFechaFinReserva(LocalDateTime fechaFinReserva) {
		this.fechaFinReserva = fechaFinReserva;
	}

	public BigDecimal getValorTotalAPagarReserva() {
		return valorTotalAPagarReserva;
	}

	public void setValorTotalAPagarReserva(BigDecimal valorTotalAPagarReserva) {
		this.valorTotalAPagarReserva = valorTotalAPagarReserva;
	}

	public LocalDateTime getFechaCobroReserva() {
		return fechaCobroReserva;
	}

	public void setFechaCobroReserva(LocalDateTime fechaCobroReserva) {
		this.fechaCobroReserva = fechaCobroReserva;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

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

	@Override
	public String toString() {
		return "ReporteReservas [numeroReserva=" + numeroReserva + ", fechaInicioReserva=" + fechaInicioReserva
				+ ", fechaFinReserva=" + fechaFinReserva + ", valorTotalAPagarReserva=" + valorTotalAPagarReserva
				+ ", fechaCobroReserva=" + fechaCobroReserva + ", cedulaCliente=" + cedulaCliente + ", nombreCliente="
				+ nombreCliente + ", apellidoCliente=" + apellidoCliente + ", placaVehiculo=" + placaVehiculo
				+ ", modeloVehiculo=" + modeloVehiculo + "]";
	}

}
