public abstract class TangibleAsset extends Asset implements Thing {
    double weight;
    String color;

    //コンストラクタ
    public TangibleAsset(String name, int price, String color){
        super(name, price);
        this.color = color;
    }
    //getメソッド
    public String getColor(){return this.color;}
    public double setWeight(){
        System.out.print(this.name + "の重さを入力(kg):");
        this.weight = scanner.nextDouble();
        return this.weight;
    }
    public double getWeight(){return this.weight;}
}