package wiese.aj;

public class RunModules {

    public static void main(String[] args){

        Square sq = new Square();
        System.out.println("Area of a square with a side the length of 5 is: "+ sq.area());

        Circle circ = new Circle();
        System.out.println("Area of a circle with a radius of 6 is: "+circ.area());

        Triangle tri = new Triangle();
        System.out.println("Area of a triangle with three sides the length of 5 is :"+tri.area());

        Rectangle rec = new Rectangle();
        System.out.println("Area of a rectangle with a width of 21 and a length of 22 is: "+rec.area());


    }
}
