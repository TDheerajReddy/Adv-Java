import javax.lang.model.element.ModuleElement.DirectiveVisitor;
import javax.swing.text.html.StyleSheet;

class MathOperation
{
    double sum(double a, double b)
    {
        multiply(a,b);
        return a+b;
    }

    static double multiply(double a, double b)
    {
        divide(a,b);
        return a*b;
    }

    static double divide(double a, double b)
    {
       // sum(a,b);  // Error :  non-static method sum(double,double) cannot be referenced from a static context
        return a/b;
    }
}