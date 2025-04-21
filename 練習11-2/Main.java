public class Main {
    public static void main(String[] args) {
        Computer c = new Computer("ゲーミングPC", 200000, "White", "ドスパラ");
        Book b = new Book("ゆるストイック", 1600, "White", "9784478120729");
        System.out.println(c.name);
        System.out.println(c.price);
        System.out.println(c.color);
        System.out.println(c.makerName);
        System.out.println(b.name);
        System.out.println(b.price);
        System.out.println(b.color);
        System.out.println(b.isbn);
    }
}