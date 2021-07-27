/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatasCompany;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Diego Corrales
 */
public class DatesEmployeeClass {
    Scanner inst_data = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    
    private String employee_name;
    private String employee_lastname;
    private String management;
    private String document_type_e;
    private String employee_job;
    private String employee_hierarchy;
    private String email;
    private int document_num_e;
    private int telephone_em;

    public DatesEmployeeClass(){
        
    }
    
    public DatesEmployeeClass(String employee_name, String employee_lastname, String management, String document_type_e, String employee_job, String employee_hierarchy, String email, int document_num_e, int telephone_em) {
        this.employee_name = employee_name;
        this.employee_lastname = employee_lastname;
        this.management = management;
        this.document_type_e = document_type_e;
        this.employee_job = employee_job;
        this.employee_hierarchy = employee_hierarchy;
        this.email = email;
        this.document_num_e = document_num_e;
        this.telephone_em = telephone_em;
    }

    public Scanner getInst_data() {
        return inst_data;
    }

    public void setInst_data(Scanner inst_data) {
        this.inst_data = inst_data;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_lastname() {
        return employee_lastname;
    }

    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getDocument_type_e() {
        return document_type_e;
    }

    public void setDocument_type_e(String document_type_e) {
        this.document_type_e = document_type_e;
    }

    public String getEmployee_job() {
        return employee_job;
    }

    public void setEmployee_job(String employee_job) {
        this.employee_job = employee_job;
    }

    public String getEmployee_hierarchy() {
        return employee_hierarchy;
    }

    public void setEmployee_hierarchy(String employee_hierarchy) {
        this.employee_hierarchy = employee_hierarchy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDocument_num_e() {
        return document_num_e;
    }

    public void setDocument_num_e(int document_num_e) {
        this.document_num_e = document_num_e;
    }

    public int getTelephone_em() {
        return telephone_em;
    }

    public void setTelephone_em(int telephone_em) {
        this.telephone_em = telephone_em;
    }

    public void crud_Employee(){
        ArrayList<DatesEmployeeClass> arrayObjectEmp = new ArrayList <>();
        boolean exit_program = false;
        while(!exit_program){
            System.out.println(ANSI_PURPLE + "===================================================================" +ANSI_RESET);
            System.out.println(ANSI_BLUE + "                    BASE DE DATOS EMPRESARIAL" +ANSI_RESET);
            System.out.println(ANSI_PURPLE + "===================================================================" +ANSI_RESET);
        }    
   }
    
    
}
