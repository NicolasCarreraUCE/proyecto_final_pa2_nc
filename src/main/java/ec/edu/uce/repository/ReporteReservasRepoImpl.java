package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.ReporteReservas;

@Repository
@Transactional
public class ReporteReservasRepoImpl implements IReporteReservasRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<ReporteReservas> reporteReserva(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		TypedQuery<ReporteReservas> myQuery = this.entityManager.createQuery(""
				+"SELECT NEW ec.edu.uce.modelo.ReporteReservas(r.numeroReserva, r.fechaInicio, r.fechaFin, rg.valorTotal, rg.fechaCobro, c.cedula, c.nombre, c.apellido, v.placa, v.modelo) "
				+"FROM Reserva r JOIN Cliente c ON r.cliente = c JOIN Vehiculo v ON r.vehiculo = v JOIN Registro rg ON r.registro = rg "
				+"WHERE r.fechaInicio >=:fechaInicio AND r.fechaFin <=:fechaFin", ReporteReservas.class);
		myQuery.setParameter("fechaInicio", fechaInicio);
		myQuery.setParameter("fechaFin", fechaFin);
		return myQuery.getResultList();
	}

}
