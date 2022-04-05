package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.ReporteCliente;
import ec.edu.uce.repository.IReporteClienteRepo;

@Service
public class ReporteClienteServiImpl implements IReporteClienteServi {

	@Autowired
	private IReporteClienteRepo reporteClienteRepo;
	
	@Override
	public List<ReporteCliente> reporteCliente() {
		// TODO Auto-generated method stub
		return this.reporteClienteRepo.reporteCliente();
	}

}
