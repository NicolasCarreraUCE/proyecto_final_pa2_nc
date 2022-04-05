package ec.edu.uce.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@Column(name = "rese_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_reserva") 
	@SequenceGenerator(name = "seq_reserva", sequenceName = "seq_reserva", allocationSize = 1)
	private Integer id;
	
	@Column(name = "rese_numero_reserva")
	private String numeroReserva;
	
	@Column(name = "rese_fecha_inicio")
	private LocalDateTime fechaInicio;
	
	@Column(name = "rese_fecha_fin")
	private LocalDateTime fechaFin;
	
	@Column(name = "rese_estado")
	private Character estado;
	
	@ManyToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "vehi_id")
	private Vehiculo vehiculo;

	@OneToOne
	@JoinColumn(name = "regi_id")
	private Registro registro;
	

	public boolean estaDisponible(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		return !(this.fechaInicio.isBefore(fechaInicio) && this.fechaFin.isAfter(fechaInicio)) || (this.fechaInicio.isBefore(fechaFin) && this.fechaFin.isAfter(fechaFin));
	}
	
	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(String numeroReserva) {
		this.numeroReserva = numeroReserva;
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

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
}
