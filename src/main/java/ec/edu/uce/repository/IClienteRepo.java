package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;

public interface IClienteRepo {
	Cliente buscarCliente(Integer id);
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	
	Cliente buscarClientePorCedula(String cedula);
}
