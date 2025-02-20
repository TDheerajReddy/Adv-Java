//Q1. Find the Largest, Second largest and  Third largest numbers from following numbers: 20, 80, 90 45
public class LargestNumber {
    public static void main(String[] args) {
        int numbers[] = {20, 80, 90, 45};
        int first, second, third;        
        for(int i=1; i < numbers.length; i++) {
            for(int j=0; j<numbers.length-1; j++) {
                if(numbers[j] < numbers[j+1]){
                    first = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = first;
                }
            }            
        }
        first = numbers[0];
        second = numbers[1];
        third = numbers[2];
        System.out.println("First Largest: "+first+"\nSecond Largest: "+second+"\nThird Largest: "+third);
    }
}
