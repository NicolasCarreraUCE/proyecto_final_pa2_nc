package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Registro;
import ec.edu.uce.modelo.ReporteCliente;
import ec.edu.uce.modelo.ReporteReservas;
import ec.edu.uce.modelo.ReporteVehiculo;
import ec.edu.uce.modelo.Reserva;
import ec.edu.uce.modelo.TargetaCredito;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoReservado;
import ec.edu.uce.repository.IRegistroRepo;
import ec.edu.uce.repository.IReporteVehiculoRepo;
import ec.edu.uce.service.IClienteServi;
import ec.edu.uce.service.IGestorClienteServi;
import ec.edu.uce.service.IGestorReportesServi;
import ec.edu.uce.service.IRegistroServi;
import ec.edu.uce.service.IReservaServi;
import ec.edu.uce.service.ITargetaCreditoServi;
import ec.edu.uce.service.IVehiculoReservadoServi;
import ec.edu.uce.service.IVehiculoServi;

@SpringBootApplication
public class ProyectoFinalNcApplication implements CommandLineRunner {

	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IRegistroServi registroServi;
	
	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Autowired
	private IReservaServi reservaServi;
	
	@Autowired
	private ITargetaCreditoServi targetaCreditoServi;
	
	@Autowired
	private IGestorReportesServi gestorReportesServi;
	
	@Autowired
	private IReporteVehiculoRepo reporteVehiculoRepo;
	
	@Autowired
	private IGestorClienteServi gestorClienteServi;
	
	@Autowired
	private IVehiculoReservadoServi vehiculoReservadoServi;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Cliente c1 = new Cliente();
//		c1.setCedula("1727450684");
//		c1.setNombre("Nicolas");
//		c1.setApellido("Carrera");
//		c1.setFechaNacimiento(LocalDateTime.of(1998, 12, 23, 0, 0));
//		c1.setGenero('M');
//		c1.setRegistro('C'); //
//		
//		TargetaCredito t1 = new TargetaCredito();
//		t1.setCliente(c1);
//		t1.setNumeroTargeta("123456789");
//		t1.setFechaVencimiento(LocalDateTime.of(2026, 01, 1, 0, 0));
//		
//		Reserva r1 = new Reserva();
//		r1.setNumeroReserva("123");
//		r1.setFechaInicio(LocalDateTime.of(2022, 3, 31, 0, 0));
//		r1.setFechaFin(LocalDateTime.of(2022, 4, 15, 0, 0));
//		r1.setEstado('D'); //
//		r1.setCliente(c1);
//		
//		List<Reserva> lr = new ArrayList<>();
//		lr.add(r1);
//		
//		c1.setReservas(lr);
//		
//		List<TargetaCredito> lt = new ArrayList<>();
//		lt.add(t1);
//		c1.setTargetaCredito(lt);
//		
//		
//		
//		Registro rg1 = new Registro();
//		rg1.setValorSubtotal(new BigDecimal("100"));
//		rg1.setValorICE(new BigDecimal("15"));
//		rg1.setValorTotal(new BigDecimal("115"));
//		rg1.setFechaCobro(LocalDateTime.of(2022, 3, 31, 0, 0));
//		
//		rg1.setReserva(r1);
//		
//		r1.setRegistro(rg1);
//		
//		t1.setRegistro(rg1);
//		r1.setRegistro(rg1);
//		
//		
//		
//		Vehiculo v1 = new Vehiculo();
//		v1.setPlaca("ACD-100");
//		v1.setModelo("COROLLA");
//		v1.setMarca("TOYOTA");
//		v1.setAnioFabricacion(2020);
//		v1.setPaisFabricacion("China");
//		v1.setCilindraje("300CBB");
//		v1.setAvaluo(new BigDecimal("1000000"));
//		v1.setValorPorDia(new BigDecimal("50"));
//		
//		v1.setReservas(lr);
//		
//		//r1.setVehiculo(v1);
//		
//		//this.reservaServi.insertarReserva(r1);
//		
//		//this.vehiculoServi.insertarVehiculo(v1);
//		//this.clienteServi.insertarCliente(c1);
//		
//		//this.targetaCreditoServi.insertarTargetaCredito(t1);
//		
//		---
//		
//		//this.registroServi.insertarRegistro(rg1);
//		
//		//this.clienteServi.insertarCliente(c1);
//		
//		
//		
////		List<ReporteVehiculo> lista = repo.reporteVehiculo(1, 1);
//		for(ReporteReservas r : lista) {
//			System.out.println(r);
//		}
		
//		List<ReporteCliente> lista1 = this.gestorReportesServi.reporteClientes();
//		
//		for(ReporteCliente r : lista1) {
//			System.out.println(r);
//		}
//		List<ReporteVehiculo> list = this.reporteVehiculoRepo.reporteVehiculo();
//
//		for(ReporteVehiculo r : list) {
//			System.out.println(r);
//		}
		
//		this.gestorClienteServi.reservarVehiculo("OMG-234", "123", LocalDateTime.of(2022, 4, 16, 0, 0), LocalDateTime.of(2022, 5, 14, 0, 0)); no funciona
		
//		System.out.println(this.vehiculoReservadoServi.buscarPorNumeroDeReserva("123").toString());
		
	}

}
