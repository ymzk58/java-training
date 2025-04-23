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
    public Wand getWand(){
        return this.wand;
    }
    //setter
    public void setHp(int hp){
        if(hp <= 0){
            this.hp = 0;
            throw new IllegalArgumentException
            ("HP低すぎ!! 最低でも1以上");
        }
        this.hp = hp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWand(Wand wand){
        if(wand == null){
            throw new IllegalArgumentException
            ("wandがnullです!!");
        }
        this.wand = wand;
    }
}