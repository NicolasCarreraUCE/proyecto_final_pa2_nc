package ec.edu.uce.repository;

import ec.edu.uce.modelo.Registro;

public interface IRegistroRepo {
	Registro buscarRegistro(Integer id);
	void insertarRegistro(Registro registro);
	void actualizarRegistro(Registro registro);
	void eliminarRegistro(Integer id);
}
