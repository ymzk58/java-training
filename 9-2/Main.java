public class Main {
    public static void main(String[] args) {
        Hero h1;
        h1 = new Hero();
        h1.hp = 100;
        Hero h2;
        h2.hp = h1;
        System.out.println(h1.hp);
    }
}