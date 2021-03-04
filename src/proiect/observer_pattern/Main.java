package proiect.observer_pattern;

import java.time.LocalDate;
// Am implementat Observer Pattern pentru o aplicatie ce ofera informatii despre spectacole de opera. Sunt afisate datele complete ale spectacolelor adaugate
// si banii din pretul unui bilet care sunt donati unor organizatii caritabile.
public class Main {
    public static void main(String[] args) {
        ScheduleData scheduleData=new ScheduleData();
        CompleteDetailsDisplay showdetails=new CompleteDetailsDisplay(scheduleData);
        CharityProcentDisplay show=new CharityProcentDisplay(scheduleData);
        scheduleData.setDetails("Lacul lebedelor",150,"Producator1", LocalDate.of(2021,9,12),19);
        scheduleData.setDetails("Ana Karenina",190,"Producator2", LocalDate.of(2021,11,10),20);
        //scheduleData.removeObserver(show);
        scheduleData.setDetails("Baiadera",100,"Producator3", LocalDate.of(2021,8,9),18);
    }
}
