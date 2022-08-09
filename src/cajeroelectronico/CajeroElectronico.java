
package cajeroelectronico;

import javax.swing.JOptionPane;

public class CajeroElectronico {

   
    public static void main(String[] args) {
        
        
        final int saldo_inicial=1000;
        int opcion;
        float ingresar;
        float saldoactual;
        float retiro;
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero electronico de bancolombia" +
                "1: ingresar dinero a la cuenta \n 2:retirar dinero de la cuenta \n3: salir"));
        
        
        switch(opcion){
        
            case 1: ingresar= Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad de dinero que desea ingresar en la cuenta"));
            saldoactual=saldo_inicial + ingresar;
                JOptionPane.showInputDialog(null, "dinero en la cuenta "+saldoactual);
            break;
            
            case 2:retiro= Float.parseFloat("digitela cantidad de dinero que desea retirar");
            
                if(retiro>saldo_inicial){
                
                    JOptionPane.showInputDialog(null,"no cuenta con el dinero suficiente para el retiro");
                        
                }else{
                    saldoactual= saldo_inicial - retiro;
                    JOptionPane.showInputDialog(null, "su salro es: " +saldoactual);
                
                }
                
            break;
            
            case 3:
                default:JOptionPane.showConfirmDialog(null,"se equivoco de opcion");
            
            
        }  
                
    }
    
}
