public class Main {
    public static void main(String[] args) {
        // ヒーローを作成
        Hero hero = new Hero();
        hero.setName("リンク");
        hero.setHp(50);

        // 杖を作成
        Wand wand = new Wand();
        wand.setName("ホーリーワンド");
        wand.setPower(1.5);

        // 魔法使いを作成
        Wizard wizard = new Wizard();
        wizard.setName("ゼルダ");
        wizard.setHp(100);
        wizard.setMp(30);
        wizard.setWand(wand);

        // 回復する！
        wizard.heal(hero);

        // 結果確認
        System.out.println(hero.getName() + "の現在のHP: " + hero.getHp());
    }
}