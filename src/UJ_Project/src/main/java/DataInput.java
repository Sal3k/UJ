import java.util.Scanner;

public class DataInput {

    static Scanner input = new Scanner(System.in);

    public static int genderInput()  {
        System.out.println("What gender you want to check?");
        System.out.println("1. Male");
        System.out.println("2. Female");
        return input.nextInt();
    }

    public String nameInput() {
        System.out.println("What name you want to check?");
        return input.nextLine();
    }
}
