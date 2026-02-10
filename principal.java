import java.util.Scanner;
public class principal {
        public static void main(String[]args){
            Scanner sc =new Scanner (System.in);
            metodos m=new metodos();
            int n=0;
            System.out.println("ingrese la dimension del patio");
            n=sc.nextInt();
            objetual[]r=new objetual[n];
            r=m.llenarregistros(r);
            r=m.calcularnuevopago(r);
            m.mostrarregistros(r);


        }
    
}
