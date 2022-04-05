package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.repository.IReporteReservasRepo;

@Service
public class ReporteReservasServiImpl implements IReporteReservasServi {

	@Autowired
	private IReporteReservasRepo reporteReservasRepo;

	@Override
	public List<ReporteReservas> reporteReserva(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.reporteReservasRepo.reporteReserva(fechaInicio, fechaFin);
	}
}
