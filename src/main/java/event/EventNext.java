package event;

public class EventNext {
    private String text;
    private EventNext left;
    private EventNext right;
    private EventNext next;
    public int e;


    public EventNext(String text, EventNext left, EventNext right) {
        this.text = text;
        this.left = left;
        this.right = right;
    }

    public EventNext getNext() {
        return next;
    }

    public void setNext(EventNext next) {
        this.next = next;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EventNext getLeft() {
        return left;
    }

    public void setLeft(EventNext left) {
        this.left = left;
    }

    public EventNext getRight() {
        return right;
    }

    public void setRight(EventNext right) {
        this.right = right;
    }
}
