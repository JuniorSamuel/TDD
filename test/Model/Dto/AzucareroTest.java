/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model.Dto;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junior S. De Los Santos V.
 */
public class AzucareroTest {
    
    Azucarero azuquero;

    @Before
    public void setUp() {
        azuquero = new Azucarero(10);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySufienteAzucarEnElAzucarero(){
       
        assertEquals(true, azuquero.hasAzucar(5));

        assertEquals(true, azuquero.hasAzucar(10));
    }
    
    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero(){
        boolean resultado = azuquero.hasAzucar(15);
        assertEquals(false, resultado);
    }
    
    @Test
    public void deberiaRestarAzucarAlAzuquero(){
        azuquero.giveAzucar(5);
        assertEquals(5, azuquero.getCantidadDeAzucar());
        
        azuquero.giveAzucar(2);
        assertEquals(3, azuquero.getCantidadDeAzucar());
    }
}
