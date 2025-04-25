public class Encode {
    public static String encoding(int enNum, String input){
        StringBuilder sb = new StringBuilder();
        //大文字のみ抽出
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(Character.isUpperCase(c)){
                sb.append(c);
            }
        }
        //暗号化
        char[] upperChars = sb.toString().toCharArray();
        for(int i = 0; i < upperChars.length; i++){
            upperChars[i] = (char) ('A' + (upperChars[i] - 'A' + enNum) % 26);
        }
        //charからStringへ型変換
        String encoded = new String(upperChars);
        return encoded;
    }
}
