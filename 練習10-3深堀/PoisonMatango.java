public class PoisonMatango extends Matango{
    int poisonLeft;

    public PoisonMatango(char suffix){
        super(suffix);
        this.poisonLeft = 5;
    }

    public void attack(Hero h){
        super.attack(h);
        if(this.poisonLeft > 0){
            h.hp -= (h.hp / 5);
            poisonLeft--;
        }
    }
}