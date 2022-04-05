package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.ReporteVehiculo;

public interface IReporteVehiculoRepo {
	List<ReporteVehiculo> reporteVehiculo(Integer mes, Integer anio);
}
