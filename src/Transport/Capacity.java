package Transport;

public enum Capacity { EXTRA_SMALL(0, 10), SMALL(11, 25), MEDIUM(40, 50), LARGE(60,80), EXTRA_LARGE(100,120);
    public int from;
    public int to;
    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
