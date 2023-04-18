package Aplicacion;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {

	private List<Double> listadoTemperaturas;
	/**
	 * Se añaden las temperaturas a la funcion
	 * @param temperatura
	 * @throws Exception
	 */
	public void addTemperatura(Double temperatura) throws Exception {	
		if(temperatura < -75 || temperatura > 75) {
			throw new Exception("Temperatura incorrecta");
		}else {
			listadoTemperaturas.add(temperatura);
		}
	}
	/**
	 * Se calcula la media que tiene las temperaturas ena funcion
	 * @return total
	 * @throws Exception
	 */
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
	
	/**
	 * Se calcula la temperatura maxima que tiene en la funcion
	 * @return maximo
	 * @throws Exception
	 */
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
