/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Utilidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import utilidades.Utilidades;

/**
 *
 * @author fer
 */
public class TestUtilidades {
    
    public TestUtilidades() {
    }
 /**
  * Test para metodo validar fecha
  */   
    @Test
    public void validaFecha(){
        assert Utilidades.validaFecha(3);
        assert Utilidades.validaFecha(1000);
        assert Utilidades.validaFecha(2020);
        assert Utilidades.validaFecha(234);
        assert !Utilidades.validaFecha(2021);
        assert !Utilidades.validaFecha(3000);
    }
/**
 * Test para metodo validar INT
 */        
    @Test
    public void validaInt(){
        assertEquals (3,Utilidades.validaInt("3"));
        assertEquals (12,Utilidades.validaInt("12"));
        assertEquals (1234,Utilidades.validaInt("1234"));
    }
/**
 * Test para validar String ERROR
 */    
    @Test
    public void validaString2(){  
        assert Utilidades.validaString2("aaksjhf");
        assert !Utilidades.validaString2("aa43sjhf");
        assert !Utilidades.validaString2("asdfasdf2");
        assert !Utilidades.validaString2("2343aak3464643sjhf");
        assert !Utilidades.validaString2("2343aak3464643sjhf34643646");
        assert !Utilidades.validaString2("3469646");
        assert !Utilidades.validaString2("asfaffsdgg093480498");
        assert !Utilidades.validaString2("23525352akskjhff");
    }
/**
 * Metodo para valisar String BIEN
 */    
    @Test
    public void validaString(){
        assert Utilidades.validaString("aaksjhf");
        assert !Utilidades.validaString("asdfasdf2");
        assert !Utilidades.validaString("aak3464643sjhf");
        assert !Utilidades.validaString("2343aak3464643sjhf34643646");
        assert !Utilidades.validaString("3469646");
        assert !Utilidades.validaString("asfaffsdgg093480498");
        assert !Utilidades.validaString("23525352akskjhff");
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
}
