public class IntSort {
    //左がデカければスワップ
    public static int[] ascendingInt(int[] numbers){
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length -1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
    //右がデカければスワップ
    public static int[] descendingInt(int[] numbers){
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length -1; j++){
                if(numbers[j] < numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}
