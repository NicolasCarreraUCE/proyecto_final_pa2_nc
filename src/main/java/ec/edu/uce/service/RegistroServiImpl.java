package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Registro;
import ec.edu.uce.repository.IRegistroRepo;

@Service
public class RegistroServiImpl implements IRegistroServi {

	@Autowired
	private IRegistroRepo registroRepo;

	@Override
	public Registro buscarRegistro(Integer id) {
		// TODO Auto-generated method stub
		return this.registroRepo.buscarRegistro(id);
	}

	@Override
	public void insertarRegistro(Registro registro) {
		// TODO Auto-generated method stub
		this.registroRepo.insertarRegistro(registro);
	}

	@Override
	public void actualizarRegistro(Registro registro) {
		// TODO Auto-generated method stub
		this.registroRepo.actualizarRegistro(registro);
	}

	@Override
	public void eliminarRegistro(Integer id) {
		// TODO Auto-generated method stub
		this.registroRepo.eliminarRegistro(id);
	}
}
