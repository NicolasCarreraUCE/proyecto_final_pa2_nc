package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.ReservaTO;
import ec.edu.uce.modelo.Vehiculo;

@Service
public class GestorEmpleadoServiImpl implements IGestorEmpleadoServi {

	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Override
	public void registrarCliente(String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento, Character genero) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setFechaNacimiento(fechaNacimiento);
		cliente.setGenero(genero);
		cliente.setRegistro(Character.valueOf('E'));
		
		this.clienteServi.insertarCliente(cliente);
	}

	@Override
	public Cliente buscarClient(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteServi.buscarClientePorCedula(cedula);
	}

	@Override
	public void ingresarVehículo(String placa, String modelo, String marca, Integer anioFabricacion,
			String paisFabricacion, String cilindraje, BigDecimal avaluo, BigDecimal valorPorDia) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setModelo(modelo);
		vehiculo.setMarca(marca);
		vehiculo.setAnioFabricacion(anioFabricacion);
		vehiculo.setPaisFabricacion(paisFabricacion);
		vehiculo.setCilindraje(cilindraje);
		vehiculo.setAvaluo(avaluo);
		vehiculo.setValorPorDia(valorPorDia);
		
		this.vehiculoServi.insertarVehiculo(vehiculo);
	}

	@Override
	public Vehiculo buscarVehículo(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoServi.buscarVehiculoPorPlaca(placa);
	}

	@Override
	public ReservaTO RetirarVehículoReservado(String numeroReserva) {
		// TODO Auto-generated method stub
		return null;
	}

}
