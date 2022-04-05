package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.VehiculoReservado;
import ec.edu.uce.repository.IVehiculoReservadoRepo;

@Service
public class VehiculoReservadoServiImpl implements IVehiculoReservadoServi {

	@Autowired
	private IVehiculoReservadoRepo vehiculoReservadoRepo;

	@Override
	public VehiculoReservado buscarPorNumeroDeReserva(String numeroReserva) {
		// TODO Auto-generated method stub
		return this.vehiculoReservadoRepo.buscarPorNumeroDeReserva(numeroReserva);
	}
}
