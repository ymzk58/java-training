public class RealNumSort {
    //昇順
    /*double配列のnumbersを受け取る
     * 配列数-1の2重ループで if左が右よりデカい場合
       tempを用いてスワップする
       スワップ後の値をmainに返す*/
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
    /*右が左よりデカい場合スワップしてmainに返す*/
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
