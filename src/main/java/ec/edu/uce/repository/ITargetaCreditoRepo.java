package ec.edu.uce.repository;

import ec.edu.uce.modelo.TargetaCredito;

public interface ITargetaCreditoRepo {
	TargetaCredito buscarTargetaCredito(Integer id);
	void insertarTargetaCredito(TargetaCredito targetaCredito);
	void actualizarTargetaCredito(TargetaCredito targetaCredito);
	void eliminarTargetaCredito(Integer id);
}
