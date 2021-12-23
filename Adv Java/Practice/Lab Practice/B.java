class A
{
  A()
    {
        System.out.println("Constructor of A");

    }
    void print()
    {
        System.out.println("Hellow Java A");
    }
}

class B extends A
{
    B()
    {
        System.out.println("Constructor of B");
    }
    void print_B()
    {
        System.out.println("World of Derived Classes");
    }
    public static void main(String[] args)
    {
        
      //  A ob1 = new A();
        B ob2 = new B();        // it call Constructor of A because it extends & then call Constructor of B

        //ob1.print();
        //ob2.print();
        //ob2.print_B(); 
       // B().print_B();
       B().print_B();
    }

}