//Constructor & Method Overloading
class ConsOverl
{
    ConsOverl()
    {
        System.out.println("Default Contructor");
    }
    ConsOverl(String st)
    {
        System.out.println("String Contructor : "+st);
    }
    ConsOverl(int st)
    {
        System.out.println("Integer Contructor : "+st);
    }
    
    void print(double p)
    {
        System.out.println("Double Print : "+p);
    }
    void print(int p)
    {
        System.out.println("Integer Print : "+p);
    }
    void print()
    {
        System.out.println("Empty Print");
    }  
    
    public static void main(String[] args)
    {
        ConsOverl obj2 = new ConsOverl("Hellow Java");
        ConsOverl obj1 = new ConsOverl();
        ConsOverl obj3 = new ConsOverl(23);
        
        obj3.print();
        obj2.print(89.33);
        obj2.print(33);
    }
}

