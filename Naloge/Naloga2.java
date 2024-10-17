public class Naloga2{
    public static void main(String[] args){
        int a = (int)(Math.random()*151);
        while (50 > a || a > 60){
            System.out.println(a);
            a = (int)(Math.random()*151);
        }
        System.out.println(a);
    }
}
