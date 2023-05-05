public class Rectangle implements Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double computeArea(){
        return this.height * this.width;
    }

}

