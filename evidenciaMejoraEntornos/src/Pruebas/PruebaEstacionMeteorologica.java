package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Aplicacion.EstacionMeteorologica;

class PruebaEstacionMeteorologica {

	EstacionMeteorologica estacion = new EstacionMeteorologica();
	
	@Test
	void test1() {
		assertThrows(Exception.class,()->estacion.mediaTemperaturas());
	}
	
	@Test
	void test2() throws Exception {
		estacion.addTemperatura(22.5);
		estacion.addTemperatura(25.0);
		assertThrows(Exception.class,()->estacion.mediaTemperaturas());
	}

	@Test
	void test3() throws Exception {
		estacion.addTemperatura(12.2);
		estacion.addTemperatura(6.3);
		estacion.addTemperatura(8.2);
		assertThrows(Exception.class,()->estacion.mediaTemperaturas());
	}

	@Test
	void test4() throws Exception {
		estacion.addTemperatura(100.0);
		assertThrows(Exception.class,()->estacion.mediaTemperaturas());
	}


}
