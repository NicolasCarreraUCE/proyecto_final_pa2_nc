package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.TargetaCredito;

@Repository
@Transactional
public class TargetaCreditoRepoImpl implements ITargetaCreditoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public TargetaCredito buscarTargetaCredito(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(TargetaCredito.class, id);
	}

	@Override
	public void insertarTargetaCredito(TargetaCredito targetaCredito) {
		// TODO Auto-generated method stub
		this.entityManager.persist(targetaCredito);
	}

	@Override
	public void actualizarTargetaCredito(TargetaCredito targetaCredito) {
		// TODO Auto-generated method stub
		this.entityManager.merge(targetaCredito);
	}

	@Override
	public void eliminarTargetaCredito(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

}
