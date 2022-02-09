import java.util.Scanner;

public class TestReserving {
    public static void main(String[] args) {
        Reserve<Integer>list=new Reserve<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers");
        list.addFirst(input.nextInt());
        System.out.println("Rotating");
        list.rotate(list.addFirst());


    }
}
