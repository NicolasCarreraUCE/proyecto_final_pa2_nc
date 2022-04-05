package ec.edu.uce;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Registro;
import ec.edu.uce.modelo.ReporteCliente;
import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.ReporteVehiculo;
import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.TargetaCredito;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.service.IClienteServi;
import ec.edu.uce.service.IGestorReportesServi;
import ec.edu.uce.service.IRegistroServi;
import ec.edu.uce.service.IReservaServi;
import ec.edu.uce.service.ITargetaCreditoServi;
import ec.edu.uce.service.IVehiculoReservadoServi;
import ec.edu.uce.service.IVehiculoServi;

@SpringBootTest
class ProyectoFinalNcApplicationTests {

	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IReservaServi reservaServi;
	
	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Autowired
	private ITargetaCreditoServi targetaCreditoServi;
	
	@Autowired
	private IVehiculoReservadoServi vehiculoReservadoServi;
	
	@Autowired
	private IGestorReportesServi gestorReportesServi;
	
	@Autowired
	private IRegistroServi registroServi;
	
	@Test
	void cliente() {
		Cliente cliente = this.clienteServi.buscarCliente(1);
		assertNotNull(cliente);
	}
	
	@Test
	void reserva() {
		Reserva reserva = this.reservaServi.buscarReserva(1);
		assertNotNull(reserva);
	}
	
	@Test
	void vehiculo() {
		Vehiculo vehiculo = this.vehiculoServi.buscarVehiculo(1);
		assertNotNull(vehiculo);
	}
	
	@Test
	void targetaCredito() {
		TargetaCredito targetaCredito = this.targetaCreditoServi.buscarTargetaCredito(1);
		assertNotNull(targetaCredito);
	}
	
	@Test
	void registro() {
		Registro registro = this.registroServi.buscarRegistro(1);
		assertNotNull(registro);
	}
	
	@Test
	void reporteReserva() {
		List<ReporteReservas> lista = this.gestorReportesServi.reporteReservas(LocalDateTime.of(2022, 3, 15, 0, 0), LocalDateTime.of(2022, 12, 15, 0, 0));
		assertNotNull(lista);
	}
	
	@Test 
	void reporteVehiculo() {
		List<ReporteVehiculo> lista = this.gestorReportesServi.reporteVehiculos(1, 2023);
		assertNotNull(lista);
	}
	
	@Test
	void reporteCliente() {
		List<ReporteCliente> lista = this.gestorReportesServi.reporteClientes();
		assertNotNull(lista);
	}
	
	@Test
	void buscarPorNumeroDeReserva() {
		assertNotNull(this.vehiculoReservadoServi.buscarPorNumeroDeReserva("123"));
	}
	@Test
	void contextLoads() {
	}

}
