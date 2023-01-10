package model;

import java.sql.Date;

public class AppoimentNurse implements ISchedule{
    
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Nurse getNurse() {
        return nurse;
    }
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
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

    
    @Override
    public void schedule(java.util.Date date, String time) {
        // TODO Auto-generated method stub
        
    }
}
 

