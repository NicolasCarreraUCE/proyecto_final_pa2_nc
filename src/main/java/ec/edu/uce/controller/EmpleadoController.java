package ec.edu.uce.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoReservado;
import ec.edu.uce.service.IClienteServi;
import ec.edu.uce.service.IVehiculoReservadoServi;
import ec.edu.uce.service.IVehiculoServi;

@Controller
public class EmpleadoController {

	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Autowired
	private IVehiculoReservadoServi vehiculoReservadoServi;
	
	@GetMapping("/empleado/cliente/registrar")
	public String registrarClienteInicial(Model model) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("guardado", false);
		return "registrar_cliente";
	}
	
	@PostMapping("/empleado/cliente/guardar")
	public String registrarCliente(@RequestParam(value = "nacimiento") String fechaNacimiento, Cliente cliente, Model model) {
		cliente.setFechaNacimiento(LocalDateTime.parse(fechaNacimiento));
		cliente.setRegistro('E');
		this.clienteServi.insertarCliente(cliente);
		model.addAttribute("guardado", true);
		return "registrar_cliente";
	}
	
	@GetMapping("/empleado/cliente/buscar")
	public String buscarClienteInicial(Model model) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("busqueda", false);
		return "buscar_cliente";
	}
	
	@PostMapping("/empleado/cliente/buscar/resultado")
	public String buscarCliente(@RequestParam(value = "cedula") String cedula, Model model) {
		model.addAttribute("cliente", this.clienteServi.buscarClientePorCedula(cedula));
		model.addAttribute("busqueda", true);
		return "buscar_cliente";
	}
	
	@GetMapping("/empleado/vehiculo/registrar")
	public String ingresarVehiculoInicial(Model model) {
		model.addAttribute("vehiculo", new Vehiculo());
		model.addAttribute("guardado", false);
		return "ingresar_vehiculo";
	}
	
	@PostMapping("/empleado/vehiculo/guardar")
	public String ingresarVehiculo(@RequestParam(value = "fabricacion") String fabricacion, @RequestParam(value = "avaluo") String avaluo, @RequestParam(value = "valor") String valor, Vehiculo vehiculo, Model model) {
		vehiculo.setAnioFabricacion(Integer.valueOf(fabricacion));
		vehiculo.setAvaluo(new BigDecimal(avaluo));
		vehiculo.setValorPorDia(new BigDecimal(valor));
		this.vehiculoServi.insertarVehiculo(vehiculo);
		model.addAttribute("guardado", true);
		return "ingresar_vehiculo";
	}
	
	@GetMapping("/empleado/vehiculo/buscar")
	public String buscarVehiculoInicial(Model model) {
		model.addAttribute("vehiculo", new Vehiculo());
		model.addAttribute("busqueda", false);
		return "buscar_vehiculo";
	}
	
	@PostMapping("/empleado/vehiculo/buscar/resultado")
	public String buscarVehiculo(@RequestParam(value = "placa") String placa, Model model) {
		model.addAttribute("vehiculo", this.vehiculoServi.buscarVehiculoPorPlaca(placa));
		model.addAttribute("busqueda", true);
		return "buscar_vehiculo";
	}
	
	@GetMapping("/empleado/vehiculo/retirar")
	public String retirarVehículoInicial(Model model) {
		model.addAttribute("vehiculo", new VehiculoReservado());
		model.addAttribute("busqueda", false);
		return "retirar_vehiculo";
	}
	
	@PostMapping("/empleado/vehiculo/retirar/resultado")
	public String retirarVehículo(@RequestParam(value = "numero") String numeroReserva, Model model) {
		
		VehiculoReservado vehiculoReservado = this.vehiculoReservadoServi.buscarPorNumeroDeReserva(numeroReserva);
		
		Vehiculo vehiculo = this.vehiculoServi.buscarVehiculoPorPlaca(vehiculoReservado.getPlaca());
		
		vehiculo.setEstado('E');
		
		this.vehiculoServi.actualizarVehiculo(vehiculo);
		
		model.addAttribute("vehiculo", vehiculoReservado);
		model.addAttribute("busqueda", true);
		return "retirar_vehiculo";
	}
}
