import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("大文字アルファベットを入力:");
        String alpha = scanner.nextLine();
        System.out.print("(0~25)ずらす文字列を入力:");
        int num = scanner.nextInt();
        char[] chars = alpha.toCharArray();
        for(int i = 0; i < alpha.length(); i++){
            if((chars[i] - 'A') + num > 25){
                chars[i] = 'A';
            } else{
                chars[i] += num;
            }
            System.out.print(chars[i]);
        }
    }
}