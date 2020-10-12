package event;

import java.util.Arrays;

public class Event {
    private EventNext start;
    private int size;

    public void addEvent(EventNext event) {

        if (start == null) {
            this.start = new EventNext(event.getText(), event.getLeft(), event.getRight());
        } else {
            EventNext temp = start;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new EventNext(event.getText(), event.getLeft(), event.getRight()));
        }

        size++;
    }

    public String getEvent(int index) {
        int currentIndex = 0;
        EventNext temp = start;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getText();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index == 0) {
            start = start.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        EventNext temp = start;

        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp.getNext();
                currentIndex++;
            }
        }

        size--;
    }

    public String toString() {
        String[] result = new String[size];
        int index = 0;
        EventNext temp = start;

        while (temp != null) {
            result[index++] = temp.getText();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

}
