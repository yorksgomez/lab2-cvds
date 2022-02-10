package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

	/**
	calcular la tarifa de cada billete según el trayecto, la antelación
	en la que se obtiene el billete y la edad del pasajero, de acuerdo
	con la normativa 005.
	@param tarifaBase valor base del vuelo
	@param diasAntelacion dias de antelación del vuelo
	@param edad - edad del pasajero
	@throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
	**/
	public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
	**/

	@Test
    public void validateRegistryResult() {

        Person person = new Person("kevin", 1, 18, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

}
