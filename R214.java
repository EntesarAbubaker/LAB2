import java.util.Scanner;

public class R214 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println("Enter index :");
        Scanner ob = new Scanner(System.in);
        int i = ob.nextInt();
        System.out.println(arr[i]);
        try {System.out.println(arr[i]);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Don’t try buffer overflow attacks in Java!”");
        }
    }
}
