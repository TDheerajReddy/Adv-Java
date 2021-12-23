//Constructor & Method Override
class ConsOverr
{
    public static void main(String[] args)
    {
        A3 a3 = new A3();   //call all constructors that this class extends
       // a3.print();        
    }
    
}
class A1
{
    void print()
    {
        System.out.println("Method A1");
    }
    A1()
    {
        System.out.println("Constructor of A1");
    }
}
class A2 extends A1
{
   /* void print()
    {
        System.out.println("Method A2");
    }*/
   /* A2()
    {
        System.out.println("Constructor of A2");
    }*/
}
class A3 extends A2
{
    A3()
    {
        System.out.println("Constructor of A3");
    }
  /*  void print()
    {
        System.out.println("Method A3");
    }*/
}
