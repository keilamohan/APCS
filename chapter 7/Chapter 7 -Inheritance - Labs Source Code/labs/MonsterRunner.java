import java.util.Scanner;

public class MonsterRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st monster's name : ");
        String name1 = scan.nextLine();
        System.out.println("Enter 1st monster's size : ");
        int size1 = scan.nextInt();

        System.out.println("Enter 2nd monster's name : ");
        String name2 = scan.nextLine();
        System.out.println("Enter 2nd monster's size : ");
        int size2 = scan.nextInt();

        Skeleton mon1 = new Skeleton(size1, name1);
        mon1.toString();
    
        Skeleton mon2 = new Skeleton(size2, name2);
        mon2.toString();

        if (mon1.isSmaller(mon2))
        {
            System.out.println("Monster one is smaller than Monster two");
        }
        if (mon1.isBigger(mon2))
        {
            System.out.println("Monster one is bigger than Monster two");
        }
        if ((mon1.namesSame(mon2)))
        {
            System.out.println("Monster one has the same name as Monster two");
        }
        else
        {
            System.out.println("Monster one does not have the same name as Monster two");
        }

    }
}