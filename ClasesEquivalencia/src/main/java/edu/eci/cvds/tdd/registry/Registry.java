package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge() < 0) {
            return RegisterResult.INVALID_AGE;
        }
        if (p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        }
        if (!p.isAlive()) {
            return RegisterResult.DEAD;
        }
        return RegisterResult.VALID;
    }
}
