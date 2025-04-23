public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した!");
    }
    //getter
    public int getHp(){
        return this.hp;
    }
    public int getMp(){
        return this.mp;
    }
    public String getName(){
        return this.name;
    }
    //setter
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }
    public void setName(String name){
        this.name = name;
    }
}