/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaVendedores;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
/**
 *
 * @author mac
 */
public class TestBuscarVendedorString {
    
    Vendedores vend;
    String parametro;
    int resultado;
    
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {"Alicante",1},{"Murcia",0}
        });
    }
    
    public TestBuscarVendedorString(String parametro, int resultado) {
        this.parametro = parametro;
        this.resultado = resultado;
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
        vend.anyadir_Vendedor(new Vendedor(0, "Javi A", "nomcom", "Alicante", "Elche", "direc"));
        vend.anyadir_Vendedor(new Vendedor(1, "Javi B", "nomcom", "Valencia", "Cheste", "direc"));
    }
    
    @After
    public void tearDown() {       
    }

    /**
     * Test of buscar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_Vendedor_String() {
        System.out.println("buscar_Vendedor");
        ArrayList<Vendedor> result = vend.buscar_Vendedor(parametro);
        int b = result.size();
        Assert.assertEquals(resultado, b);
        // TODO review the generated test code and remove the default call to fail.
    }
}
