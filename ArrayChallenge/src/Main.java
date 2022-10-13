import java.util.*;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int[] intArray=getInteger(size);
    }
    public static int[] getInteger(int size){
        System.out.println("Enter "+size+ "values\r");
        int[] values=new int[size];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
}