package ui;
import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class Menu {

    public static final String [] MONTHS={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    /**
     * 
     */
    public static void showMenu(){
        System.out.println("Welcome to My appoitments");
        System.out.println("Select the desired option:");

        int response= 0;

        do{

            System.out.println("MENU:");
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner teclado= new Scanner(System.in);
            response= teclado.nextInt();

            switch(response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response=0;
                    break;
                case 2:
                    response=0; 
                authUser(2);
                    break;
                case 3:
                    System.out.println("Thanks for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
            teclado.close();
        }while(response !=0);
    }

    private static void authUser(int userType){
        //userType=1 Doctor
        //userType=2 Paciente

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandra Martinez", "Alejandro.martinez@poo.com"));
        doctors.add(new Doctor("Melissa Montoya", "Melisa.montoya@poo.com"));
        doctors.add(new Doctor("Martina Mejia", "Martina.mejia@poo.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Mariana Bedoya", "Maribedoya@email.com"));
        patients.add(new Patient("Tifa Gutierrez", "tifa@email.com"));
        patients.add(new Patient("Crsitiano Benjumea", "Cristiano@email.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner teclado = new Scanner(System.in);
            String email=teclado.nextLine();
            
            if(userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect= true;
                        //Obtener el usuario logueado
                        doctorLogged = d;
                        //show doctor menu
                    }
                }
            }if (userType == 2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect= true;
                        patientLogged = p;
                    }
                }

            }
        } while (emailCorrect);
    }

    public static void showPatientMenu(){
        int response=0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner teclado = new Scanner(System.in);
            response = teclado.nextInt();

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i+1]);
                        
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
            teclado.close();
        }while (response != 0);
    }
    


}
