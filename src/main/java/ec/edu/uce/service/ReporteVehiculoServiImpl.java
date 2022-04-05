package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.ReporteVehiculo;
import ec.edu.uce.repository.IReporteVehiculoRepo;

@Service
public class ReporteVehiculoServiImpl implements IReporteVehiculoServi {

	@Autowired
	private IReporteVehiculoRepo reporteVehiculoRepo;

	@Override
	public List<ReporteVehiculo> reporteVehiculo(Integer mes, Integer anio) {
		// TODO Auto-generated method stub
		return this.reporteVehiculoRepo.reporteVehiculo(mes, anio);
	}
}
