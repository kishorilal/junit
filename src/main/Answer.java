package main;

public class Answer {
    int aid;
    String name;
    String by;

    public Answer(int aid, String name, String by) {
        this.aid = aid;
        this.name = name;
        this.by = by;
    }

    @Override
    public String toString() {
        return aid+"  "+name+"  "+by;
    }
}
