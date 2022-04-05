package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.ReservaTO;
import ec.edu.uce.modelo.Vehiculo;

public interface IGestorEmpleadoServi {

	void registrarCliente(String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento, Character genero);
	Cliente buscarClient(String cedula);
	void ingresarVehículo(String placa, String modelo, String marca, Integer anioFabricacion, String paisFabricacion, String cilindraje, BigDecimal avaluo, BigDecimal valorPorDia);
	Vehiculo buscarVehículo(String placa);
	ReservaTO RetirarVehículoReservado(String numeroReserva);
}
