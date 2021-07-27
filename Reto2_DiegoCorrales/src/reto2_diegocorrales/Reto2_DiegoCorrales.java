/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2_diegocorrales;
import DatasCompany.SendInformationClass;
import DatasCompany.SendCustomersClass;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Diego Corrales
 */
public class Reto2_DiegoCorrales {
    
  
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       Scanner general_text = new Scanner(System.in);
       boolean general_base = false; 
       while(general_base == false){
            
            System.out.println(ANSI_YELLOW+"================================================================================================="+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"====================================== BIENVENIDOS A LA BASE DE DATOS============================"+ANSI_RESET);
            System.out.println(ANSI_GREEN+"¿Què base de datos desea acceder?"+ANSI_RESET+"\n      1.Base de empleados\n      2.Base de Clientes");
            String menu = general_text.nextLine(); 
            
            if(menu.toUpperCase().equals("CLIENTES")|| menu.toLowerCase().equals("clientes") || menu.equals("Clientes")){
                SendCustomersClass customer_data = new SendCustomersClass();
                customer_data.crud_Customer();
                System.out.println("¿Desea Salir del menu de base de datos de clientes? (si o no)");
                String out_customers = general_text.nextLine();
                if(out_customers.toUpperCase().equals("SI") || out_customers.toLowerCase().equals("si") || out_customers.equals("Si")){
                    
                }
            }
            
            else if(menu.toUpperCase().equals("EMPLEADOS")|| menu.toLowerCase().equals("empleados") || menu.equals("Empleados")){
                SendInformationClass employee_data = new SendInformationClass();
                employee_data.crud_Employee();
            }
            else{
                System.out.println(ANSI_RED+"====================OPCIÒN NO VALIDA ===================="+ANSI_RESET); 
            }
            // TODO code application logic here
        
           
       }    
    }
}
