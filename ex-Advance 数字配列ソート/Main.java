import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double[] numbers = {
            -5, -2.1, 9.1, 1, 3,
            -47, -86.2, 14.2, 33, 59,
            -7, -92.3, 71.3, 60, 20,
            -39, -12.4, 45.4, 90, 6,
            -27, -88.5, 53.5, 38, 66,
            -1, -76.6, 28.6, 94, 35,
            -19, -58.7, 82.7, 43, 97,
            -4, -73.8, 10.8, 26, 62,
            -84, -50.9, 18.9, 31, 41,
            -21, -77.1, 15.1, 68, 29,
            -80, -3.2, 46.2, 11, 56,
            -24, -69.3, 34.3, 98, 16,
            -65, -37.4, 32.4, 75, 22,
            -96, -61.5, 17.5, 48, 87,
            -30, -55.6, 64.6, 9, 36,
            -23, -79.7, 0.7, 85, 93,
            -8, -42.8, 40.8, 13, 63,
            -99, -67.9, 49.9, 25, 70,
            -44, -91.0, 83.0, 52, 95,
            -74, -78.0, 57.0, 89, 54
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("昇順>0 降順>1 :");
        int mode = scanner.nextInt();
        scanner.nextLine();  //nextIntの回収
        switch(mode){
            case 0 ->{
                numbers = Sort.ascending(numbers);
            }
            case 1 ->{
                numbers = Sort.descending(numbers);
            }
        }
        //結果の出力
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
            if((i+1)%5==0){
                System.out.println();
            }
        }
        scanner.close();
    }
}