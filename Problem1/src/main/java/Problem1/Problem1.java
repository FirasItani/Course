package Problem1;

import java.util.Scanner;

public class Problem1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ,i=0; 
        do {
            System.out.print("Enter an integer: ");
            num = in.nextInt();
            if(num>0){
                int k = num%100;
                if(k%4==0){
                    System.out.println(num+" is a multiple of 4.");
                    i++;
                }else System.out.println(num+" is not a multiple of 4"); 
            }else System.out.println("The total number of integers entered which are multiple of 4 is "+i+".");
        }while(num>=0);   
    }
}
