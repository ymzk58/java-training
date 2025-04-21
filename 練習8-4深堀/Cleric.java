import java.util.Random;

public class Cleric{
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 10;
    Random random = new Random();

    public void selfAid(){
        this.mp -= 5;
        this.hp = MAX_HP;
    }

    public int pray(int prayTime){
        int healPt = prayTime + random.nextInt(3);
        int realHealPt = Math.min(this.MAX_MP-this.mp, healPt);
        return realHealPt;
    }
}