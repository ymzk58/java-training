public class Wand {
    private String name;
    private double power;

    //getter
    public String getName() {
        return this.name;
    }
    public double getPower(){
        return this.power;
    }

    //setter
    public void setName(String name) {
        if(name.length() < 3){
            throw new IllegalArgumentException
            ("3文字以上!!!!!");
        }

        this.name = name;
    }
    public void setPower(double power){
        if(power < 0.5){
            throw new IllegalArgumentException
            ("弱すぎ!! 0.5以上");
        }
        if(power > 100){
            throw new IllegalArgumentException
            ("強すぎ!! 100以下");
        }
        this.power = power;
    }
}