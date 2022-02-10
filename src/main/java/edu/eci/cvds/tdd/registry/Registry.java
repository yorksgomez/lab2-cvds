package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

	private ArrayList<Person> persons;

	public Registry() {
		persons = new ArrayList<>();
	}

    public RegisterResult registerVoter(Person p) {

		if(p.getAge() < 18) {
			return RegisterResult.UNDERAGE;
		}
		
		if(p.getAge() > 150) {
			return RegisterResult.INVALID_AGE;
		}
		
		if(!p.isAlive()) {
			return RegisterResult.DEAD;
		}
		
		if(persons.contains(p)) {
			return RegisterResult.DUPLICATED;
		}

        // TODO Validate person and return real result.
        persons.add(p);
        return RegisterResult.VALID;
    }
}
