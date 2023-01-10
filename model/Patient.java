package model;
public class Patient extends User {
    
    //ATRIBUTOS
    private String birtday;
    private String blood;
    private double weight;
    private double height;


    public Patient(String name,String email){
        super(name, email);
   
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public double getHeight() {
        return height;
    }

    public String setHeight(double height) {
        return this.height +"cm";
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return super.toString()+ "\nAge: "+ birtday +"\nWeight: "+getWeight()+
        "\nHeight: "+getHeight() + "\nBlood: " +getBlood();
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente"+
        "\nHistorial completo desde nacimiento");
        
    }

    
}
