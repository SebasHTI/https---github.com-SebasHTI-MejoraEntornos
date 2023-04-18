package Aplicacion;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {

	private List<Double> listadoTemperaturas;
	
	
	public EstacionMeteorologica() {
		listadoTemperaturas = new ArrayList<>();
	}
	
	public void addTemperatura(Double temperatura) throws Exception {	
		if(temperatura < -75 || temperatura > 75) {
			throw new Exception("Temperatura incorrecta");
		}else {
			listadoTemperaturas.add(temperatura);
		}
	}
	
	public Double mediaTemperaturas() throws Exception {
		if(listadoTemperaturas.isEmpty()) {
			throw new Exception("No hay temperaturas");
		}else {
			Double total=0.0;
			for(Double temp : listadoTemperaturas) {
				total += temp;
			}
			return total/listadoTemperaturas.size();
		}
	}
	
	public Double temperaturaMaxima() throws Exception {
		if(listadoTemperaturas.isEmpty()) {
			throw new Exception("No hay temperaturas");
		}else {
			Double maximo = Double.MIN_VALUE;
			for(Double temp : listadoTemperaturas) {
				if(temp > maximo) {
					maximo = temp;
				}
			}
			return maximo;
		}
	}
	
}
