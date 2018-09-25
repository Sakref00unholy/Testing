public class Linje {

    private Punkt a;
    private Punkt b;

    public Linje(Punkt a, Punkt b) {
    this.a = a;
    this.b = b;
    }

    public double calculateLength() {

        return Math.sqrt(((a.getX() - b.getX())*(a.getX() - b.getX()))+((a.getY()-b.getY())*(a.getY()-b.getY())));

    }
}