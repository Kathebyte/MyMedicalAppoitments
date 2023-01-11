package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class UiDoctorMenu {

    public static ArrayList<Doctor> doctorsAvalableAppoitments = new ArrayList<>();

    public static void showDoctorMenu(){
       int response=0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+ Menu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule Appoitments");
            System.out.println("0.Logout");

            Scanner teclado= new Scanner(System.in);
            response= teclado.nextInt();

            switch( response){
                case 1:
                break;
                case 2:
                break;
                case 0:
                    Menu.showMenu();
                    break;
               
            }

            
        } while (response !=0);
    }


    private static void ShowAvailableAppoitments(){
        int response= 0;
        do {
            System.out.println("::Add Available Appoitments");
            System.out.println("::Select a Month");

            for (int i = 0; i < 3; i++) {
                int a = i +1; //variable auxiliar para no alterar el ciclo de i
                System.out.println(a + ". " + Menu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner teclado= new Scanner(System.in);
            response= teclado.nextInt();

            if(response>0 && response< 4){
                //1,2,3
                int monthSelect = response;
                System.out.println(monthSelect + " . "+ Menu.MONTHS[monthSelect]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = teclado.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate =teclado.nextInt();
                if(responseDate == 2) continue;
                String time="";
                int responseTime = 0;
                do {
                    System.out.println("Insert time available for date: " +date + "[16:00]");
                    time = teclado.nextLine();
                    System.out.println("Your time is "+ time + "\n1. Correct \n2. Change Time");
                    responseTime=teclado.nextInt();
  
                } while (responseTime ==2);

                Menu.doctorLogged.addAvailableAppoitment(null, time);
                checkDoctorAvailableAppoitments(Menu.doctorLogged);

            
            }else if(response == 0){
                showDoctorMenu();
            }

        } while (response != 0);

    }

    private static void checkDoctorAvailableAppoitments(Doctor doctor){
        if( doctor.getAvailableAppoitment().size() > 0
        && !doctorsAvalableAppoitments.contains(doctor)){
            doctorsAvalableAppoitments.add(doctor);
        }
    }
}

 