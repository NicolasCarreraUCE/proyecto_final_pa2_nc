package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.ReporteVehiculo;

public interface IReporteVehiculoServi {
	List<ReporteVehiculo> reporteVehiculo(Integer mes, Integer anio);
}
