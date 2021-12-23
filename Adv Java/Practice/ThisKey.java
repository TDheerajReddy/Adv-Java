class ThisKey
{
    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println(obj);
        obj.m();
    }
}

class A1
{
    void m()
    {
       System.out.println(this);
    }
}