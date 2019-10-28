package observer;

import java.util.ArrayList;
import java.util.List;

public class Champion implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int killCount = 0;
    private int deathCount = 0;
    private int assistCount = 0;

    public void kill() {
        killCount++;
        notifyObserver();
        System.out.println();
    }

    public void death() {
        deathCount++;
        notifyObserver();
        System.out.println();
    }

    public void assist() {
        assistCount++;
        notifyObserver();
        System.out.println();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getKillCount() {
        return killCount;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public int getAssistCount() {
        return assistCount;
    }
}
