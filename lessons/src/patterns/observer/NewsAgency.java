package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Listner> listners = new ArrayList<>();

    public void addListners(Listner listner) {
        listners.add(listner);
    }

    public void removeListner(Listner listner) {
        listners.remove(listner);
    }

    public void newMessage(String message) {
        System.out.println("Message: " + message);
        notifyListeners(message);
    }

    private void notifyListeners(String mess) {
        for (Listner listner : listners) {
            listner.publish(mess);
        }
    }

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addListners(new Listner() {
            @Override
            public void publish(String str) {
                System.out.println("Listener1 : " + str);
            }
        });
        newsAgency.addListners(new Listner() {
            @Override
            public void publish(String str) {
                System.out.println("Listener2: " + str);
            }
        });
        newsAgency.newMessage("some changes");
    }
}
