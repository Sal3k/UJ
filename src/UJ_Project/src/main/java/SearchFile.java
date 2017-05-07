import javax.xml.crypto.Data;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SearchFile {

    public void File(String fileName, int gen) {
        Scanner input;
        try {
            input = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e) {
            System.err.println("Coult not find file " + fileName + ": " + e.getMessage());
            return;
        }

//            String line = input.nextLine();
//        int gen = DataInput.genderInput();



        while (input.hasNext()) {
            String position = input.next();
            String maleName = input.next();
            String malePopularity = input.next();
            String femaleName = input.next();
            String femalePopularity = input.next();

            switch (gen) {
                case 1:
                    System.out.println(position + "\t" + maleName + "\t" + malePopularity + "\t");
                    break;
                case 2:
                    System.out.println(position + "\t" + femaleName + "\t" + femalePopularity + "\t");
                    break;
            }

//            if(line.contains(searchName))
//                System.out.println(line);
        }
    }
}

