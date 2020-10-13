package entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "text")
    String text;

    @Column(name = "next_first")
    Integer nextFirst;

    @Column(name = "next_second")
    Integer nextSecond;

    public Event() {}

    public Integer getNextFirst() {
        return nextFirst;
    }

    public void setNextFirst(int nextFirst) {
        this.nextFirst = nextFirst;
    }

    public Integer getNextSecond() {
        return nextSecond;
    }

    public void setNextSecond(int nextSecond) {
        this.nextSecond = nextSecond;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", nextFirst=" + nextFirst +
                ", nextSecond=" + nextSecond +
                '}';
    }
}
