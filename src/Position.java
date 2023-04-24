public class Position {
    protected int x;
    protected int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
// solo se ejecuta si desde el main se ejecuta la variable de referencia  -  osea variable.toString desde main
    @Override
    public String toString() {
        return "Position " +
                "x=" + x +
                ", y=" + y ;
    }
}
