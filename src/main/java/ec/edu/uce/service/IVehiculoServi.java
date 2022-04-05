package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Vehiculo;

public interface IVehiculoServi {
	Vehiculo buscarVehiculo(Integer id);
	void insertarVehiculo(Vehiculo vehiculo);
	void actualizarVehiculo(Vehiculo vehiculo);
	void eliminarVehiculo(Integer id);
	
	List<Vehiculo> buscarVehiculosPorMarcaYModelo(String marca, String modelo);
	Vehiculo buscarVehiculoPorPlaca(String placa);
}
