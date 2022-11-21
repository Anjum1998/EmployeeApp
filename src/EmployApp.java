import java.util.ArrayList;
import java.util.Scanner;

public class EmployApp {
    public static void main(String[] args) {
        int ex;
        ArrayList<Object> arr =new ArrayList<Object>();
    do {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Choice: 1.Add Employee 2.View Employee 3.Search Employee 4.Delete Employee 5.Exit");
        int option=sc.nextInt();

        switch (option)
        {
            case 1:

                System.out.println("Enter Emp code");
                int code=sc.nextInt();
                arr.add(code);


                System.out.println("Enter Name");
                String name= sc.next();
                arr.add(name);

                System.out.println("Enter Designation");
                String des= sc.next();
                arr.add(des);

                System.out.println("Enter Salary");
                double salary= sc.nextDouble();
                arr.add(salary);

                System.out.println("Enter Company Name");
                String com= sc.next();
                arr.add(com);

                System.out.println("Enter Phone Number");
                int phone= sc.nextInt();
                arr.add(phone);

                System.out.println("Enter Email");
                String email= sc.next();
                arr.add(email);

                System.out.println("ArrayList values are : ");

                for (int i=0;i<arr.size();i++)
                {
                    System.out.println(arr.get(i));
                }
                System.out.println();
                break;
            case 2:

                System.out.println("Display All Employ Details");
                for (int i=0;i<arr.size();i++)
                {
                    System.out.println(arr.get(i));
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Enter the Employee Code");

                for (int i=0;i<arr.size();i++)
                {

                }
                System.out.println();


        }



        System.out.println("Do you Want to continue?1.yes 2.No");
        ex=sc.nextInt();
    } while(ex==1);
    }
}
