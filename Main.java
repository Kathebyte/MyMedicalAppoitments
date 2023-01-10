import java.util.Date;

import model.Doctor;
import model.Patient;
import model.User;

import java.util.ArrayList;
import java.util.Date;

import ui.Menu;

public class Main {

    public static void main(String[] args) {
    
        //Menu.showMenu();
        /*Doctor myDoctor= new Doctor("Kathe Benjumea", "Pediatra");
        System.out.println(myDoctor);*/
        
        /*myDoctor.addAvailableAppoitment(new Date(), "16:00");
        myDoctor.addAvailableAppoitment(new Date(), "18:00");
        myDoctor.addAvailableAppoitment(new Date(), "20:00");*/

        
        //Patient patien= new Patient("Andrea", "Andre123@gmail.com");
        //System.out.println(patien.toString());
        System.out.println("*****************************");
        User user= new Doctor("Katherine Benjumea", "Kathe123@gmail.com");
        user.showDataUser();
        User user1 = new Patient("Crsitian", "cRSI12@GMAIL.COM");
        user1.showDataUser();
        };
        


    }


