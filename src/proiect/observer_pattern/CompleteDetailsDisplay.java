package proiect.observer_pattern;

import java.time.LocalDate;

public class CompleteDetailsDisplay implements Observer,DisplaySchedule{
    private String showName;
    private double ticketPrice;
    private String producer;
    private LocalDate date;
    private int hour;
    private Subject scheduleData;

    public CompleteDetailsDisplay(Subject scheduleData){
        this.scheduleData=scheduleData;
       scheduleData.registerObserver(this);
    }


    public void update(String showName, double ticketPrice, String producer, LocalDate date, int hour){
        this.showName=showName;
        this.ticketPrice=ticketPrice;
        this.date=date;
        this.producer=producer;
        this.hour=hour;
        display();
    }
    public void display(){
        System.out.println("Titlu: "+showName+ " Pret: "+ticketPrice+" Producator: "+producer+" Data: "+date+" Ora: "+hour);
    }
}
