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
public class CustomerDataClass {
    
    Scanner inst_data_cus = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private String customer_name;
    private String customer_lastname;
    private String customer_adress;
    private int customer_tel;
    
    public CustomerDataClass(){
        
    }

    public CustomerDataClass(String customer_name, String customer_lastname, String customer_adress, int customer_tel) {
        this.customer_name = customer_name;
        this.customer_lastname = customer_lastname;
        this.customer_adress = customer_adress;
        this.customer_tel = customer_tel;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_lastname() {
        return customer_lastname;
    }

    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }

    public String getCustomer_adress() {
        return customer_adress;
    }

    public void setCustomer_adress(String customer_adress) {
        this.customer_adress = customer_adress;
    }

    public int getCustomer_tel() {
        return customer_tel;
    }

    public void setCustomer_tel(int customer_tel) {
        this.customer_tel = customer_tel;
    }
    
     public void crud_Customer(){
        ArrayList<CustomerDataClass> arrayObjectEmp = new ArrayList <>();
        boolean exit_program_cus = false;
        while(!exit_program_cus){
            System.out.println(ANSI_PURPLE + "===================================================================" +ANSI_RESET);
            System.out.println(ANSI_BLUE + "                    BASE DE DATOS EMPRESARIAL" +ANSI_RESET);
            System.out.println(ANSI_PURPLE + "===================================================================" +ANSI_RESET);
        }    
   }
    
}
