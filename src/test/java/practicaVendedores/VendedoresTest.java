/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaVendedores;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mac
 */
public class VendedoresTest {
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of anyadir_Vendedor method, of class Vendedores.
     */
    @Test
    public void testAnyadir_Vendedor() {
        System.out.println("anyadir_Vendedor");
        Vendedor v = new Vendedor(1, "Vend1", "nomcomer", "prov", "local", "direc");
        Vendedores instance = new Vendedores();
        boolean expResult = true;
        boolean result = instance.anyadir_Vendedor(v);
        assertEquals(result, expResult);   
    }

    /**
     * Test of buscar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_Vendedor_int() {
        System.out.println("buscar_Vendedor");
        int numvend = 1;
        Vendedor expResult = new Vendedor(1, "Vend1", "nomcomer", "prov", "local", "direc");
        Vendedor v2 = new Vendedor(2, "Vend1", "nomcomer", "prov", "local", "direc");
        Vendedores instance = new Vendedores();
        instance.anyadir_Vendedor(expResult);
        instance.anyadir_Vendedor(v2);
        Vendedor result = instance.buscar_Vendedor(1);
        System.out.println(result);
        System.out.println(expResult);
        assertEquals(result, expResult);
    }
}
