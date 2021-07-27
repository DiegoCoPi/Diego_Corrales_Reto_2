/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatasCompany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Corrales
 */
public class SendCustomersClass extends CustomerDataClass{
    
    private Scanner inst_data_cust = new Scanner(System.in); 
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    
    public SendCustomersClass(){
        
    }
    
   /* public SendCustomersClass(String customer_name, String customer_lastname, String customer_adress, int customer_tel){
        super(customer_name, customer_lastname, customer_adress, customer_tel);
    }*/
    
    public SendCustomersClass(String customer_name, String customer_lastname, String customer_adress, int customer_tel){
        super(customer_name, customer_lastname, customer_adress, customer_tel);
    }
    
    @Override
     public void crud_Customer(){
        ArrayList<SendCustomersClass> arrayObjectCus = new ArrayList <>();
        boolean exit_program_cus = false;
        ComanyDataClass comp = new ComanyDataClass();
        comp.setCompany_name("INDUMIL");
        comp.setBussines_name("S.A.");
        comp.setAdress("CARRERA 13A KM2 VIA BOGOTA-IBAGUE");
        comp.setNit(85691031);
        comp.setTelephone(7302289);
        while(!exit_program_cus){
            System.out.println(ANSI_YELLOW + "-----------------------------------------------------------------------------------------------------" +ANSI_RESET);
            System.out.println(ANSI_GREEN + "         BIENVENIDOS A LA BASE DE DATOS EMPRESARIAL DE CLIENTES DE "+comp.getCompany_name()+" "+comp.getBussines_name()+" TELEFONO: "+comp.getTelephone()
                              +"\n             DIRECCIÒN: "+comp.getAdress()+" NIT: "+comp.getNit()+ANSI_RESET);
            System.out.println(ANSI_YELLOW + "-----------------------------------------------------------------------------------------------------" +ANSI_RESET);
            System.out.println("¿Què modificaciòn desea hacer en la parte de clientes?");
            System.out.println("1.Ingresar datos clientes \n   2.Consultar datos de clientes\n    3.Editar dato clientes\n   4.Borrar datos de clientes"
                                +ANSI_RED+"\n   5.Salir se la base de clientes"+ANSI_RESET);
            int choose_cus = Integer.parseInt(inst_data_cust.nextLine());
            switch(choose_cus){
                case 1:
                    
                    System.out.println("¿Cuantos clientes hay en la empresa?");
                    int quant_cus = Integer.parseInt(inst_data_cust.nextLine());
                    for(int i=1 ; i<=quant_cus ; i++){
                        
                        System.out.println("Nombre del Cliente:");
                        String customer_name = inst_data_cust.nextLine();
                        
                        System.out.println("Apellido del Cliente:");
                        String customer_lastname = inst_data_cust.nextLine();
                        
                        System.out.println("Direcciòn del Cliente:");
                        String customer_adress = inst_data_cust.nextLine();
                        
                        System.out.println("Numero de telefono del Cliente:");
                        int customer_tel = Integer.parseInt(inst_data_cust.nextLine());
                        
                        SendCustomersClass cust = new SendCustomersClass(customer_name, customer_lastname, customer_adress, customer_tel);
                        arrayObjectCus.add(cust);
                        
                        
                        
                        if (i==quant_cus){
                            System.out.println(ANSI_YELLOW+" LOS "+i+" CLIENTES FUERON EXITOSAMENTE AGREGADOS  "+ANSI_YELLOW);
                        }
                    }
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Inserte el nùmero de lista del cliente que consultar:");
                    int choose_list = Integer.parseInt(inst_data_cust.nextLine());
                    int choose_cust = choose_list-1;
                    if(choose_cust>=0 && choose_cust<=arrayObjectCus.size()){
                        SendCustomersClass customer = arrayObjectCus.get(choose_cust);
                        System.out.println(ANSI_CYAN+"  Nombre(s) y apellidos del Cliente: "+ANSI_RESET +customer.getCustomer_name()+" "+customer.getCustomer_lastname());
                        System.out.println(ANSI_CYAN+"  Direcciòn de residencia del Cliente: "+ANSI_RESET +customer.getCustomer_adress());
                        System.out.println(ANSI_CYAN+"  Nùmero telefònico cliente: "+ANSI_RESET +customer.getCustomer_tel());
                    }    
                    
                    break;
                
                case 3:
                    
                    System.out.println("Inserte el nùmero de lista del cliente desee modificar el dato:");
                    int send = Integer.parseInt(inst_data_cust.nextLine());
                    int send_customer = send-1;
                    if(send_customer>=0 && send_customer<=arrayObjectCus.size()){
                        
                       SendCustomersClass customer = arrayObjectCus.get(send_customer);
                        System.out.println("\n"+ANSI_PURPLE+"   ¿Que dato desea editar del cliente "+customer.getCustomer_name()+" "+customer.getCustomer_lastname()
                                +ANSI_RESET+"\n     1.Nombre(s) del cliente\n       2.Apellido(s) de cleinte\n      3.Direcciòn de Clientes\n"
                                        + "       4.Nùmero telefònico del cliente\n"+ANSI_RED+"     5.Cancelar"+ANSI_RESET);
                        int choose_edit =Integer.parseInt(inst_data_cust.nextLine());
                        switch(choose_edit){
                            
                            case 1:
                                System.out.println("Nombre del Cliente:");
                                String customer_name = inst_data_cust.nextLine();
                                customer.setCustomer_name(customer_name);
                                break;
                            case 2:
                                System.out.println("Apellidos del Cliente:");
                                String customer_lastname = inst_data_cust.nextLine();
                                customer.setCustomer_lastname(customer_lastname);
                                break;
                            case 3:
                                System.out.println("Nombre del Cliente:");
                                String customer_adress = inst_data_cust.nextLine();
                                customer.setCustomer_adress(customer_adress);
                                break;
                            case 4:
                                System.out.println("Nombre del Cliente:");
                                int customer_tel = Integer.parseInt(inst_data_cust.nextLine());
                                customer.setCustomer_tel(customer_tel);
                                break;
                            default:
                                System.out.println(ANSI_RED+"   OPCIÒN NO VALIDA    "+ANSI_RESET);
                        }
                    }     
                break;
                
                case 4:
                    
                    System.out.println("Ingrese el nùmero de listado del cliente que desea eliminar:");
                    int choose_dcust = Integer.parseInt(inst_data_cust.nextLine());
                    int delete_cust =   choose_dcust-1;
                    if(delete_cust>=0 && delete_cust<=arrayObjectCus.size()){
                        SendCustomersClass customer = arrayObjectCus.get(delete_cust);
                        System.out.println(ANSI_RED+" ¿Desea eliminar al Señor(a)"+customer.getCustomer_name()+" "+customer.getCustomer_lastname()
                                +"\n DE LA BASE DE DATOS DE CLIENTES DE"+comp.getBussines_name()+" "+comp.getBussines_name()+" si o no?");
                        String final_choose = inst_data_cust.nextLine();
        
                        if(final_choose.toLowerCase().equals("si")|| final_choose.toUpperCase().equals("SI")){
                           arrayObjectCus.remove(delete_cust);
                            System.out.println(ANSI_RED+"   CLIENTE BORRADO DE LA LISTA DE MANERA SATISFACTORIA"+ANSI_RESET);
                        }
                        else if(final_choose.toLowerCase().equals("no")|| final_choose.toUpperCase().equals("NO")){
                             System.out.println(ANSI_BLUE+"   CLIENTE NO FUE BORRADO DE LA LISTA"+ANSI_RESET);
                        }
                        else{
                            System.out.println(ANSI_RED+"       OPCIÒN NO VALIDA"+ANSI_RESET);
                        }
                        
                    }
                    
                   break;
                
                case 5:
                    exit_program_cus = true;
                    System.out.println(ANSI_GREEN+" GRACIAS POR TU TIEMPO EN LA BASE DE DATOS DE CLIENTES "+comp.getCompany_name()+""+comp.getBussines_name()
                            +""+ANSI_RESET);
                   break; 
                default:
                    System.out.println(ANSI_RED+"   OPCIÒN NO VALIDA"+ANSI_RESET);
            }
            
        }    
   }
    
}
