import java.util.Scanner;

/**
 * Created by students on 03/02/22.
 */
public class TestCircularlyList {
    public static void main(String[] args) {
        CircularlyLinkedList<String>l= new CircularlyLinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("1 add first 2 add last\n 3 removeFirst " +
                "4 rotate\n 0 exit");
        int choice=-1;
        while (choice!=0)
        {
            System.out.print("your choice :");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input name");
                    l.addFirst(in.next());
                    System.out.println("first= "+l.first()+"\tlast= " +
                            ""+l.last()+"\t size= "+l.size());
                    break;
                case 2:
                    System.out.println("input name");
                    l.addLast(in.next());
                    System.out.println("first= "+l.first()+"\tlast= " +
                            ""+l.last()+"\t size= "+l.size());
                    break;
                case 3:
                System.out.println("deleted is "+l.removeFirst());
                System.out.println("first= "+l.first()+"\tlast= " +
                        ""+l.last()+"\t size= "+l.size());
                break;
                case 4:
                    l.rotate();
                    System.out.println("first= "+l.first()+"\tlast= " +
                            ""+l.last()+"\t size= "+l.size());
                    break;
                case 0:
                    System.exit(0);
                      break;

            }
        }
    }
}










