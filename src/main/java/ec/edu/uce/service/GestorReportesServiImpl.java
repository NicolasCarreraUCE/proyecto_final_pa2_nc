package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.ReporteCliente;
import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.ReporteVehiculo;

@Service
public class GestorReportesServiImpl implements IGestorReportesServi {
	
	@Autowired
	private IReporteReservasServi reporteReservasServi;
	
	@Autowired
	private IReporteClienteServi reporteClienteServi;
	
	@Autowired
	private IReporteVehiculoServi reporteVehiculoServi;
	
	@Override
	public List<ReporteReservas> reporteReservas(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.reporteReservasServi.reporteReserva(fechaInicio, fechaFin);
	}

	@Override
	public List<ReporteCliente> reporteClientes() {
		// TODO Auto-generated method stub
		return this.reporteClienteServi.reporteCliente();
	}

	@Override
	public List<ReporteVehiculo> reporteVehiculos(Integer mes, Integer anio) {
		// TODO Auto-generated method stub
		return this.reporteVehiculoServi.reporteVehiculo(mes, anio);
	}

}
