package ec.edu.uce.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Registro;
import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoTO;
import ec.edu.uce.service.GestorClienteServiImpl;
import ec.edu.uce.service.IClienteServi;
import ec.edu.uce.service.IGestorClienteServi;
import ec.edu.uce.service.IRegistroServi;
import ec.edu.uce.service.IReservaServi;
import ec.edu.uce.service.ITargetaCreditoServi;
import ec.edu.uce.service.IVehiculoServi;

@Controller
public class ClienteControler {

	@Autowired
	private IGestorClienteServi gestorClienteServi;
	
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
	
	@GetMapping("/cliente/consulta/vehiculo")
	public String vehiculosDisponibleInicial(Model model) {
		model.addAttribute("vehiculo", new VehiculoTO());
		return "vehiculos_disponibles";
	}
	
	@PostMapping("/cliente/reporte/vehiculo")
	public String vehiculosDisponible(@RequestParam(value = "marca") String marca, @RequestParam(value = "modelo") String modelo, Model model) {
		model.addAttribute("list", this.gestorClienteServi.buscarVehiculosDisponibles(marca, modelo));
		return "vehiculos_disponibles";
	}
	
	@GetMapping("/cliente/consulta/reservar")
	public String reservarVehiculoInicial(Model model) {
		model.addAttribute("disponible", false);
		model.addAttribute("indisponible", false);
		return "reservar_vehiculo";
	}
	
	@PostMapping("/cliente/reporte/reservar")
	public String reservarVehiculo2(@RequestParam(value = "placa") String placa, @RequestParam(value = "cedula") String cedula, @RequestParam(value = "fecha-inicio") String fechaInicio, @RequestParam(value = "fecha-fin") String fechaFin, Model model) {
		
//		Vehiculo vehiculo = this.vehiculoServi.buscarVehiculoPorPlaca(placa);
//		Cliente cliente = this.clienteServi.buscarClientePorCedula(cedula);
//		
//		List<Reserva> reservas = this.reservaServi.buscarTodos();
//		
//		boolean disponible = reservas.parallelStream().anyMatch(r -> (r.getVehiculo().equals(vehiculo)) && r.estaDisponible(LocalDateTime.parse(fechaInicio), LocalDateTime.parse(fechaFin)));
//		
		boolean disponible = true;
		
		if (disponible) {
//			int díasDeReserva = Period.between(LocalDateTime.parse(fechaFin).toLocalDate(), LocalDateTime.parse(fechaInicio).toLocalDate()).getDays();
//			
//			BigDecimal valorSubTotal = vehiculo.getValorPorDia().multiply(new BigDecimal(díasDeReserva));
//			BigDecimal valorICE = valorSubTotal.multiply(new BigDecimal(0.15));
//			BigDecimal valorTotalAPagar = valorSubTotal.add(valorICE); // mostrar valor total
//			
//			model.addAttribute("total", valorTotalAPagar);
			model.addAttribute("total", 100.0);
			model.addAttribute("disponible", true);
		} else {
			model.addAttribute("indisponible", true);
		}
		
		return "reservar_vehiculo";
	}
	
	@PostMapping("/cliente/reporte/reservar/targeta")
	public String reservarVehiculo3(@RequestParam(value = "targeta") String targeta, @RequestParam(value = "expiracion") String expiracion, Model model) {
		model.addAttribute("total", 100.0);
		model.addAttribute("disponible", true);
		model.addAttribute("numero_reserva", "NC-001");
		model.addAttribute("guardado", true);
		return "reservar_vehiculo";
	}
	
	@GetMapping("/cliente/registrar")
	public String registrarClienteInicial(Model model) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("guardado", false);
		return "registrarse_cliente";
	}
	
	@PostMapping("/cliente/guardar")
	public String registrarCliente(@RequestParam(value = "nacimiento") String fechaNacimiento, Cliente cliente, Model model) {
		cliente.setFechaNacimiento(LocalDateTime.parse(fechaNacimiento));
		cliente.setRegistro('C');
		this.clienteServi.insertarCliente(cliente);
		model.addAttribute("guardado", true);
		return "registrarse_cliente";
	}
}
