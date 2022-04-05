package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.ReporteReservas;

public interface IReporteReservasRepo {
	List<ReporteReservas> reporteReserva(LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
