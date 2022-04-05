package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteCliente {
	
	// DATOS CLIENTE
	private String cedula;
	
	private String nombre;
	
	private String apellido;
	
	private LocalDateTime fechaNacimiento;
	
	private Character genero;
	
	private Character registro;
	
	// DATOS REGISTRO
	private BigDecimal valorSubtotal;
	
	private BigDecimal valorTotal;

	public ReporteCliente() {
	}

	public ReporteCliente(String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento,
			Character genero, Character registro, BigDecimal valorSubtotal, BigDecimal valorTotal) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.registro = registro;
		this.valorSubtotal = valorSubtotal;
		this.valorTotal = valorTotal;
	}

	// SET-GET
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

	public Character getRegistro() {
		return registro;
	}

	public void setRegistro(Character registro) {
		this.registro = registro;
	}

	public BigDecimal getValorSubtotal() {
		return valorSubtotal;
	}

	public void setValorSubtotal(BigDecimal valorSubtotal) {
		this.valorSubtotal = valorSubtotal;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
