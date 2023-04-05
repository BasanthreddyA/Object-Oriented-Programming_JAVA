public class Rectangle {

    //states
    private int length;
    private int width;

//Creation
    public Rectangle(int length, int width) {
        this.length=length;
        this.width=width;
    }

//operation


    public int getLength() {
        return length;
    }

    public Rectangle setLength(int length) {
        this.length = length;
        return this;
    }
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length + width);
    }

    public String toString(){
        return String.format("length - %d  width - %d area - %d  perimeter - %d ",length,width,area(),perimeter());
    }

}
