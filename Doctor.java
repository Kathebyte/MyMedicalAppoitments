package MyMedicalAppoitments;
public class Doctor {
    static int id=0; //autoIncrement
    
    String name,speciality;

    public Doctor(){
        System.out.println("Constructor");
    }
    public Doctor(String name,String speciality) {
        System.out.println("El nombre del Doctor asignado es: "+name);
        this.name=name;
        this.speciality=speciality;
        id++;
        
    }

    public void ShowName(){
        System.out.println("Nombre del Doctor: "+name);
    
    }
    public void ShowId(){
        System.out.println("ID Doctor: "+id);
    }
    
   

    
    
}
