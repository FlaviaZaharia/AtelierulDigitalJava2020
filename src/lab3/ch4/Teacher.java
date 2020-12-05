package lab3.ch4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
   private List<Observer>  obs=new ArrayList<Observer>();
   public  void register(Observer obj){
      obs.add(obj);
   }
   public void unregister(Observer obj){
     obs.remove(obj);
   }
   public void notifyObservers(String message){
          for(Observer o:obs){
             o.update(message);
          }
   }
   public void teach(String topic){
           for(Observer o: obs)
              o.update(topic);
   }

}
