public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1, 1, 5, 5);
        MyRectangle rect2 = new MyRectangle(new MyPoint(2, 2), new MyPoint(6, 6));

        System.out.println(rect1); 
        System.out.println("Width: " + rect1.getWidth()); 
        System.out.println("Height: " + rect1.getHeight()); 
        System.out.println("Area: " + rect1.getArea()); 
        System.out.println("Perimeter: " + rect1.getPerimeter()); 

        System.out.println(rect2); 
        System.out.println("Width: " + rect2.getWidth()); 
        System.out.println("Height: " + rect2.getHeight()); 
        System.out.println("Area: " + rect2.getArea()); 
        System.out.println("Perimeter: " + rect2.getPerimeter()); 

        rect2.setTopLeft(new MyPoint(0, 0));
        rect2.setBottomRight(new MyPoint(3, 4));
        System.out.println(rect2); 
        System.out.println("Width: " + rect2.getWidth()); 
        System.out.println("Height: " + rect2.getHeight()); 
        System.out.println("Area: " + rect2.getArea()); 
        System.out.println("Perimeter: " + rect2.getPerimeter()); 
    }
}

