public class Main {
    public static void main(String[] args) {
        Y[] alphaY = new Y[2];
        alphaY[0] = new A();
        alphaY[1] = new B();
        for(Y yyy : alphaY){
            yyy.b();
        }
    }
}
