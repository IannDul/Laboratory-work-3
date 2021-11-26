package com.company;

public abstract class Humans {
    protected String name;
    FightResult result;
    protected String fatality(Humans target) {
        return name + " отвесил хорошенького тумака " + target.name;
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
        Humans human = (Humans) o;
        return name.equals(human.name) && result == human.result;
    }

    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode() * 127 * result.getId();
    }

}

class Dunno extends Humans {
    {
        name = "Незнайка";
        result = FightResult.loser;
    }
    public String beSure(ZeroGravity zeroGravity) {
        return name + " убедился, что " + zeroGravity.disappear();
    }
    public String go() {
        return name + " отправился гулять по городу";
    }
    public String tellStory() {
        return name + " рассказывал всем, что случилось";
    }
    public String beAngry() {
        return name + " страшно сердился из-за недоверия";
    }
    public String tell(Humans human, Conditions condition) {
        return name + " рассказал про " + condition.getName() + " " + human.name;
    }


}

class Gunky extends Humans {
    {
        name = "Гунька";
        result = FightResult.winner;
    }
    public String say(Conditions conditionFirst, Conditions conditionSecond) {
        return name + " сказал, что не " + conditionFirst.happen() + ", а " + conditionSecond.happen();
    }

    @Override
    protected String fatality(Humans target) {
        return name + " отвесил тумака " + target.name + " в ответ";
    }
}

enum FightResult{
    winner(127), loser(31);

    private final int ID;

    FightResult(int id) {
        this.ID = id;
    }

    public int getId() {
        return ID;
    }
}