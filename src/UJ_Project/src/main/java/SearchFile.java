import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SearchFile {

    public void File(String fileName, String searchName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        while(input.hasNext()){
            String line = input.nextLine();
            if(line.contains(searchName))
                System.out.println(line);
            }

        }
    }
