package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
	private ArrayList<Person>personas;
	public Registry() {
		personas = new ArrayList<Person>();
	}
    public RegisterResult registerVoter(Person p) {
    	
        // Invalid age
        if (p.getAge()<0 || p.getAge()>125) {
        	return RegisterResult.INVALID_AGE;
        }
        else if( p.getAge() < 18 & p.getAge() >= 0) {
        	return RegisterResult.UNDERAGE;
        }
        else if(!p.isAlive() & p.getAge() >= 0 & p.getAge() < 125) {
        	return RegisterResult.DEAD;
        }
        else if(personas.contains(p)) {
        	return RegisterResult.DUPLICATED;
        }
        else if(p.getName().equals(null) & p.getAge() >= 0 & p.getAge() <=125) {
        	return RegisterResult.NO_NAME;
        }
        else{
        	personas.add(p);
        	return RegisterResult.VALID;
        }
    }
}