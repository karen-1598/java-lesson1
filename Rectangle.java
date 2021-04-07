package lesson_3;

public class Rectangle {

    private int height;
    private int width;

    public int parameter()
    {
        return (height+width)*2;
    }

    public int surface()
    {
        return height*width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
