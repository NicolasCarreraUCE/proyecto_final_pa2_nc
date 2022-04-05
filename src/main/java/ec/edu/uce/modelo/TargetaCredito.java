package ec.edu.uce.modelo;

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
@Table(name = "targeta_credito")
public class TargetaCredito {

	@Id
	@Column(name = "tacr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_targeta_credito") 
	@SequenceGenerator(name = "seq_targeta_credito", sequenceName = "seq_targeta_credito", allocationSize = 1)
	private Integer id;
	
	@Column(name = "tacr_numero_targeta")
	private String numeroTargeta;
	
	@Column(name = "tacr_fecha_vencimiento")
	private String fechaVencimiento;
	
	@ManyToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;

	@OneToOne(mappedBy = "targetaCredito", cascade=CascadeType.ALL)
	private Registro registro;
	
	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTargeta() {
		return numeroTargeta;
	}

	public void setNumeroTargeta(String numeroTargeta) {
		this.numeroTargeta = numeroTargeta;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
}
