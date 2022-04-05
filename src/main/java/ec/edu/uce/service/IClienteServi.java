package ec.edu.uce.service;

import ec.edu.uce.modelo.Cliente;

public interface IClienteServi {
	Cliente buscarCliente(Integer id);
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	
	Cliente buscarClientePorCedula(String cedula);
}
