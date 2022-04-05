package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.VehiculoReservado;

@Repository
@Transactional
public class VehiculoReservadoRepoImpl implements IVehiculoReservadoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public VehiculoReservado buscarPorNumeroDeReserva(String numeroReserva) {
		// TODO Auto-generated method stub
		TypedQuery<VehiculoReservado> myQuery = this.entityManager.createQuery(""
				+ "SELECT NEW ec.edu.uce.modelo.VehiculoReservado(v.placa, v.modelo, v.estado, r.fechaInicio, r.fechaFin, c.cedula) "
				+ "FROM Reserva r "
				+ "JOIN Vehiculo v ON v = r.vehiculo "
				+ "JOIN Cliente c ON c = r.cliente "
				+ "WHERE r.numeroReserva =:numero ", VehiculoReservado.class);
		myQuery.setParameter("numero", numeroReserva);
		return myQuery.getSingleResult();
	}
	
}
