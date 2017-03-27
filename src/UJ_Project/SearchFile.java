package UJ_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Salek on 23.03.2017.
 */
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
