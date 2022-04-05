package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;

@Service
public class VehiculoServiImpl implements IVehiculoServi {

	@Autowired
	private IVehiculoRepo vehiculoRepo;

	@Override
	public Vehiculo buscarVehiculo(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarVehiculo(id);
	}

	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertarVehiculo(vehiculo);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizarVehiculo(vehiculo);
	}

	@Override
	public void eliminarVehiculo(Integer id) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminarVehiculo(id);
	}

	@Override
	public List<Vehiculo> buscarVehiculosPorMarcaYModelo(String marca, String modelo) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarVehiculosPorMarcaYModelo(marca, modelo);
	}

	@Override
	public Vehiculo buscarVehiculoPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarVehiculoPorPlaca(placa);
	}
	
}
