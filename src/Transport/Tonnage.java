package Transport;
public enum Tonnage {
    N1(0, 3.5D), N2(3.5D, 12D), N3(12D, 1000D);
    public  double from;
    public  double to;
    Tonnage (double from, double to) {
        this.from = from;
        this.to = to;

    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
