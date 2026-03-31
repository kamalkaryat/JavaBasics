package design_patterns.behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Usage:
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        agency.register(channel1);
        agency.register(channel2);
        agency.setNews("Java 17 released!");
    }
}
interface Observer {
    void update(String message);
}

interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}

class NewsChannel implements Observer {
    private String news;

    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println("Breaking News: " + news);
    }
}
