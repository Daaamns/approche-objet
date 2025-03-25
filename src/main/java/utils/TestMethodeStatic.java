package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int result = Integer.parseInt(chaine);
        int a = 10;
        int b = 15;

        int reslutMaxMin = Integer.max(a, b);

        System.out.println(result);
        System.out.println(reslutMaxMin);
    }
}
