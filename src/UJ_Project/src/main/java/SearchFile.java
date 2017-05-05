import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SearchFile {

    public void File(String fileName, String searchName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));


//            String line = input.nextLine();

            DataInput sex = new DataInput();

            if (sex.sexInput().equals("M")) {
                while(input.hasNext()){
                    String position = input.next();
                    String maleName = input.next();
                    String malePopularity = input.next();
                    System.out.println(position + "\t" + maleName + "\t" + malePopularity + "\n");
                }
            }
            else if (sex.sexInput().equals("F")) {
                while(input.hasNext()){
                    String position = input.next();
                    String femaleName = input.next();
                    String femalePopularity = input.next();
                    System.out.println(position + "\t" + femaleName + "\t" + femalePopularity + "\n");
                }
            }

//            if(line.contains(searchName))
//                System.out.println(line);
    }

}

