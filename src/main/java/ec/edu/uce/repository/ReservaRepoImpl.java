package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.ReservaTO;

@Repository
@Transactional
public class ReservaRepoImpl implements IReservaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Reserva buscarReserva(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Reserva.class,id);
	}

	@Override
	public void insertarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		this.entityManager.persist(reserva);
	}

	@Override
	public void actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		this.entityManager.merge(reserva);
	}

	@Override
	public void eliminarReserva(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	@Override
	public ReservaTO buscarReservaTOPorNumeroReserva(String numeroReserva) {
		// TODO Auto-generated method stub
		TypedQuery<ReservaTO> myQuery = this.entityManager.createQuery("SELECT NEW ec.edu.uce.modelo.ReservaTO(v.placa, v.modelo, v.estado, r.fechaInicio, r.fechaFin, c.cedula) FROM Reserva r JOIN r.vehiculo v ON r.vehiculo = v JOIN r.cliente c ON r.cliente = c WHERE r.numeroReserva =:numeroReserva", ReservaTO.class);
		myQuery.setParameter("numeroReserva", numeroReserva);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Reserva> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Reserva> myQuery = this.entityManager.createQuery("SELECT r FROM Reserva r", Reserva.class);
		return myQuery.getResultList();
	}

}
