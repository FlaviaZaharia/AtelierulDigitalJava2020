package proiect.observer_pattern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleData implements Subject{

    private List<Observer> observers;
    private String showName;
    private double ticketPrice;
    private String producer;
    private LocalDate date;
    private int hour;

    public ScheduleData(){
        observers=new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
      observers.add(o);
    }

    public void removeObserver(Observer o){
       int index=observers.indexOf(o);
       if(index>=0){
           observers.remove(index);
       }
    }
    public void notifyObservers(){
       for(Observer observer:observers)
           observer.update(showName,ticketPrice,producer,date,hour);

    }

    public void showAdded(){
        notifyObservers();
    }
    public void setDetails(String showName,double ticketPrice,String producer,LocalDate date, int hour){
        this.showName=showName;
        this.ticketPrice=ticketPrice;
        this.producer=producer;
        this.date=date;
        this.hour=hour;
        showAdded();
    }
}
