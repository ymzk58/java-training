public class StringSort {

    /*文字列を受け取って左と右でcompareToして
     *左がデカければ正の数 正の数ならスワップ
      最終結果を返す*/
    public static String[]ascendingString(String[] words){
        for(int i = 0; i < words.length-1; i++){
            for(int j = 0; j < words.length-1; j++){
                if(words[j].compareTo(words[j+1]) > 0){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        return words;
    }
    /*compareToで右がデカければ負の数
     * 負の数ならスワップ
     */
    public static String[]DescendingString(String[] words){
        for(int i = 0; i < words.length-1; i++){
            for(int j = 0; j < words.length-1; j++){
                if(words[j].compareTo(words[j+1]) < 0){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        return words;
    }
}
