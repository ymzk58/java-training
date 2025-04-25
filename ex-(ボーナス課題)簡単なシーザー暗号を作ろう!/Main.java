import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(0~25)ずらす文字数: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // nextInt()の改行吸収

        System.out.print("モード選択 暗号化>0 復号>1: ");
        int mode = scanner.nextInt();
        scanner.nextLine(); // nextInt()の改行吸収

        char[] upperChars = null; // 共通で使えるように外で宣言

        switch (mode) {
            case 0 -> {
                System.out.println("暗号化します");
                System.out.print("アルファベットを入力: ");
                String alpha = scanner.nextLine();
                StringBuilder sb = new StringBuilder();

                // 大文字のみ抽出
                for (int i = 0; i < alpha.length(); i++) {
                    char c = alpha.charAt(i);
                    if (Character.isUpperCase(c)) {
                        sb.append(c);
                    }
                }

                upperChars = sb.toString().toCharArray();

                System.out.print("暗号化結果: ");
                for (int i = 0; i < upperChars.length; i++) {
                    upperChars[i] = (char) ('A' + (upperChars[i] - 'A' + num) % 26);
                    System.out.print(upperChars[i]);
                }
                System.out.println();
            }

            case 1 -> {
                System.out.print("復号する文字列を入力（大文字のみ）: ");
                String input = scanner.nextLine();
                upperChars = input.toCharArray();

                System.out.print("復号結果: ");
                for (int i = 0; i < upperChars.length; i++) {
                    upperChars[i] = (char) ('A' + (upperChars[i] - 'A' - num + 26) % 26);
                    System.out.print(upperChars[i]);
                }
                System.out.println("\n終了します");
            }

            default -> System.out.println("無効なモードです");
        }

        scanner.close();
    }
}