import java.util.Scanner;

public class DataInput {

    Scanner input = new Scanner(System.in);

    public String sexInput()  {
        System.out.println("What gender you want to check? Type F for female, M for male.");
        return input.nextLine();
    }

    public String nameInput() {
        System.out.println("What name you want to check?");
        return input.nextLine();
    }
}
