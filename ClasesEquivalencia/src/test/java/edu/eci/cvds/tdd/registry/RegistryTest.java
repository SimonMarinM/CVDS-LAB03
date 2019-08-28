package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
	

    private Registry registry;
    @Test
    public void pruebaEdadInvalida(){
        registry = new Registry();
        Person person1 = new Person("Juanor Mejia", 1,0, Gender.MALE, true); //limite inferior
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person2 = new Person("Daiana Garcia", 2,-1, Gender.FEMALE, true);
        result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person person3 = new Person("Rigoberto Arias",3,1,Gender.MALE,true);
        result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person4 = new Person("Rigoberto Uran", 4,125, Gender.MALE, true); //limite superior
        result = registry.registerVoter(person4);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person5 = new Person("Alejandro Bohorquez", 5,126, Gender.MALE, true);
        result = registry.registerVoter(person5);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person person6 = new Person("Natalia Marin", 6,124, Gender.FEMALE, true);
        result = registry.registerVoter(person6);
        Assert.assertEquals(RegisterResult.VALID,result);
        
    }
    @Test
    public void pruebaMenorEdad(){
        registry = new Registry();
        Person person1 = new Person("Juanor Mejia", 1,18, Gender.MALE, true);//limite superior
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person2 = new Person("Daiana Garcia", 2,0, Gender.FEMALE, true); //limite inferior
        result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person3 = new Person("Rigoberto Uran", 3,17, Gender.MALE, true);
        result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person4 = new Person("Alejandro Bohorquez", 4,19, Gender.MALE, true);
        result = registry.registerVoter(person4);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person5 = new Person("Natalia Marin", 5,1, Gender.FEMALE, true);
        result = registry.registerVoter(person5);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person6 = new Person("Simon Duran", 6,-1, Gender.FEMALE, true);
        result = registry.registerVoter(person6);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
    }
    @Test
    public void pruebaMuerto(){
        registry = new Registry();
        Person person1 = new Person("Juanor Mejia", 1,18, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.DEAD,result);
        Person person2 = new Person("Daiana Garcia", 2,125, Gender.FEMALE, false); 
        result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DEAD,result);
        Person person3 = new Person("Sergio Bohorquez", 3,18, Gender.MALE, true); 
        result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person4 = new Person("Andres Amador", 4,125, Gender.MALE, true); 
        result = registry.registerVoter(person4);
        Assert.assertEquals(RegisterResult.VALID,result);       
        
    }
    @Test
    public void pruebaDuplicado(){
        registry = new Registry();
        Person person1 = new Person("Juanor Mejia", 1,18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person2 = new Person("Juanor Mejia", 1,19, Gender.MALE, true);
        result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED,result);
        Person person3 = new Person("Diego Muñoz", 2,125, Gender.MALE, true);
        result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person4 = new Person("Diego Muñoz", 2,124, Gender.MALE, true);
        result = registry.registerVoter(person4);
        Assert.assertEquals(RegisterResult.DUPLICATED,result);       
    }
    @Test
    public void pruebaNoName(){
       registry = new Registry();
       Person person1 = new Person("", 1,18, Gender.MALE, true);
       RegisterResult result = registry.registerVoter(person1);  
       Person person2 = new Person(null, 2,19, Gender.MALE, true);
       result = registry.registerVoter(person2);
       Assert.assertEquals(RegisterResult.NO_NAME,result);
       Person person3 = new Person("Hola Mundo", 3,125, Gender.MALE, true);
       result = registry.registerVoter(person3);
       Assert.assertEquals(RegisterResult.VALID,result); 
       Person person4 = new Person("Hola Mundo", 4,124, Gender.MALE, true);
       result = registry.registerVoter(person4);
       Assert.assertEquals(RegisterResult.VALID,result);  
    }
    @Test
    public void pruebaValid(){
       registry = new Registry();
       Person person1 = new Person("Hola Mundo", 1,124, Gender.MALE, true);
       RegisterResult result = registry.registerVoter(person1);
       Assert.assertEquals(RegisterResult.VALID,result);   
       Person person2 = new Person("Natalia Marin", 2,125, Gender.FEMALE, true);
       result = registry.registerVoter(person2);
       Assert.assertEquals(RegisterResult.VALID,result);
       Person person3 = new Person("", 1,126, Gender.FEMALE, false);
       result = registry.registerVoter(person2);
       Assert.assertEquals(RegisterResult.DUPLICATED,result);      
       Person person4 = new Person("", 4,-1, Gender.FEMALE, false);
       result = registry.registerVoter(person4);
       Assert.assertEquals(RegisterResult.INVALID_AGE,result);
       Person person5 = new Person("", 4,0, Gender.FEMALE, false);
       result = registry.registerVoter(person5);
       Assert.assertEquals(RegisterResult.UNDERAGE,result);
       Person person6 = new Person("",5,19, Gender.FEMALE, false);
       result = registry.registerVoter(person6);
       Assert.assertEquals(RegisterResult.DEAD,result);
       Person person7 = new Person("",5,19, Gender.FEMALE, true);
       result = registry.registerVoter(person7);
       Assert.assertEquals(RegisterResult.NO_NAME,result);       
    }
    // TODO Complete with more test cases

}