package model;
import java.util.ArrayList;
import java.util.Date;


public class Doctor extends User {
    //atributos
    private String speciality;
   
    public Doctor(String name,String email) {
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: "+name);
        this.speciality=speciality;
    }

   
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppoitment> AvailableAppoitment= new ArrayList<>();
    
    public void addAvailableAppoitment(Date date,String time){
        AvailableAppoitment.add(new Doctor.AvailableAppoitment(date, time));

    }
    public ArrayList<AvailableAppoitment> getAvailableAppoitment(){
        return AvailableAppoitment;
    }

    @Override
    public String toString() {
        return super.toString()+ "Speciality: "+getSpeciality();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital Medellin"+
        "\nDeapartamento: Cancerologia");
        
    }

    public static class AvailableAppoitment{

        private int id;
        private Date date;
        private String time;
    
        //available appoitment 
        
        public AvailableAppoitment(Date date,String time){
            this.date = date;
            this.time = time;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
    
        
       

    }


}
