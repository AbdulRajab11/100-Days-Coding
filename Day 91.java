import java.util.Scanner;
public class day91 {
    public static int luasPersegi(int s){
        int L = s * s;
        return(L);
    }
    public static int kelilingPersegi(int s){
        int K = 4 * s;
        return(K);
    }
    public static void tampilLuas(int s){
        System.out.println("L = s x s");
        System.out.println("L = " + s + " x " + s);
        System.out.println("L = " + luasPersegi(s));
    }
    public static void tampilKeliling(int s){
        System.out.println("K = 4 x s");
        System.out.println("K = 4 x " + s);
        System.out.println("K = " + kelilingPersegi(s));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s;
        System.out.print("Input Sisi : ");
        s = sc.nextInt();
        tampilLuas(s);
        System.out.println();
        tampilKeliling(s);
    }
    
}
