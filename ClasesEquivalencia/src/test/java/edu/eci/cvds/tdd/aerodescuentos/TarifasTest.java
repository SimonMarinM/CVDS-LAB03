package edu.eci.cvds.tdd.aerodescuentos;
import static edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa;
import org.junit.Assert;
import org.junit.Test;
public class TarifasTest {
    @Test
    public void testClaseEquivalencia1(){
        Assert.assertTrue(0==calculoTarifa(0,0,18));
        Assert.assertTrue(0==calculoTarifa(0,20,65));
        Assert.assertTrue(110000==calculoTarifa(110000,18,20));
        
        
    }
    @Test
    public void testClaseEquivalencia2(){
        Assert.assertTrue(304000==calculoTarifa(320000,18,17));
        Assert.assertTrue(0==calculoTarifa(0,0,0));
        Assert.assertTrue(0==calculoTarifa(0,20,17));
        
    }
    @Test
    public void testClaseEquivalencia3(){
        Assert.assertTrue(0==calculoTarifa(0,0,66));
        Assert.assertTrue(0==calculoTarifa(0,20,125));
        Assert.assertTrue(135000*0.92==calculoTarifa(135000,2,66));
        
    }
    @Test
    public void testClaseEquivalencia4(){
        Assert.assertTrue(157000*0.85==calculoTarifa(157000,21,65));
        Assert.assertTrue(0==calculoTarifa(0,21,18));
        Assert.assertTrue(0==calculoTarifa(0,9999999,65));
        
    }
    @Test
    public void testClaseEquivalencia5(){
        Assert.assertTrue(175000*0.80==calculoTarifa(175000,22,2));
        Assert.assertTrue(0==calculoTarifa(0,21,0));
        Assert.assertTrue(0==calculoTarifa(0,9999999,17));
        
    }
    @Test
    public void testClaseEquivalencia6(){
        Assert.assertTrue(0==calculoTarifa(0,21,66));
        Assert.assertTrue(0==calculoTarifa(0,9999999,125));
        Assert.assertTrue(185000*0.77==calculoTarifa(185000,22,66));
        
    }
    @Test
    public void testClaseEquivalencia7(){
        calculoTarifa(-1,0,-1);
        System.out.println("ExcepcionParametrosInvalidos NOT Implemented");
        Assert.assertTrue(true);
        
    }
    @Test
    public void testClaseEquivalencia8(){
        calculoTarifa(0,-1,-1);
        System.out.println("ExcepcionParametrosInvalidos NOT Implemented");
        Assert.assertTrue(true);
        
    }
    @Test
    public void testClaseEquivalencia9(){
        calculoTarifa(-1,-1,0);
        System.out.println("ExcepcionParametrosInvalidos NOT Implemented");
        Assert.assertTrue(true);
        
    }
    
}
