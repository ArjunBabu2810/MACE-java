class Volume{
    public double cubeVolume(double s){
        return s*s*s; 
    }
    public double cuboidVolume(double l,double w,double h){
        return l*w*h;
    }
    public double sphereVolume(double r){
        return ((4.0/3.0)*(3.14*r*r*r));
    }
    public double cylinderVolume(double r,double h){
        return (3.14*r*r*h);
    }
    public double coneVolume(double r,double h){
        return ((3.14*r*r*h)*(1.0/3.0));
    }
}

public class DemoVolume {
    public static void main(String[] args) {
        Volume v = new Volume();
        System.out.println("Cube : "+v.cubeVolume(4.2));
        System.out.println("Cuboid : "+v.cuboidVolume(5.1, 3.2, 4));
        System.out.println("Sphere : "+v.sphereVolume(4.2));
        System.out.println("Cylinder : "+v.cylinderVolume(4.1, 5));
        System.out.println("Cone : "+v.coneVolume(4.1, 5)); 
    }
}
