
package banco;
//extends para heredar de clase Cuenta
public class Cuenta_credito extends Cuenta {
    //constructor
    public Cuenta_credito(double dinero, String n_cuenta) {
        super(dinero, n_cuenta);
    }
    //Para  mostrar datos
    public void datos(){
        System.out.println("Numero de cuenta: "+getN_cuenta());
        System.out.println("Su dinero actual es: "+getDinero());
    }
    //metodo sacarDineroCredito con un primer if para evitar meter numeros negativos
    public void sacarDineroCredito(double sacarDineroCredito){
        
        if(sacarDineroCredito>0){
            //segundo if dentro del primero para que no deje sacar mas dinero del limite en este caso 500
            if(sacarDineroCredito<=500){
            this.setDinero(this.getDinero()-sacarDineroCredito);
            System.out.println("Usted a sacado: "+sacarDineroCredito+" usted tiene: " +this.getDinero());
            }else{
                System.out.println("No se puede retirsr mas del limite");
            }
           
            
        }else{
            System.out.println("No puede introducir numeros negativos");
        }
    }
}
