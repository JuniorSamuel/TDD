/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model.Dto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junior S. De Los Santos V.
 */
public class CafeteraTest {
    
    public CafeteraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void deberiaDevolverVerdaderoSiExisteCafe(){
        Cafetera cafetera = new Cafetera(10);
        assertEquals(true, cafetera.hasCafe(5));
    }
    
    @Test
    public void deberiaDevolverFalseSiNoExisteCafe(){
        Cafetera cafetera = new Cafetera(10);
        assertEquals(false, cafetera.hasCafe(11));
    }
    
    @Test
    public void deberiaRestarCafeAlaCafetera(){
        Cafetera cafetera = new Cafetera(10);
        cafetera.giveCafe(7);
        assertEquals(3, cafetera.getCantidadDeCafe());
    }
}
