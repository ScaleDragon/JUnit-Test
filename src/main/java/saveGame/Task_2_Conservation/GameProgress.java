package saveGame.Task_2_Conservation;

import java.io.Serializable;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }
        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }
        GameProgress quest=(GameProgress) obj;
        return health==quest.health && weapons== quest.weapons
                && lvl== quest.lvl && distance== quest.distance;
    }

    @Override
    public int hashCode() {
       int total=88;
       total= (int) (total*88+ (health+ weapons)+(distance/lvl));
        return total;
    }
}
