import java.util.Scanner;

public abstract class Asset implements Thing{
    Scanner scanner = new Scanner(System.in);
    double weight;
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
    public double setWeight(){
        System.out.print(this.name + "の重さを入力(kg):");
        this.weight = scanner.nextDouble();
        return this.weight;
    }
    public double getWeight(){return this.weight;}
}