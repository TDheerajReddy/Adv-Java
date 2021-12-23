class MainMathOperation
{
    public static void main(String[] args)
    {
        //MathOperation mo = new MathOperation();
        //double ret1 = MathOperation(20,40);
        System.out.println(MathOperation.multiply(20,40));          //it is a Static, so we can Call with Class Name
        System.out.println(MathOperation.divide(200,40));
        //System.out.println(MathOperation.sum(200,400));             //it is not static so we can not call with Class Name
        // error: non-static method sum(double,double) cannot be referenced from a static context
    }
}