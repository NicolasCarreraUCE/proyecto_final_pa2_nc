package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.ReservaTO;

public interface IReservaServi {
	Reserva buscarReserva(Integer id);
	void insertarReserva(Reserva reserva);
	void actualizarReserva(Reserva reserva);
	void eliminarReserva(Integer id);
	List<Reserva> buscarTodos();
	
	ReservaTO buscarReservaTOPorNumeroReserva(String numeroReserva);
}
