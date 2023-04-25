package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
   private List<Observer> observers = new ArrayList<Observer>();
   
   private int state;

   public int getstate() {
        return state;
   }

   public void setstate(int state){
        this.state = state;
        notifyall();
   }

   public void attach(Observer observer){
        observers.add(observer);
   }

   public void notifyall(){
    for(Observer observer: observers){
        observer.update();
    }
   }

}
