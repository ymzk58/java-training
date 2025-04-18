public class Hero {
    String name;
    int hp;
    //.........
    public void attack(){
        //........
    }
    public Hero(String name){
        this.hp = 100;
        this.name = name;
        System.out.println("コンストラクタが呼ばれた name:" + this.name);
    }
}