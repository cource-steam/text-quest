package entity;

import java.util.List;
import java.util.Objects;
import entity.dto.Event;

public class EventList {

    private Event val;
    private EventList next;
    private int size;

    public EventList() {}
    public EventList(Event val) { this.val = val; }
    public EventList(Event val, EventList next) { this.val = val; this.next = next; }

    public void add(Event event) {
        if (this.val == null) {
            this.val = event;
            this.size = 1;
        } else {
            if (Objects.isNull(this.next)) {
                this.size++;
                this.next = new EventList(event);
            } else {
                this.size++;
                this.next.add(event);
            }
        }
    }

    public Event get(int index) {
        if (index == 0) {
            return this.val;
        } else {
            if (Objects.nonNull(this.next)) {
                return this.next.get(index-1);
            } else return null;
        }
    }

    public Event getObject(int index) {
        if (this.val.getId() == index) {
            return this.val;
        } else return this.next.getObject(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.val == null) {
            sb.append("[]");
        } else {
            sb.append(this.val);
            if (Objects.nonNull(this.next)) {
                sb.append(",").append(this.next.toString());
            }
        }
        return sb.toString();
    }
}
