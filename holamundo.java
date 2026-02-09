import java.util.Scanner;
public class holamundo {
 public static void main (String[]args){
    System.out.println ("hola mundo");
    int n1=0, n2=0;
    Scanner sc = new Scanner (System.in);
    System.out.println("ingrese el numero 1");
    n1= sc.nextInt();
    System.out.println("ingrese el numero 2");
    n2= sc.nextInt();
    System.out.println (sumadenumeros(n1, n2));
   
 } 

public  static int sumadenumeros (int n1, int n2 ){
   return n1 + n2;
   
}
}

