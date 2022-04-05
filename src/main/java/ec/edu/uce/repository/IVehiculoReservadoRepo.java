package ec.edu.uce.repository;

import ec.edu.uce.modelo.VehiculoReservado;

public interface IVehiculoReservadoRepo {
	VehiculoReservado buscarPorNumeroDeReserva(String numeroReserva);
}
