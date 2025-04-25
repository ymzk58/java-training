import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //変数宣言
        String encoded = "";
        String decoded = "";
        //入力受付
        Scanner scanner = new Scanner(System.in);
        System.out.print("モード選択 暗号化>0 復号>1: ");
        int mode = scanner.nextInt();
        scanner.nextLine(); // nextInt()の改行吸収
        System.out.print("(0~25)ずらす文字数: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // nextInt()の改行吸収
        System.out.print("アルファベットを入力: ");
        String input = scanner.nextLine();

        //処理
        switch(mode){
            case 0 ->{
                encoded = Encode.encoding(num,input);
                System.out.println("暗号化:" + encoded);
            }
            case 1->{
                decoded = Decode.decoding(num, input);
                System.out.println("復号:" + decoded);
            }
        }
    }
}