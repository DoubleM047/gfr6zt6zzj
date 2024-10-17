public class Naloga1{
    public static void main(String[] args){
        double i=0;
        while(i<5){
            int d = (int)(Math.random()*10+1);
            if (d==1) System.out.println("ena");
            if (d==2) System.out.println("dva");
            if (d==3) System.out.println("tri");
            if (d==4) System.out.println("stiri");
            if (d==5) System.out.println("pet");
            if (d==6) System.out.println("sest");
            if (d==7) System.out.println("sedem");
            if (d==8) System.out.println("osem");
            if (d==9) System.out.println("devet");
            if (d==10) System.out.println("deset");
            i++;
        }
    }
}
