class Cons
{
    int l, b;
    Cons()
    {
        l=10;
        b=20;
    }
    Cons(int x, int y)
    {
        l=x;
        b=y;
    }
    int calarea()
    {
        return (l*b);
    }
    public static void main(String[] args)
    {
        Cons ob1 = new Cons();
        Cons ob2 = new Cons(15, 20);
        System.out.println(ob1.calarea());
        System.out.println(ob2.calarea());        
    }
    
}
