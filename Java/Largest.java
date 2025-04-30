import java.util.Scanner;

public class Largest {
    public static void main(String args[]){
     int a,b,c;
     
    
        System.out.println("Enter three integers: ");
        Scanner sct = new Scanner(System.in);
a = sct.nextInt();
b = sct.nextInt(); //User Input
c = sct.nextInt();
   
        if(a > b && a > c)
        System.out.println("a is the largest number:");
        
        else if(b > a && b > c)
        System.out.println("b is the largest number:");

        else if(c > a && c > b)
        System.out.println("c is the largest number:");

        else
        System.out.println("Numbers are not distinct");

        }
    }
