public class Main {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Character c = new Wizard();
        Matango m = new Matango();
        c.name = "アカギ";
        c.attack(m);
        c.fireball(m);
    }
}