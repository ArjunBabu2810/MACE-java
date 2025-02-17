class Figure{
    public int areaRectangle(int l,int w){
        return l*w;
    }
    public double areaRectangle(double l,double  w){
        return l*w;
    }
    public int areaSquare(int s){
        return s*s;
    }
    public double areaSquare(double s){
        return s*s;
    }
    public double areaCircle(double r){
        return 3.14*r*r;
    } 
    public double areaTriangle(double b,double h){
        return b*h*0.5;
    }
}
public class DemoOverLoading {
    public static void main(String[] args) {
        Figure f = new Figure();
        System.out.println("Rectangle : "+f.areaRectangle(3, 4));
        System.out.println("Rectangle : "+f.areaRectangle(3.6, 4.5));
        System.out.println("Square : "+f.areaSquare(3));
        System.out.println("Square : "+f.areaSquare(3.6));
        System.out.println("Circle : "+f.areaCircle(3.5));
        System.out.println("Triangle : "+f.areaTriangle(5, 7));

        
    }
    
}
