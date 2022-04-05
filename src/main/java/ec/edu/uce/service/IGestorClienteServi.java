package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;

@Service
public interface IGestorClienteServi {

	public List<Vehiculo> buscarVehiculosDisponibles(String marca, String modelo);
	public void reservarVehiculo(String placaVehiculo, String cedulaCliente, LocalDateTime fechaInicio, LocalDateTime fechaFin);
	public void registrarseComoCliente(String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento, Character genero);
}
