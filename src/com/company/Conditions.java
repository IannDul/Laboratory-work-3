package com.company;

public interface Conditions {
    String happen();
    String getName();
}

class Dumbness implements Conditions {
    private String name = "Глупость";
    @Override
    public String happen() {
        return "состояние " + name + " случилось";
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return  "Dumbness [ name = " + name +" ]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Conditions condition = (Conditions) o;
        return getName().equals(condition.getName());
    }
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode() * 127;

    }
}

class ZeroGravity implements Conditions {
    private String name = "Невесомость";

    @Override
    public String happen() {
        return "состояние " + name + " случилось";
    }

    @Override
    public String getName() {
        return name;
    }
    public String disappear() {
        return name + " пропала и больше не появлялась";
    }

    @Override
    public String toString() {
        return  "ZeroGravity [ name = " + name +" ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Conditions condition = (Conditions) o;
        return getName().equals(condition.getName());
    }
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode() * 127;

    }
}