package observer;

interface Subject {
	public void registerObserver(Object obj);
	public void removeObserver(Object obj);
	public void notifyObservers();
}
