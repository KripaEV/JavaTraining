import java.util.*;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
//        int[] intArray =new int[10];
//        System.out.println("first");
//        for(int i=0;i< intArray.length;i++){
//            intArray[i]=i*10;
//            System.out.println(i+1+"="+intArray[i]);
//        }
//        printArray(intArray);

        int[] getint=getIntegers(5);
        for(int i=0;i<getint.length;i++){
            System.out.println(getint[i]);
        }
        double avg=getAverage(getint);
        System.out.println("Average="+avg);
    }
    public static int[] getIntegers(int number){//int[] as return type when returning an array
    //number=no of array elts / size
        System.out.println("Enter "+number+ "values\r");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        double sum=0; //to get double as the answer, we hv to type cast
        //so sum is double. or else the answer will be in int
        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        double avg=sum/ array.length;
        return avg;
    }
//    public static void printArray(int[] array){
//        System.out.println("second");
//        for(int i=0;i<array.length;i++){
//            System.out.println(i+1+"="+array[i]);
//        }
//    }
}