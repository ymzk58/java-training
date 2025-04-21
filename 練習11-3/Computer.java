public class Computer extends TangibleAsset {
    String makerName;
    //コンストラクタ
    public Computer(String name, int price, String color, String makerName){
        super(name, price, color);
        this.makerName = makerName;
    }
    //getメソッド
    public String getMakerName(){return this.makerName;}
}