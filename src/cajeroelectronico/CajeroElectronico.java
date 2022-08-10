
package cajeroelectronico;

import javax.swing.JOptionPane;

public class CajeroElectronico {

   
    public static void main(String[] args) {
        
        
        final int saldo_inicial=1000;
        int opcion;
        float ingresar;
        float saldoactual;
        float retiro;
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Cajero Electronico de Bancolombia" +
            "\n1: Ingresar dinero a la Cuenta \n 2:Retirar Dinero de la Cuenta \n3: Salir"));
        
        
        switch(opcion){
        
            case 1: ingresar= Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad de dinero que desea ingresar en la cuenta"));
            saldoactual=saldo_inicial + ingresar;
                JOptionPane.showInputDialog(null, "dinero en la cuenta "+saldoactual);
            break;
            
            case 2:retiro = Float.parseFloat(JOptionPane.showInputDialog("digitela cantidad de dinero que desea retirar"));
            
                if(retiro>saldo_inicial){
                
                    JOptionPane.showMessageDialog(null,"no cuenta con el dinero suficiente para el retiro");
                        
                }else{
                    
                    saldoactual = saldo_inicial-retiro;
                    JOptionPane.showMessageDialog(null, "su saldo es: " +saldoactual);
                
                }
                
            break;
            
            case 3:
                default:JOptionPane.showMessageDialog(null,"se equivoco de opcion");
            
            
        }  
                
    }
    
}
