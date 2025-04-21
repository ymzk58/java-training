public class Cleric{
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 10;

    public void selfAid(){
        this.mp -= 5;
        this.hp = MAX_HP;
    }
}