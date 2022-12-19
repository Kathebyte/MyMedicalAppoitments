public class Patient {
    
    int id;
    String name,email,address,phoneNumbre,birtday,bood;
    double weight,height;

    public Patient(String name,String email){
        this.name= name;
        this.email=email;
    }

    public Patient(int id,String name, String email, String address, String phoneNumbre, String birtday, String bood,
            double weight, double height) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumbre = phoneNumbre;
        this.birtday = birtday;
        this.bood = bood;
        this.weight = weight;
        this.height = height;
    }


    
}
