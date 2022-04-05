package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.ReporteReservas;

public interface IReporteReservasServi {
	List<ReporteReservas> reporteReserva(LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
