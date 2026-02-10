import java.util.Scanner;

public class metodos {
    
    public objetual[] llenarregistros(objetual[]r){
        Scanner sc = new Scanner (System.in);
            for (int i=0; i< r.length; i++){
                objetual o =new objetual();
                System.out.println( "ingrese la marca");
                o.setMarca(sc.next());
                System.out.println( "ingrese tipo de vihiculo");
                o.setTipo(sc.next());
                System.out.println( "ingrese tipo de vihiculo");
                o.setCilindrage(sc.nextInt());

                if (o.getCilindrage() > 900 && o.getCilindrage() < 1700 )
                {
                    o.setPagoanterior(150.000);
                }
                else if (o.getCilindrage()>=1700 && o.getCilindrage() < 1700){
                    o.setPagoanterior(200.000);
                }

                else {
                    o.setPagoanterior(250.000);
                }
                o.setNumerocelda(i+1);
                r[i]=o;

            }

        return r;
    }
        public objetual[]calcularnuevopago (objetual[]r){

            for(int i=0; i < r.length; i++){
                r[i].setPagoactual(r[i].getPagoanterior()*1.23);
            }
                return r;
        }
        
        public void mostrarregistros(objetual[] ){
            for(int i=0; i < r.length; i++){
                System.out.println("marca: " + r[i].getMarca());
                System.out.println("tipo de vihuculo: " + r[i].getTipo());
                System.out.println("cilindraje : " + r[i].getCilindrage());
                System.out.println("pago anterior: " + r[i].getPagoanterior());
                System.out.println("pago actual : " + r[i].getPagoactual());
                System.out.println("numero celda : " + r[i].getNumerocelda());
                System.out.println("....................................");
            }
        }
    
}
