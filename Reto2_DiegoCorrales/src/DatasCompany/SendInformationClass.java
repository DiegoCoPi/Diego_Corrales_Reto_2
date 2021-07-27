/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatasCompany;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Diego Corrales
 */
 public class SendInformationClass extends DatesEmployeeClass {
    
    private Scanner inst_data = new Scanner(System.in); 
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public  SendInformationClass(){
        
    }
    
   public  SendInformationClass(String employee_name, String employee_lastname, String management, String document_type_e, String employee_job, 
           String employee_hierarchy, String email, int document_num_e, int telephone_em){
       super(employee_name, employee_lastname, management, document_type_e, employee_job,employee_hierarchy, email, document_num_e, telephone_em);
       
   }
    
    @Override
    public void crud_Employee(){
        DatesEmployeeClass employee = new DatesEmployeeClass();
        ArrayList <SendInformationClass> arrayObjectEmp = new ArrayList <>();
        boolean exit_program = false;
        ComanyDataClass comp = new ComanyDataClass();
        comp.setCompany_name("INDUMIL");
        comp.setBussines_name("S.A.");
        comp.setAdress("CARRERA 13A KM2 VIA BOGOTA-IBAGUE");
        comp.setNit(85691031);
        comp.setTelephone(7302289);
        
        while(!exit_program){
            
            System.out.println(ANSI_YELLOW + "-----------------------------------------------------------------------------------------------------" +ANSI_RESET);
            System.out.println(ANSI_GREEN + "         BIENVENIDOS A LA BASE DE DATOS EMPRESARIAL "+comp.getCompany_name()+" "+comp.getBussines_name()+" TELEFONO: "+comp.getTelephone()
                              +"\n             DIRECCIÒN: "+comp.getAdress()+" NIT: "+comp.getNit()+ANSI_RESET);
            System.out.println(ANSI_YELLOW + "-----------------------------------------------------------------------------------------------------" +ANSI_RESET);
            System.out.println("¿Què modificaciòn desea hacer en la parte de empleados?");
            System.out.println("1.Ingresar datos empleados"); 
            System.out.println("2.Consultar datos de empleados");
            System.out.println("3.Editar dato empleados");
            System.out.println("4.Borrar datos de empleado");
            System.out.println(ANSI_RED+"5.Salir se la base de datos"+ANSI_RESET);
            int menu = Integer.parseInt(inst_data.nextLine()); 
            
            switch(menu){
                case 1:
                    System.out.println("¿Cuantos empleados hay en la nòmina?");
                    int num_empl = Integer.parseInt(inst_data.nextLine());
                    for(int i=1 ; i<=num_empl ; i++){
                        
                        System.out.println("Nombre:");
                        String employee_name = inst_data.nextLine();
                        
                        System.out.println("Apellidos:");
                        String employee_lastname = inst_data.nextLine();
                        
                        System.out.println("Cargo en la empresa:");
                        String employee_job = inst_data.nextLine();
                        
                        System.out.println("Correo:");
                        String email = inst_data.nextLine();
                        
                        System.out.println("¿Es administrador?:");
                        String management = inst_data.nextLine();
                        
                        System.out.println("Orden gerarquico:");
                        String employee_hierarchy = inst_data.nextLine();
                        
                        System.out.println("Tìpo de documento:");
                        String document_type_e = inst_data.nextLine();
                        
                        System.out.println("Nùmero de documento:");
                        int document_num_e = Integer.parseInt(inst_data.nextLine());
                        
                        System.out.println("Nùmero telefònico:");
                        int telephone_em = Integer.parseInt(inst_data.nextLine());
                        
                        SendInformationClass empl = new SendInformationClass(employee_name, employee_lastname, management, document_type_e, employee_job, employee_hierarchy, 
                                                    email, document_num_e, telephone_em);
                        arrayObjectEmp.add(empl);
                        System.out.println(ANSI_YELLOW+"------------------EMPLEADO #"+i+" AGREGADO EXITOSAMENTE--------------------------"+ANSI_RESET);
                        
                        if (i==num_empl){
                            System.out.println("\n"+ANSI_BLUE+"LOS "+i+" EMPLEDOS FUERON REGISTRADO CON EXITO "+ANSI_RESET);
                        }
                    }
                   
                   break; 
                
                case 2:
                    System.out.println("Digite el nùmero de lista empleado al cual desea consultar");
                    int list_emp = Integer.parseInt(inst_data.nextLine());
                    int doc_conslt = list_emp-1;
                    if(doc_conslt>=0 && doc_conslt<=arrayObjectEmp.size()){        
                        SendInformationClass employ = arrayObjectEmp.get(doc_conslt);
                        System.out.println(ANSI_CYAN+"Nombres y Apellidos:   "+ ANSI_RESET + employ.getEmployee_name()+" "+employ.getEmployee_lastname());
                        System.out.println(ANSI_CYAN+"Cargo en la empresa:   "+ ANSI_RESET + employ.getEmployee_job());
                        System.out.println(ANSI_CYAN+"Correo:   "+ ANSI_RESET + employ.getEmail());
                        System.out.println(ANSI_CYAN+"¿Es admnistrador?    "+ANSI_RESET + employ.getManagement());;
                        System.out.println(ANSI_CYAN+"Orden jerarquico:   "+ ANSI_RESET + employ.getEmployee_hierarchy());
                        System.out.println(ANSI_CYAN+"Tipo y nùmero de documento:   "+ ANSI_RESET + employ.getDocument_type_e()+" "+employ.getDocument_num_e());
                    }
                   break; 
                
                case 3:
                   System.out.println("Digite el nùmero de lista empleado al cual desea consultar");
                   int edit_emp = Integer.parseInt(inst_data.nextLine());
                   int edit_conslt = edit_emp-1;
                   if(edit_conslt>=0 && edit_conslt<=arrayObjectEmp.size()){   
                        SendInformationClass employ = arrayObjectEmp.get(edit_conslt);
                        System.out.println(ANSI_CYAN+"Nombres y Apellidos:   "+ ANSI_RESET + employ.getEmployee_name()+" "+employ.getEmployee_lastname());
                        System.out.println(ANSI_CYAN+"Cargo en la empresa:   "+ ANSI_RESET + employ.getEmployee_job());
                        System.out.println(ANSI_CYAN+"Correo:   "+ ANSI_RESET + employ.getEmail());
                        System.out.println(ANSI_CYAN+"¿Es admnistrador?    "+ANSI_RESET + employ.getManagement());;
                        System.out.println(ANSI_CYAN+"Orden jerarquico:   "+ ANSI_RESET + employ.getEmployee_hierarchy());
                        System.out.println(ANSI_CYAN+"Tipo y nùmero de documento:   "+ ANSI_RESET + employ.getDocument_type_e()+" "+employ.getDocument_num_e());
                        
                        System.out.println("Qué dato deseas editar?\n       1. Nombres\n       2. Apellidos\n       3. Cargo \n       4.Correo\n       5.¿Es administrador?\n       "
                                + "6.Orden jerarquico\n         7.Tipo de documento\n           8.Numero de documento\n         9.Telefono");
                        int modify = Integer.parseInt(inst_data.nextLine()); 
                        switch(modify){
                            
                            case 1:
                               System.out.println(ANSI_PURPLE + "Nombre(s) nuevo(s): " + ANSI_RESET);
                               String employee_name = inst_data.nextLine();
                               employ.setEmployee_name(employee_name);
                               break;
                            case 2:
                               System.out.println(ANSI_PURPLE+"Apellidos nuevos: " + ANSI_RESET);
                               String employee_lastname = inst_data.nextLine();
                               employ.setEmployee_lastname(employee_lastname);
                               break;
                            case 3:
                               System.out.println(ANSI_PURPLE+"Cargo nuevo: "+ ANSI_RESET);
                               String employee_job = inst_data.nextLine();
                               employ.setEmployee_job(employee_job);
                               break;   
                            case 4:
                               System.out.println(ANSI_PURPLE+"Correo:  "+ANSI_RESET); 
                               String email = inst_data.nextLine();
                               employ.setEmail(email);
                               break;
                            case 5:
                               System.out.println(ANSI_PURPLE+"¿Es administrador?:   " + ANSI_RESET);
                               String management = inst_data.nextLine();
                               employ.setManagement(management); 
                               
                               break; 
                            case 6:
                               System.out.println(ANSI_PURPLE+"Nuevo orden gerarquico:  "+ANSI_RESET);
                               String employee_hierarchy = inst_data.nextLine();
                               employ.setEmployee_hierarchy(employee_hierarchy); 
                               
                            case 7:
                               System.out.println(ANSI_PURPLE+"Tipo de documento:"+ANSI_RESET); 
                               String document_type_e = inst_data.nextLine();
                               employ.setDocument_type_e(document_type_e); 
                               break;
                            case 8:
                               System.out.println(ANSI_PURPLE+"Numero de documento:"+ANSI_RESET);
                               int document_num_e = Integer.parseInt(inst_data.nextLine());
                               employ.setDocument_num_e(document_num_e);
                               break; 
                            case 9:
                               System.out.println(ANSI_PURPLE+"Telefono:"+ANSI_RESET);
                               int telephone_em = Integer.parseInt(inst_data.nextLine());
                               employ.setTelephone_em(telephone_em); 
                               break;
                            default:
                                System.out.println(ANSI_RED+"ESTA OPCIÒN NO ES VALIDA"+ANSI_RESET); 
                               break;
                        }
                   }
                   else{
                      System.out.println(ANSI_BLUE+" EMPLEADO NO ENCONTRADO "+ANSI_RESET);  
                   }
                   break;
                
                case 4:
                    System.out.println("Ingrese empleado desea borra de la base de datos"); 
                    int eraser_empl=Integer.parseInt(inst_data.nextLine());
                    int eraser =eraser_empl-1;
                    if(eraser >=0 && eraser<=arrayObjectEmp.size()){
                        SendInformationClass employ = arrayObjectEmp.get(eraser);
                        System.out.println("¿Desea eliminar los datos del empleado "+employ.getEmployee_name()+" "+employ.getEmployee_lastname()+""
                                + "? (si o no)");
                        String delete = inst_data.nextLine();
                        if(delete.toLowerCase().equals("si") || delete.toLowerCase().equals("sì")){
                            arrayObjectEmp.remove(eraser);
                            System.out.println(ANSI_RED+" EMPLEADO"+employ.getEmployee_name()+" "+employ.getEmployee_lastname()+ "BORRADO EXITOSAMENTE  "+ANSI_RESET);
                        }
                        else{
                            System.out.println(ANSI_BLUE+"DATO DE EMPLEADO"+employ.getEmployee_name()+" "+employ.getEmployee_lastname()+"NO FUE BORRADO");
                        }
                    }
                    else{
                        System.out.println(ANSI_BLUE+"  EMPLEADO NO ENCONTRADO     "+ANSI_RESET);
                    }
                   break;
                
                case 5:
                    exit_program= true;
                    System.out.println(ANSI_BLUE+"   GRACIAS POR SU TIEMPO ESPERO VOLVER PRONTO    "+ANSI_RESET);
                   break; 
                
                default:
                    System.out.println(ANSI_RED+"   OPCIÒN NO VALIDA    "+ANSI_RESET);
                   break; 
                   
            }
          
            
            
        }    
   }

}
