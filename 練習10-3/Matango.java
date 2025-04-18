public class Matango {
    int hp = 0;
    char suffix;
    public Matango(char suffix){
        this.hp = 50;
        this.suffix = suffix;
    }
    public void attack(Hero h){
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}