package day23;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai : ");
        
        int N = input.nextInt();
        for( int i = 1; i <= N; i++){
            for(int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
    
}
