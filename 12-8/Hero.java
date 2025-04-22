public class Hero extends Character{
    int mp;
    public final void slip(){
        this.hp -= 5;
        System.out.println("5のダメージ");
    }
    //戦う
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃!");
        m.hp -=5;
        System.out.println("5ポイントのダメージを与えた!");
    }
    public void attack(Goblin g){
        System.out.println(this.name + "の攻撃!");
        System.out.println("10ポイントのダメージを与えた!");
        g.hp -= 10;
    }
    //逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した!");
    }
    public Hero(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
    }
}