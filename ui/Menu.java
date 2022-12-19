package MyMedicalAppoitments;
import java.util.Scanner;

public class Menu {

    public static final String [] MONTHS={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    /**
     * 
     */
    static void showMenu(){
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
                    break;
                case 2:
                    response=0;
                    showPatientMenu();
                    break;
                case 3:
                    System.out.println("Thanks for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while(response !=0);
    }

    static void showPatientMenu(){
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
        }while (response != 0);
    }
    


}
