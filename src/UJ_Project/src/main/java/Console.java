import java.util.Scanner;


public class Console {

    public int Menu() {
        final String filePath = "../resources/2015.txt";
        int gen = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to check? \n 1. Search file by gender \n 2. Search file by name \n 3. Search file by first letter");
        int menuValue = input.nextInt();

        switch (menuValue) {
            case 1:
                DataInput.genderInput();
                gen = input.nextInt();
                
                SearchFile search = new SearchFile();
                search.File(filePath, gen);
                break;
            case 2:
                break;
            case 3:
                break;

        }
        return gen;
    }
}
