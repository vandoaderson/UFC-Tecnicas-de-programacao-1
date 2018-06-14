package observer;

import java.util.*;

public class Observable{
	List<Observer> observers = new ArrayList<Observer>();

	void addObserver(Observer obj){
		observers.add(obj);
	}
	void deleteObserver(Observer obj){
		observers.remove(obj);
	}
	void notifyObservers(Expressao e){
		Iterator<Observer> elements = observers.iterator();
		while (elements.hasNext()){
			Observer o = (Observer) elements.next();
			o.imprimir(e);
		}
	}
}
