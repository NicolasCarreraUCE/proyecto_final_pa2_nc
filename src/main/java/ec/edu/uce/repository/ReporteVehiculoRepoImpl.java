package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.ReporteVehiculo;

@Repository
@Transactional
public class ReporteVehiculoRepoImpl implements IReporteVehiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<ReporteVehiculo> reporteVehiculo(Integer mes, Integer anio) {
		// TODO Auto-generated method stub
		LocalDateTime fecha = LocalDateTime.of(anio, mes, 1, 0, 0);
		TypedQuery<ReporteVehiculo> myQuery = this.entityManager.createQuery(""
				+ "SELECT NEW ec.edu.uce.modelo.ReporteVehiculo(v.id, v.placa, v.modelo, v.marca, v.anioFabricacion, v.paisFabricacion, v.cilindraje, v.avaluo, v.valorPorDia, v.estado, SUM(rg.valorICE) AS valor_ice, SUM(rg.valorTotal) AS valor_total) "
				+ "FROM Reserva r "
				+ "INNER JOIN Registro rg ON r.registro = rg "
				+ "INNER JOIN Vehiculo v ON r.vehiculo = v "
				+ "WHERE r.fechaFin <=:fecha "
				+ "GROUP BY v.id "
				+ "ORDER BY valor_total DESC ", ReporteVehiculo.class);
		
		myQuery.setParameter("fecha", fecha);
		return myQuery.getResultList();
	}
	
}
