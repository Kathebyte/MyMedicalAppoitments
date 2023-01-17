package ui;

import model.Doctor;

import java.rmi.server.UID;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.print.Doc;

public class UiPatientMenu {

    public static void showPatientMenu(){
        int response = 0;
        do {

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + Menu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppoitment();
                    break;
                case 0:
                    Menu.showMenu();
                    break;
            }


        }while (response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            //Numeración de la lista de fechas
            //Indice fecha seleccionada
            //[doctors]
            // 1.- doctor1
                    // - 1 fecha1
                    // - 2 fecha2
            // 2.- doctor2
            // 3.- doctor3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UiDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UiDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor>  doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UiDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableAppointments = doctors.get(responseDateSelected);
            Integer indexDate=0;
            Doctor doctorSelect = new Doctor("", "");
            for (Map.Entry<Integer, Doctor> doc :doctorAvailableAppointments.entrySet()){
                indexDate = doc.getKey();
                doctorSelect=doc.getValue();
            } 
            System.out.println(doctorSelect.getName() + 
            ". Date: " +doctorSelect.getAvailableAppointments().get(indexDate).getDate() +
            ". Time: "+ doctorSelect.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2.Change Date");
            response = Integer.valueOf(sc.nextLine());

            if(response ==1){
                Menu.patientLogged.addAppointmentDoctors(
                    doctorSelect,
                    doctorSelect.getAvailableAppointments().get(indexDate).getDate(null),
                    doctorSelect.getAvailableAppointments().get(indexDate).getTime());

                    showPatientMenu();
                
            }

        }while (response!= 0);
    }

    private static void showPatientMyAppoitment(){
        int response = 0;
        do {
           System.out.println("::My Appoitment"); 
           if(Menu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("DON'T HAVE APPOINTMENTS");
                break;

           }
           for (int i = 0; i < Menu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println( j + ". " + 
                   "Date: "+ Menu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                    " Time: "+Menu.patientLogged.getAppointmentDoctors().get(i).getTime()+
                    "\n Doctor: "+Menu.patientLogged.getAppointmentDoctors().get(i).getDoctor());
           }
        System.out.println("0. Return");
        } while (response!=0);
    }


}