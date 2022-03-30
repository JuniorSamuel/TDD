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
public class VasoTest { 

    @Test
    public void deberiaDevolverVerdaderoSiExistenVasos(){
        Vaso vasosPequenos =new Vaso(2,10);
        
        assertEquals(true, vasosPequenos.hasVasos(1));
    }
    
    @Test
    public void deberiaDevolverFalsoSiNoExistenVasos(){
        Vaso vasosPequenos =new Vaso(1,10);
        
        assertEquals(false, vasosPequenos.hasVasos(2));
    }
    
    @Test
    public void deberiaRestarCantidadDeVasos(){
        Vaso vasosPequenos = new Vaso(5,10);
        vasosPequenos.giveVasos(1);
        assertEquals(4, vasosPequenos.getCantidadVasos());
    }
}
