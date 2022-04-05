package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.ReporteCliente;
import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.ReporteVehiculo;

public interface IGestorReportesServi {
	List<ReporteReservas> reporteReservas(LocalDateTime fechaInicio, LocalDateTime fechaFin);
	List<ReporteCliente> reporteClientes();
	List<ReporteVehiculo> reporteVehiculos(Integer mes, Integer anio);
}
