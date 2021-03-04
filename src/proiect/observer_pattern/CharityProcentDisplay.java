package proiect.observer_pattern;

import java.time.LocalDate;

public class CharityProcentDisplay implements Observer,DisplaySchedule{
  private double ticketPrice;
  private double donatie=0;
  private Subject scheduleData;

  public CharityProcentDisplay(Subject scheduleData){
      this.scheduleData=scheduleData;
      scheduleData.registerObserver(this);
  }


    public void update(String showName, double ticketPrice, String producer, LocalDate date, int hour){
      donatie=2+0.02*ticketPrice;
      display();
  }
    public void display(){
        System.out.println("Bani din pretul unui bilet pentru cauze caritabile: "+donatie);
    }

}
