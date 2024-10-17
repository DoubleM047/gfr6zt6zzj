public class Naloga3{
    public static void main(String[] args){
        int r = (int)(Math.random()*151);
        int rob = 150-r;
        int sx = (int)(Math.random()*301-150);
        int sy = (int)(Math.random()*301-150);
        if(sx < 0){
            sx = sx + rob;
        }
        else if(sx > 0){
            sx = sx - rob;
        }
        if(sy < 0){
            sy = sy + rob;
        }
        else if(sy > 0){
            sy = sy - rob;
        }
        int d;
        System.out.println("Radij:" + r);
        System.out.println("Tocka x sredisca:" + sx);
        System.out.println("Tocka y sredisca:" + sy +"\n");
        do{
            int x = (int)(Math.random()*301-150);
            int y = (int)(Math.random()*301-150);
            System.out.println("Generirana tocka:" + x);
            System.out.println("Generirana tocka:" + y);
            d = (int)Math.sqrt((Math.abs(sx - x)/2)*(Math.abs(sy-y)/2));
            System.out.println("Dolzina od sredisca:" + d +"\n");
        }
        while (d > r);
    }
}
