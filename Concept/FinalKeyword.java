class FinalKeyword {
    final int speedLimit = 90;
    
    final void run() {  // Can not Override
        // speedLimit = 400;    //  error: cannot assign a value to final variable : Compile Time Error
    }

}

final class Honda extends FinalKeyword {
    // Final Method can be inherited But you can not Override it.
    // void run() {
    //     System.out.println("Extends");
    // }    // class Honda overrides final method "FinalKeyword.run()""
    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.run();

        Honda honda = new Honda();
        honda.run();
    }
}

class Bike extends Honda { }    // if you make any Class as "final", you can't extend it.

