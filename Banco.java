package banco;
import java.util.ArrayList;


public class Banco {
    //atributos
    protected ArrayList <Cuenta> cuentas;
    protected final String cod;
    protected ArrayList <Cuenta> morosos;
    //constructor

    public Banco(ArrayList<Cuenta> cuentas, String cod, ArrayList<Cuenta> morosos) {
        this.cuentas = cuentas;
        this.cod = cod;
        this.morosos = morosos;
    }
    
    //metodos
    public void aplicarInteresBanco(){
        //for para recoorrer la ArrayList en busca de la Cuenta_ahorro
        for(Cuenta i: this.cuentas){
            if(i.getClass()== Cuenta_ahorro.class){
                ((Cuenta_ahorro)i).aplicarInteres();
            }
        }
        
    }
    
    public void actualizarMorosos(){
        //recorremos cuentas si hay una en negativo agregamos a la array morosos
        for(Cuenta i: this.cuentas){
            if(i.getDinero()<0){
                this.morosos.add(i);
            }
        }
        //ahora si la cuenta de morosos se pone en positivo la quitamos
        for(int j=0; j<this.morosos.size(); j++){
            if(this.morosos.get(j).getDinero()>0){
                this.morosos.remove(j);
            }
        }
        
        if(this.morosos.size()==0){
            System.out.println("No hay morosos");
        }else{
            System.out.println("Cuentas de morosos: ");
            
            for(Cuenta i: this.morosos){
                System.out.println("n_cuenta: " +i.getN_cuenta());
            }
        }
        
    }
    
    public void eliminarMorosos(){
        //if que si no hay morosos imprime comentario de lo contrario elimina cuenta
        if(this.morosos.size()==0){
            System.out.println("No hay morosos");
        }else{
            for(Cuenta i: this.morosos){
                System.out.println("Se ha eliminado la cuenta: " + i.getN_cuenta());
                this.cuentas.remove(i);
            }
        }
        
    }
    
}
          
    
    
    
