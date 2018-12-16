/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHELSEA
 */
public class PruebaIT {
    
    public PruebaIT() {
    }
    
    

    /**
     * Test of main method, of class Prueba.
     */
    
    @Test
    public void mostrar_Suma5_Cuando2And3(){
        int expected=5;
        int actual=Prueba.suma(2,3);
        assertEquals(expected,actual);
    }
    
    
}
