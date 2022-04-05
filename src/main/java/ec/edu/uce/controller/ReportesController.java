package ec.edu.uce.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.edu.uce.modelo.ReporteCliente;
import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.ReporteVehiculo;
import ec.edu.uce.service.IGestorReportesServi;

@Controller
public class ReportesController {

	@Autowired
	private IGestorReportesServi gestorReportesServi;
	 
	@RequestMapping("/reportes/reporte/cliente")
	public String reporteClientes(Model model) {
		model.addAttribute("cliente", new ReporteCliente());
		model.addAttribute("list", this.gestorReportesServi.reporteClientes());
		return "reporte_cliente";
	}
	
	@GetMapping("/reportes/reporte/reserva")
	public String reporteReservasInicial(Model model) {
		model.addAttribute("reserva", new ReporteReservas());
		return "reporte_reserva";
	}
	
	@PostMapping("/reportes/reporte/reserva/resultado")
	public String reporteReservas(@RequestParam(value = "fecha-inicio") String fechaInicio, @RequestParam(value = "fecha-fin") String fechaFin, Model model) {
		model.addAttribute("list", this.gestorReportesServi.reporteReservas(LocalDateTime.parse(fechaInicio), LocalDateTime.parse(fechaFin)));
		return "reporte_reserva";
	}
	
	@GetMapping("/reportes/reporte/vehiculo")
	public String reporteVehiculosInicial(Model model) {
		model.addAttribute("vehiculo", new ReporteVehiculo());
		return "reporte_vehiculo";
	}
	
	@PostMapping("/reportes/reporte/vehiculo/resultado")
	public String reporteVehiculos(@RequestParam(value = "mes") String mes, @RequestParam(value = "anio") String anio, Model model) {
		model.addAttribute("list", this.gestorReportesServi.reporteVehiculos(Integer.parseInt(mes), Integer.parseInt(anio)));
		return "reporte_vehiculo";
	}
}
