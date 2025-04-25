import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //初期値
        int[] intNumbers = {
            5, 2, 9, 1, 3,
            47, 86, 14, 33, 59,
            7, 92, 71, 60, 20,
            39, 12, 45, 90, 6,
            27, 88, 53, 38, 66,
            1, 76, 28, 94, 35,
            19, 58, 82, 43, 97,
            4, 73, 10, 26, 62,
            84, 50, 18, 31, 41,
            21, 77, 15, 68, 29,
            80, 3, 46, 11, 56,
            24, 69, 34, 98, 16,
            65, 37, 32, 75, 22,
            96, 61, 17, 48, 87,
            30, 55, 64, 9, 36,
            23, 79, 0, 85, 93,
            8, 42, 40, 13, 63,
            99, 67, 49, 25, 70,
            44, 91, 83, 52, 95,
            74, 78, 57, 89, 54
        };
        double[] realNumbers = {
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
        String[] words = {"banana", "apple", "grape", "cherry"};

        //モード選択
        Scanner scanner = new Scanner(System.in);
        System.out.print("<モード選択> 文字列の昇順:0 文字列の降順:1 整数の昇順:2 整数の降順:3 実数の昇順:4 実数の降順:5> ");
        int mode = scanner.nextInt();
        scanner.nextLine(); //nextIntの回収

        switch(mode){
            case 0 ->{
                String[] wordsAsceResult = StringSort.ascendingString(words);
                for(int i = 0; i < wordsAsceResult.length; i++){
                    System.out.println(words[i] + " ");
                }
            }
            case 1 ->{
                String[] wordsDesceResult = StringSort.DescendingString(words);
                for(int i = 0; i < wordsDesceResult.length; i++){
                    System.out.println(words[i] + " ");
                }
            }
            case 2 ->{
                int[] numbersAsceResult = IntSort.ascendingInt(intNumbers);
                for(int i = 0; i < numbersAsceResult.length; i++){
                    if((i+1)%5==0){
                        System.out.println();
                    }
                    System.out.print(numbersAsceResult[i] + " ");
                }
            }
            case 3 ->{
                int[] numbersDesceResult = IntSort.descendingInt(intNumbers);
                for(int i = 0; i < numbersDesceResult.length; i++){
                    if((i+1)%5==0){
                        System.out.println();
                    }
                    System.out.print(numbersDesceResult[i] + " ");
                }
            }
            case 4 ->{
                double[] realNumAsceResult = RealNumSort.ascending(realNumbers);
                for(int i = 0; i < realNumAsceResult.length; i++){
                    System.out.print(realNumAsceResult[i] + " ");
                    if((i+1)%5==0){
                        System.out.println();
                    }
                }
            }
            case 5 ->{
                double[] realNumDesceResult = RealNumSort.descending(realNumbers);
                for(int i = 0; i < realNumDesceResult.length; i++){
                    System.out.print(realNumDesceResult[i] + " ");
                    if((i+1)%5==0){
                        System.out.println();
                    }
                }
            }
        }
        scanner.close();
    }
}