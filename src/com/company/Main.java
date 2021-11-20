package com.company;

public class Main {

    public static void main(String[] args) {
        Dunno Незнайка = new Dunno();
        Gunky Гунька = new Gunky();
        ZeroGravity Невесомость = new ZeroGravity();
        Dumbness Глупость = new Dumbness();
        Fight Драка = new Fight();
        Shortmen Коротышки = new Shortmen();

        System.out.println(Незнайка.beSure(Невесомость));
        System.out.println(Незнайка.go());
        System.out.println(Незнайка.tellStory());
        System.out.println(Коротышки.getMessage(Незнайка));
        System.out.println(Незнайка.beAngry());
        System.out.println(Незнайка.tell(Гунька, Невесомость));
        System.out.println(Гунька.say(Глупость, Невесомость));
        System.out.println(Незнайка.fatality(Гунька));
        System.out.println(Гунька.fatality(Незнайка));
        System.out.println(Драка.getMessage(Гунька));
        System.out.println(Драка.resultsFight(Гунька, Незнайка));

    }
}
