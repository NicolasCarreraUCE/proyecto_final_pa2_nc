package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {

	@Id
	@Column(name = "regi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_registro") 
	@SequenceGenerator(name = "seq_registro", sequenceName = "seq_registro", allocationSize = 1)
	private Integer id;
	
	@Column(name = "regi_valor_subtotal")
	private BigDecimal valorSubtotal;
	
	@Column(name = "regi_valor_ice")
	private BigDecimal valorICE;
	
	@Column(name = "regi_valor_total")
	private BigDecimal valorTotal;
	
	@Column(name = "regi_fecha_cobro")
	private LocalDateTime fechaCobro;
	
	@OneToOne
	@JoinColumn(name = "tacr_id")
	private TargetaCredito targetaCredito;
	
	@OneToOne(mappedBy = "registro", cascade=CascadeType.ALL)
	private Reserva reserva;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValorSubtotal() {
		return valorSubtotal;
	}

	public void setValorSubtotal(BigDecimal valorSubtotal) {
		this.valorSubtotal = valorSubtotal;
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

	public LocalDateTime getFechaCobro() {
		return fechaCobro;
	}

	public void setFechaCobro(LocalDateTime fechaCobro) {
		this.fechaCobro = fechaCobro;
	}

	public TargetaCredito getTargetaCredito() {
		return targetaCredito;
	}

	public void setTargetaCredito(TargetaCredito targetaCredito) {
		this.targetaCredito = targetaCredito;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
}
