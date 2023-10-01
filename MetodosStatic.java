package banco;
import java.util.Scanner;

public class MetodosStatic{
    
    public static void transferencia(Cuenta cuenta1, Cuenta cuenta2, Banco banco1, Banco banco2){
        //if si cuenta es diferente ingresamos dinero 
       if(cuenta1 != cuenta2){
           boolean dineroCorrecto;
           Scanner leer = new Scanner(System.in);
           double dineroIngresado;
           
           do{//mientras el dinero sea double introducir 
               dineroCorrecto = true;
               System.out.println("cuanto dinero quieres tranferir");
               
               while(!leer.hasNextDouble()){
                   leer.nextLine();
                   System.out.println("introduce un numero decimal");
               }
               
               dineroIngresado = leer.nextDouble();
               //id para no introducir negativos ni valores 0
               if(dineroIngresado>0){
                   }else if(dineroIngresado==0){
                   System.out.println("la tranferencia no puede ser 0");
               }else{
                       System.out.println("la tranferencia tiene que ser positiva");
                       dineroCorrecto = false;
                   }
           //while repetir el bucle hasta que dinero sea correcto 
           }while(!dineroCorrecto);
           //si los bancos son distintos incrementamos un 5.5 de comision 
           if(banco1 != banco2){
               double dineroEnviado = dineroIngresado + (dineroIngresado*5.5)/100;
               
                 if(cuenta1.getClass() == Cuenta_credito.class){
                     //sacamos dinero de cuenta credito y le metemos en cuenta nueva
                    cuenta2.meterDinero(dineroIngresado, ((Cuenta_credito)cuenta1).sacarDineroTransferencia(dineroEnviado));
                    System.out.println("la cuenta 1 tiene " + cuenta1.getDinero());
                    System.out.println("la cuenta 2 tiene " + cuenta2.getDinero());
                    
                }else{
                     //nos imprime los resultados y nos lo suma en el objeto cuenta creado
                    cuenta2.meterDinero(dineroIngresado, cuenta1.sacarDineroTransferencia(dineroEnviado));
                    System.out.println("la cuenta 1 tiene " + cuenta1.getDinero());
                    System.out.println("la cuenta 2 tiene " + cuenta2.getDinero());
                }
           }
           //si pones dos cuentas iguales imprime este mensaje 
       }else{System.out.println("Error: no puedes hacer una transferencia en la misma cuenta");}
        
    }
        
}