package lab3.ch3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgent implements EstateAgent{
    private List<Apartment> apt=new ArrayList<>();
    @Override
    public void represent(Apartment apartment) {
        apt.add(apartment);
    }

    @Override
    public Apartment rent(Student student) {
        Apartment aux=null;
        for(Apartment a:apt)
        {
           if(student.getName().charAt(0)!='P'&&student.getMoney()>=a.getMonthlyRentCost())
            aux=a;
        }
        return aux;
    }
}
