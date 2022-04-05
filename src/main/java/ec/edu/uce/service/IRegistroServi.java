package ec.edu.uce.service;

import ec.edu.uce.modelo.Registro;

public interface IRegistroServi {
	Registro buscarRegistro(Integer id);
	void insertarRegistro(Registro registro);
	void actualizarRegistro(Registro registro);
	void eliminarRegistro(Integer id);
}
