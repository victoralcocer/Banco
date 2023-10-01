package banco;

public class Cuenta {
    private double dinero;//creamos atributos 
    private String n_cuenta;
  
    
    //private boolean indicador;

    public Cuenta(double dinero, String n_cuenta) {
        this.dinero = dinero;
        this.n_cuenta = n_cuenta;
    }

    //metodos getters y setters que vamos a utilizar 
    public Cuenta(String n_cuenta) {
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }
    //metodo crearCuenta: el primer if que me comprueba que solo puedo meter numeros comprendidos en 0-9
    public void crearCuenta(String n_cuenta){
        if(n_cuenta.matches("[0-9]*")){
            this.n_cuenta=n_cuenta;
        }else{
            System.out.println("no puedes introducir letras ni caracteres raros, ni numeros negativos");
        }
        //segundo if de metodo crearCuenta me comprueba que la longuitud es mayor a 9 y menos a 11, osea 10
        if(getN_cuenta().length()<11 && getN_cuenta().length()>9){
            this.n_cuenta=n_cuenta;
            System.out.println("ENHORABUENA!! has creado una cuenta con numero "+getN_cuenta());
    }else{
            System.out.println("la cuenta no tiene 10 digitos");
}
 

    
    
    
    }
    //metodo sacarDinero: un primer if que me comprueba que no entren numeros negativos
    public void sacarDinero(double sacarDinero){
        double restante;
        if(sacarDinero>0){
        //segundo if dentro del primro que me comprueba que el dinero sacado no sea superior al saldo actual
        if(sacarDinero>this.dinero){
            System.out.println("no dispone de saldo suficiente"); 
        }else{
            this.dinero=this.dinero-sacarDinero;
            System.out.println("ha retirado: " +sacarDinero+ " su saldo actual es : "+this.dinero);
        }
        }else{
        System.out.println("no se puede introducir numeros negativos");
    }
    }
    //metodo meter dinero: if que me comprueba que no se intruduzcan numeros negativos
    public void meterDinero(double meterDinero){
        if(meterDinero>0){
            double suma;
            this.dinero=meterDinero+this.dinero;
            System.out.println("has ingresado: " +meterDinero + " su saldo actutal es: " + this.dinero);
        }else{
            System.out.println("no se puede ingresar numeros negativos");
        }
    }
        
        //este metodo es para mandarlo a transferencias
        public boolean sacarDineroTransferencia(double dineroEnviar){
        boolean dineroCorrecto = true;
        //Comprobar si el dinero no supera el limite
        if(dineroEnviar <= this.dinero){
            this.dinero -= dineroEnviar;
        }else{
            dineroCorrecto = false;
            System.out.println("no puedes enviar más dinero del limite");
        }
        return dineroCorrecto;
    }
        
       //metodo para recibir el dinero
    public void meterDinero(double dineroRecibir, boolean dineroCorrecto) {
        if(dineroCorrecto){this.dinero += dineroRecibir;}  
    }
    
}