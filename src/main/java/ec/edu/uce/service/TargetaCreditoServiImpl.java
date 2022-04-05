package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.TargetaCredito;
import ec.edu.uce.repository.ITargetaCreditoRepo;

@Service
public class TargetaCreditoServiImpl implements ITargetaCreditoServi {

	@Autowired
	private ITargetaCreditoRepo targetaCreditoRepo;
	
	@Override
	public TargetaCredito buscarTargetaCredito(Integer id) {
		// TODO Auto-generated method stub
		return this.targetaCreditoRepo.buscarTargetaCredito(id);
	}

	@Override
	public void insertarTargetaCredito(TargetaCredito targetaCredito) {
		// TODO Auto-generated method stub
		this.targetaCreditoRepo.insertarTargetaCredito(targetaCredito);
	}

	@Override
	public void actualizarTargetaCredito(TargetaCredito targetaCredito) {
		// TODO Auto-generated method stub
		this.targetaCreditoRepo.actualizarTargetaCredito(targetaCredito);
	}

	@Override
	public void eliminarTargetaCredito(Integer id) {
		// TODO Auto-generated method stub
		this.targetaCreditoRepo.eliminarTargetaCredito(id);
	}

}
