package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Registro;

@Repository
@Transactional
public class RegistroRepoImpl implements IRegistroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Registro buscarRegistro(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Registro.class, id);
	}

	@Override
	public void insertarRegistro(Registro registro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registro);
	}

	@Override
	public void actualizarRegistro(Registro registro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(registro);
	}

	@Override
	public void eliminarRegistro(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarRegistro(id));
	}

}
