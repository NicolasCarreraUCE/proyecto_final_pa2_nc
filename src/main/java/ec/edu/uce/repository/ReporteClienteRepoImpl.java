package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.ReporteCliente;

@Repository
@Transactional
public class ReporteClienteRepoImpl implements IReporteClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<ReporteCliente> reporteCliente() {
		// TODO Auto-generated method stub
		TypedQuery<ReporteCliente> myQuery = this.entityManager.createQuery(""
				+ "SELECT NEW ec.edu.uce.modelo.ReporteCliente(c.cedula, c.nombre, c.apellido, c.fechaNacimiento, c.genero, c.registro, rg.valorSubtotal, rg.valorTotal) "
				+ "FROM Cliente c JOIN Reserva r ON c = r.cliente JOIN Registro rg ON r = rg.reserva "
				+ "ORDER BY rg.valorTotal DESC", ReporteCliente.class);
		return myQuery.getResultList();
	}

}
