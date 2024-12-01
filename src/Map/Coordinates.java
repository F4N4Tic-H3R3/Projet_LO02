package Map;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates soustraire(Coordinates coordinate) {
        this.x = this.x - coordinate.x;
        this.y = this.y - coordinate.y;
        return coordinate;
    }

    public Coordinates additionner(Coordinates coordinate) {
        this.x = this.x + coordinate.x;
        this.y = this.y + coordinate.y;
        return coordinate;
    }
}
