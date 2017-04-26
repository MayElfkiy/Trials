package recursiongood;

import java.util.Scanner;


public class RecursionGood {
 
    public static int Factorial (int n){
        
        if (n<=1){
        return 1;}
        else{
            return n* Factorial(n-1);
        }
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int result = Factorial(n);
        System.out.println(result);
    }
    
}
