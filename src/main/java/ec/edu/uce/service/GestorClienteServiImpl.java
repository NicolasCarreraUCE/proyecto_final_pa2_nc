package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Registro;
import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.TargetaCredito;
import ec.edu.uce.modelo.Vehiculo;

@Service
public class GestorClienteServiImpl implements IGestorClienteServi {

	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IReservaServi reservaServi;
	
	@Autowired
	private ITargetaCreditoServi targetaCreditoServi;
	
	@Autowired
	private IRegistroServi registroServi;
	
	@Override
	public List<Vehiculo> buscarVehiculosDisponibles(String marca, String modelo) {
		// TODO Auto-generated method stub
		List<Vehiculo> listaVehiculos = this.vehiculoServi.buscarVehiculosPorMarcaYModelo(marca, modelo);
		//return listaVehiculos.stream().filter(vehiculo -> vehiculo.getEstado().equals(Character.valueOf('D'))).collect(Collectors.toList());
		return listaVehiculos;
	}

	@Override
	public void reservarVehiculo(String placaVehiculo, String cedulaCliente, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub	
		Vehiculo vehiculo = this.vehiculoServi.buscarVehiculoPorPlaca(placaVehiculo);
		Cliente cliente = this.clienteServi.buscarClientePorCedula(cedulaCliente);
		
		List<Reserva> reservas = this.reservaServi.buscarTodos();
		
		boolean disponible = reservas.parallelStream().anyMatch(r -> (r.getVehiculo().equals(vehiculo)) && r.estaDisponible(fechaInicio, fechaFin));
		
		if (disponible) {
			int díasDeReserva = Period.between(fechaFin.toLocalDate(), fechaInicio.toLocalDate()).getDays();
			
			BigDecimal valorSubTotal = vehiculo.getValorPorDia().multiply(new BigDecimal(díasDeReserva));
			BigDecimal valorICE = valorSubTotal.multiply(new BigDecimal(0.15));
			BigDecimal valorTotalAPagar = valorSubTotal.add(valorICE); // mostrar valor total
			
			// Ingresar Targeta de credito
			TargetaCredito targetaCredito = new TargetaCredito();
			
			// ingresar tarageta
			
			Registro registro = new Registro();
			registro.setValorSubtotal(valorSubTotal);
			registro.setValorICE(valorICE);
			registro.setValorTotal(valorTotalAPagar);
			registro.setFechaCobro(LocalDateTime.now());
			
			registro.setTargetaCredito(targetaCredito);
			
			Reserva reserva = new Reserva();
			
			String numeroReserva = "Generar numero de reserva!!!!!";
			
			reserva.setNumeroReserva(numeroReserva);
			reserva.setFechaInicio(fechaInicio);
			reserva.setFechaFin(fechaFin);
			reserva.setEstado('G');
			reserva.setCliente(cliente);
			reserva.setVehiculo(vehiculo);
			
			reserva.setRegistro(registro);
			
			registro.setReserva(reserva);
			
			this.reservaServi.insertarReserva(reserva);
			this.registroServi.insertarRegistro(registro);
			
			// Al final se debe presentar al cliente un mensaje indicando que la reserva fue realizada con éxito.
			// Mostrar numero de reserva
		}
		
	}

	public boolean vehiculoDisponible(String placaVehiculo, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		List<Reserva> reservas = this.reservaServi.buscarTodos();
		Vehiculo vehiculo = this.vehiculoServi.buscarVehiculoPorPlaca(placaVehiculo);
		return reservas.parallelStream().anyMatch(r -> (r.getVehiculo().equals(vehiculo)) && r.estaDisponible(fechaInicio, fechaFin));
	}
	
	@Override
	public void registrarseComoCliente(String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento, Character genero) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setFechaNacimiento(fechaNacimiento);
		cliente.setGenero(genero);
		cliente.setRegistro(Character.valueOf('C'));
		
		this.clienteServi.insertarCliente(cliente);
	}

}
