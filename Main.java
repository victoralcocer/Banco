package banco;

import java.util.ArrayList;


public class Main {
        
    public static void main(String[] args) {
        //crear objetos para hacer todas las comprobaciones
        //el banco parte1
        Cuenta c1 = new Cuenta("introduce un numero de cuenta valido");
        //creamos un objeto y hacemos comprobaciones con con c1
        c1.crearCuenta("1234567890");
        c1.setDinero(100);
        c1.sacarDinero(10);
        c1.meterDinero(500);
        System.out.println("************");
        //el banco parte2.1
        Cuenta_ahorro c2 = new Cuenta_ahorro(100, "0123456789", 55.8);
        c2.mostrarDatos();
        c2.aplicarInteres();
        System.out.println("************");
        //el banco parte2.2
        Cuenta_credito c3 = new Cuenta_credito(1000, "0123456789");
        c3.datos();
        c3.sacarDineroCredito(200);
        System.out.println("************");
        //el banco parte 3: arraylist
        ArrayList<Cuenta> cuentab1 = new ArrayList<>();
        cuentab1.add(c1);
        cuentab1.add(c2);
        cuentab1.add(c3);
        
        ArrayList<Cuenta> cuentab2 = new ArrayList<>();
        cuentab2.add(c1);
        cuentab2.add(c2);
        cuentab2.add(c3);
        
        ArrayList<Cuenta> cuentab3 = new ArrayList<>();
        cuentab3.add(c1);
        cuentab3.add(c2);
        cuentab3.add(c3);
        
        //Array para cuentas morosas
        ArrayList <Cuenta> morosob1 = new ArrayList<>();
        ArrayList <Cuenta> morosob2 = new ArrayList<>();
        ArrayList <Cuenta> morosob3 = new ArrayList<>();
        
        //bancos
        Banco b1 = new Banco(cuentab1, "0000" , morosob1);
        Banco b2 = new Banco(cuentab2, "1111" , morosob2);
        Banco b3 = new Banco(cuentab3, "2222" , morosob3);
        
        b1.actualizarMorosos();
        b2.eliminarMorosos();
        b1.aplicarInteresBanco();
        
        
        
        ArrayList <Banco> bancos = new ArrayList <>();
        bancos.add(b1);
        bancos.add(b2);
        bancos.add(b3);
        
        System.out.println("************");
        System.out.println("Tranferencias: ");
        //vamos a crear nuevas cuantas si no es un lio
        Cuenta c6 = new Cuenta(1000, "1234567890");
        Cuenta c7 = new Cuenta(2000, "1234567890");
        Banco b6 = new Banco(cuentab1, "0000" , morosob1);
        Banco b7 = new Banco(cuentab2, "1111" , morosob2);
        
        //Ahora realizamos la transferencia
        MetodosStatic.transferencia(c6, c7, b6, b7);
          
        
    }
}