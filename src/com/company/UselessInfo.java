package com.company;

public interface UselessInfo {
    String getMessage(Humans human);
    String getName();
}

class Shortmen implements UselessInfo {
    String name = "Коротышки";

    @Override
    public String getMessage(Humans human) {
        return name + " не верили рассказам, потому что " + human.name + " мастер присочинить";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UselessInfo info = (UselessInfo) o;
        return name.equals(info.getName());
    }
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode() * 127;
    }

}

class Fight implements UselessInfo {
    String name = "Драка";
    @Override
    public String getMessage(Humans human) {
        return  "получилась " + name;
    }
    public String resultsFight(Humans human1, Humans human2){
        if (human1.result == FightResult.winner) {
            return "в " + name + " победил " + human1.name;
        }
        else {
            return "в " + name + " победил " + human2.name;
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UselessInfo info = (UselessInfo) o;
        return name.equals(info.getName());
    }
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode() * 127;
    }

}