public class Sort {
    //昇順
    public static double[] ascending(double[] numbers){
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length -1; j++){
                if(numbers[j] > numbers[j+1]){
                    double temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
    //降順
    public static double[] descending(double[] numbers){
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length -1; j++){
                if(numbers[j] < numbers[j+1]){
                    double temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}
