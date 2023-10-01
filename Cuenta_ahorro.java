
package banco;

public class Cuenta_ahorro extends Cuenta {
       private double interes;
       //if dentro de constructor para decir que el interes tiene que ser mayor a 0
       public Cuenta_ahorro(double dinero, String n_cuenta, double interes){
           super(dinero, n_cuenta);
           if(interes>=0){
               this.interes=interes;
           }else{
               System.out.println("no permite numeros negativos");
           }
       }
       //constructores 
    public Cuenta_ahorro(double dinero, String n_cuenta) {
        super(dinero, n_cuenta);
    }
    
    public Cuenta_ahorro(String n_cuenta) {
        super(n_cuenta);
    }

    public double setInteres() {
        return interes;
    }
      
       //mostrar datos metodo para imprimir datos
       public void mostrarDatos(){
           System.out.println("numero de cuenta: "+getN_cuenta());
           System.out.println("el dinero es: "+getDinero());
           System.out.println("el interes es: "+interes);
           
       }
       //metodo aplicarInteres para hacer el calculo de interes y sumarlo al dinero actual
       public void aplicarInteres(){
           double totalDinero;
           totalDinero=(getDinero()*interes*0.01)+getDinero();
           System.out.println("el interes es: "+interes);
           System.out.println("su dinero total es: "+totalDinero);
       }
       

}