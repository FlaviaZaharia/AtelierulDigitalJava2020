package proiect.observer_pattern;

import java.time.LocalDate;

public interface Observer {
    public void update(String showName,double ticketPrice,String producer,LocalDate date, int hour);
}
