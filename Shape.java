public class Shape {

    void calculate_area() {
        System.out.println("Area is ....");
    }
}

class Rectangle extends Shape {
    @Override
    void calculate_area() {
        int l = 12, b = 32;
        int area = l * b;
        System.out.println("Area of Rectangle is :" + area);

    }

}

class Triangle extends Shape {
    @Override
    void calculate_area() {
        int h = 12, b = 32;
        int area = (h * b) / 2;
        System.out.println("Area of Triangle is :" + area);

    }

}

class Square extends Shape {
    @Override
    void calculate_area() {
        int s = 24;
        int area = s * s;
        System.out.println("Area of Square is :" + area);

    }

    public static void main(String[] args) {
        Shape obj = new Rectangle();
        Shape obj2 = new Triangle();
        Shape obj3 = new Square();
        obj.calculate_area();
        obj2.calculate_area();
        obj3.calculate_area();
    }
}
