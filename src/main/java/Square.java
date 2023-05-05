public class Square implements Shape{
    private double edge;

    public Square(double edge){
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double computeArea() {
        return this.edge * this.edge;
    }


}