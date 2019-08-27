package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
	

    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void pruebaEdadInvalida(){
        Person person1 = new Person("Juanor Mejia", 1,0, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person person2 = new Person("Daiana Garcia", 2,-1, Gender.FEMALE, true);
        result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person person3 = new Person("Rigoberto Uran", 3,125, Gender.MALE, true);
        result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person person4 = new Person("Alejandro Bohorquez", 1,126, Gender.MALE, true);
        result = registry.registerVoter(person4);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person person5 = new Person("Simon Duran", 4,2, Gender.MALE, true);
        result = registry.registerVoter(person5);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person6 = new Person("Natalia Marin", 5,124, Gender.FEMALE, true);
        result = registry.registerVoter(person6);
        Assert.assertEquals(RegisterResult.VALID,result);
    }
    @Test
    public void pruebaMenorEdad(){
        Person person1 = new Person("Juanor Mejia", 1,18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person2 = new Person("Daiana Garcia", 2,0, Gender.FEMALE, true);
        result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person3 = new Person("Rigoberto Uran", 3,17, Gender.MALE, true);
        result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person person4 = new Person("Alejandro Bohorquez", 1,19, Gender.MALE, true);
        result = registry.registerVoter(person4);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person person5 = new Person("Natalia Marin", 5,1, Gender.FEMALE, true);
        result = registry.registerVoter(person5);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
    }
    
    // TODO Complete with more test cases

}