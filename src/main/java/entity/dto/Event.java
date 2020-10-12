package entity.dto;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "events_text")
    String text;

    @Column(name = "next_events")
    String nextEvents;

    public Event() {}

    public Event(int id, String text, String nextEvents) {
        this.id = id;
        this.text = text;
        this.nextEvents = nextEvents;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getNextEvents() {
        return nextEvents;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNextEvents(String nextEvents) {
        this.nextEvents = nextEvents;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", nextEvents=" + nextEvents +
                '}';
    }
}
