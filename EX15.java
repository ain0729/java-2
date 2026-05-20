public class Ex51ColorPointEx {
    public void draw() {
        System.out.println("ColorPointEx의 draw() 메서드");
    }
}
public class Line extends Shape {
    public void draw() {
        System.out.println("Line의 draw() 메서드");
}
 class Rect extends Shape {
    public void draw() {
        System.out.println("Rect의 draw() 메서드");
    }
    class Circle extends Shape {
    public void draw() {
        System.out.println("Circle의 draw() 메서드");
    }
    
}
