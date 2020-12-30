import java.util.Scanner;

public class Main {
    public static StaffManage staffManage=new StaffManage();
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new person");
            System.out.println("2. Searching by name and display");
            System.out.println("0. Exit");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewPerson();
                    break;
                case 2:
                    System.out.println("Enter searching name");
                    String searchingName=scanner.nextLine();
                    staffManage.searchingByNameAndDisplay(searchingName);
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
    public static void addNewPerson(){
        int choice;
        System.out.println("1. Add new Worker");
        System.out.println("2. Add new Engineer");
        System.out.println("3. Add new Staff");
        choice=Integer.parseInt(scanner.nextLine());
        boolean isGoodChoice= choice==1||choice==2||choice==3;
        if (!isGoodChoice) System.out.println("Wrong choice");
        else {
            System.out.println("Enter full name");
            String fullName = scanner.nextLine();
            System.out.println("Enter birthday");
            String birthday = scanner.nextLine();
            System.out.println("Enter gender");
            String gender = scanner.nextLine();
            System.out.println("Enter address");
            String address = scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter level");
                    int level = Integer.parseInt(scanner.nextLine());
                    Person worker=new Worker(fullName,birthday,gender,address,level);
                    staffManage.addNewPerson(worker);
                    break;
                case 2:
                    System.out.println("Enter specialized");
                    String specialized = scanner.nextLine();
                    Person engineer=new Engineer(fullName,birthday,gender,address,specialized);
                    staffManage.addNewPerson(engineer);
                    break;
                case 3:
                    System.out.println("Enter job");
                    String job = scanner.nextLine();
                    Person staff=new Staff(fullName,birthday,gender,address,job);
                    staffManage.addNewPerson(staff);
                    break;
            }
        }
    }
}
