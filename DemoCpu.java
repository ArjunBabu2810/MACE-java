class Cpu{
    int price;

    public Cpu(int price){
        this.price=price;
    }
    public void display(){
        System.err.println("Price : "+price);
    }
    class Processor{
        int cores;
        String manufacturer;

        public Processor(int cores,String manufacturer){
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        public void display2(){
            System.out.println("cores : "+cores);
            System.out.println("Manufacturer : "+manufacturer);
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        public RAM(int memory,String manufacture){
            this.memory=memory;
            this.manufacturer = manufacture;
        }
        public void display3(){
            System.out.println("Memory : "+memory);
            System.out.println("RAM Manufacturer : "+manufacturer);
        }
    }
}
public class DemoCpu {
    public static void main(String[] args) {
        Cpu c =  new Cpu(1434);
        Cpu.Processor p = c.new Processor(4,"AMD");
        Cpu.RAM r = new Cpu.RAM(8, "AMD");
        c.display();
        p.display2();
        r.display3();
    }
}
