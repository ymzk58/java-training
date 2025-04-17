public class Cleric {
    String name = "";
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid(){
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println(this.name + "はセルフエイドを呼び出した");
        System.out.println("MPを5消費し、HPを全回復した");
        System.out.println("MP:" + this.mp + " HP:" + this.hp);
    }
}