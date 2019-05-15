/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaVendedores;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
/**
 *
 * @author mac
 */
public class TestEliminarVendedor {
    
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {0,false},{1,false},{2,false},{5,true}
        });
    }
    
    Vendedores vend;
    int parametro;
    boolean esperado;
    
    public TestEliminarVendedor(int numvend, boolean esperado) {
         parametro=numvend;
         this.esperado=esperado;
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
     @Before
    public void setUp() {
        vend = new Vendedores();
        vend.anyadir_Vendedor(new Vendedor(0, "Vend1", "nomcom", "prov", "local", "direc"));
        vend.anyadir_Vendedor(new Vendedor(1, "Vend2", "nomcom", "prov", "local", "direc"));
        vend.anyadir_Vendedor(new Vendedor(2, "Vend3", "nomcom", "prov", "local", "direc"));
        vend.anyadir_Vendedor(new Vendedor(3, "Vend4", "nomcom", "prov", "local", "direc"));
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of eliminar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testEliminar_Vendedor() {
        System.out.println("eliminar_Vendedor");
        boolean result = vend.eliminar_Vendedor(parametro);
        Assert.assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
