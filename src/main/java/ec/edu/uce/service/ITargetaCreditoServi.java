package ec.edu.uce.service;

import ec.edu.uce.modelo.TargetaCredito;

public interface ITargetaCreditoServi {
	TargetaCredito buscarTargetaCredito(Integer id);
	void insertarTargetaCredito(TargetaCredito targetaCredito);
	void actualizarTargetaCredito(TargetaCredito targetaCredito);
	void eliminarTargetaCredito(Integer id);
}
