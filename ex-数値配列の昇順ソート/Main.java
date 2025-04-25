public class Main{
    public static void main(String[] args){
        int[] numbers = {
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
        //並び替え
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length -1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        //結果の出力
        for(int i = 0; i < numbers.length; i++){
            if((i+1)%5==0){
                System.out.println();
            }
            System.out.print(numbers[i] + " ");
        }
    }
}