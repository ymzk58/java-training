public class Main {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException e){
            System.out.println("NullPointerExceptionをキャッチしました");
            System.out.println("スタックトレース(ここから)ーー");
            e.printStackTrace();
            System.out.println("スタックトレース(ここまで)ーー");
        }
    }
}