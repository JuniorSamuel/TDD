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
public class MaquinaDeCafeTest {
    
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;
    
    public MaquinaDeCafeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cafetera = new Cafetera(50);
        vasosPequeno = new Vaso(5,10);
        vasosMediano = new Vaso(5,20);
        vasosGrande = new Vaso(5,30);
        azucarero = new Azucarero(20);
        
        maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasosPequeno(vasosPequeno);
        maquinaDeCafe.setVasosMediano(vasosMediano);
        maquinaDeCafe.setVasosGrande(vasosGrande);
        maquinaDeCafe.setAzucarero(azucarero);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deberiaDevolverUnVasoPequeno(){
       Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
       assertEquals(maquinaDeCafe.getVasoPequeno(), vaso);
    }
    
    @Test
    public void deberiaDevolverUnVasoMediano(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
        assertEquals(maquinaDeCafe.getVasoMediano(), vaso);
    }
    
    @Test
    public void deberiaDevolverUnVasoGrande(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
        assertEquals(maquinaDeCafe.getVasoGrande(), vaso);
    }
    
    @Test
    public void deberiaDevolverNoHayVasos(){
        Vaso vaso= maquinaDeCafe.getTipoVaso("pequeno");
        assertEquals("No hay Vasos", maquinaDeCafe.getVasoDeCafe(vaso, 10, 2));
    }
    
    @Test
    public void deberiaDevolverNoHayCafe(){
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafetera(cafetera);
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        
        assertEquals("No hay Cafe", maquinaDeCafe.getVasoDeCafe(vaso, 6, 2));
    }
    
    @Test
    public void deberiaDevolverNoHayAzucar(){
        azucarero = new Azucarero(2);
        maquinaDeCafe.setAzucarero(azucarero);
        
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        
        assertEquals("No hay Azucar", maquinaDeCafe.getVasoDeCafe(vaso, 1, 3));
    }
    
    @Test
    public void deberiaRestarCafe(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
        
        assertEquals(40, maquinaDeCafe.getCafetera().getCantidadDeCafe());
    }
    
    @Test
    public void deberiaRestarVaso(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
        assertEquals(4, maquinaDeCafe.getVasoPequeno().getCantidadVasos());
    }
    
    @Test
    public void deberiaRestarAzucar(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
        assertEquals(17, maquinaDeCafe.getAzucarero().getCantidadDeAzucar());
    }
    
    @Test
    public void deberiaDevolverFelicitaciones(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        
        assertEquals("Felicitaciones", maquinaDeCafe.getVasoDeCafe(vaso, 1, 3));
    }
}
