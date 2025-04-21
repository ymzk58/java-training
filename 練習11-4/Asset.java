import java.util.Scanner;

public abstract class Asset{
    Scanner scanner = new Scanner(System.in);
    String name;
    int price;
    //コンストラクタ
    public Asset(String name, int price){
        this.name = name;
        this.price = price;
    }
    //メソッド
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
}