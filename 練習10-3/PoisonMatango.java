public class PoisonMatango extends Matango{
    int poisonLeft;
    int poisonDamage;

    public PoisonMatango(char suffix){
        super(suffix);
        this.poisonLeft = 5;
        this.poisonDamage = 0;
    }
    public void attack(Hero h){
        super.attack(h);
        if(this.poisonLeft > 0){
            System.out.println("さらに胞子をばらまいた!");
            this.poisonDamage = (h.hp/5);
            h.hp -= this.poisonDamage;
            System.out.println(this.poisonDamage + "ポイントのダメージ!");
            this.poisonLeft--;
        }
    }
}