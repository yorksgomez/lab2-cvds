package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {

	/**
	calcular la tarifa de cada billete según el trayecto, la antelación
	en la que se obtiene el billete y la edad del pasajero, de acuerdo
	con la normativa 005.
	@param tarifaBase valor base del vuelo
	@param diasAntelacion dias de antelación del vuelo
	@param edad - edad del pasajero
	@throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
	public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
	**/

	@Test
    public void validateTarifa() {
		long tarifaBase = 1000000;
		int[] dias = new int[]{5,5,5,21,21,21};
		int[] edades = new int[]{30,14,72,30,14,72};
		int[] descuentos = new int[]{0,5,8,15,20,23}; 
		CalculadorDescuentos calculador = new CalculadorDescuentos();
		
		
		for(int i = 0; i < 6; i++) {
			Assert.assertEquals(calculador.calculoTarifa(tarifaBase, dias[i], edades[i]),
		    ((double) tarifaBase) - ((double) tarifaBase) * (((double) descuentos[i]) / 100),
		    0.1);
		}
		
    }

}	
