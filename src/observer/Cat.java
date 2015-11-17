package observer;

import java.util.ArrayList;

public class Cat implements Subject{

	private ArrayList<Observer> obsList;
	
	public Cat() {
		obsList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		obsList.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		obsList.remove(obs);
	}

	@Override
	public void notifyObservers(String str) {
		for (Observer obs:obsList) {
			obs.update(str);
		}
	}
	
	public void call(){
		System.out.println("Ã¨½ÐÁËÒ»Éù");
		notifyObservers("catCall");
	}

	public void sleep(){
		System.out.println("Ã¨ÔÚË¯¾õ");
		notifyObservers("catSleep");
	}
}
