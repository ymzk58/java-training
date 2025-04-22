public class Main {
    public static void main(String[] args){
        Character[] c = new Character[5];
        c[0] = new Hero("ミナト",100,20);
        c[1] = new Hero("川崎Drift", 110, 50);
        c[2] = new Thief("盗賊X", 20, 40);
        c[3] = new Wizard("GO!", 20, 20);
        c[4] = new Wizard("EMINEM", 1000, 1000);
        //冒険開始
        //まず宿屋に泊まる
        for(Character ch : c){
            ch.hp += 50;
        }
    }
}