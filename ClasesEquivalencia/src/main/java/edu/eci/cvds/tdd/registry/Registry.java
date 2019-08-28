package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
import java.util.HashMap;
public class Registry {
	private HashMap<Integer,Person> personas;
	public Registry() {
		personas = new HashMap<Integer,Person>();
	}
    public RegisterResult registerVoter(Person p) {
    	
        // Invalid age
        if (p.getAge()<0 || p.getAge()>125) {
        	return RegisterResult.INVALID_AGE;
        }
        else if( p.getAge() < 18 & p.getAge() >= 0) {
        	return RegisterResult.UNDERAGE;
        }
        else if(!p.isAlive() & (p.getAge() >= 0 || p.getAge() < 125)) {
        	return RegisterResult.DEAD;
        }
        else if(personas.containsKey(p.getId())) {
        	return RegisterResult.DUPLICATED;
        }
        else if((p.getName()== null || p.getName().equals(""))  & (p.getAge() >= 0 || p.getAge() <=125)) {
        	return RegisterResult.NO_NAME;
        }
        else{
        	personas.put(p.getId(),p);
        	return RegisterResult.VALID;
        }
    }
}