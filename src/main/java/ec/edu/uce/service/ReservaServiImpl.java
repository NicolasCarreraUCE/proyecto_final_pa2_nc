package ec.edu.uce.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.ReservaTO;
import ec.edu.uce.repository.IReservaRepo;

@Service
public class ReservaServiImpl implements IReservaServi {

	@Autowired
	private IReservaRepo reservaRepo;

	@Override
	public Reserva buscarReserva(Integer id) {
		// TODO Auto-generated method stub
		return this.reservaRepo.buscarReserva(id);
	}

	@Override
	public void insertarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		this.reservaRepo.insertarReserva(reserva);
	}

	@Override
	public void actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		this.reservaRepo.actualizarReserva(reserva);
	}

	@Override
	public void eliminarReserva(Integer id) {
		// TODO Auto-generated method stub
		this.reservaRepo.eliminarReserva(id);
	}

	@Override
	public List<Reserva> buscarTodos() {
		// TODO Auto-generated method stub
		return this.reservaRepo.buscarTodos();
	}

	@Override
	public ReservaTO buscarReservaTOPorNumeroReserva(String numeroReserva) {
		// TODO Auto-generated method stub
		return this.reservaRepo.buscarReservaTOPorNumeroReserva(numeroReserva);
	}

}
