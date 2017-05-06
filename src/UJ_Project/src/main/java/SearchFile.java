import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SearchFile {

    public void File(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));


//            String line = input.nextLine();
        DataInput sex = new DataInput();
        int value = sex.sexInput();


            while (input.hasNext()) {
                String position = input.next();
                String maleName = input.next();
                String malePopularity = input.next();
                String femaleName = input.next();
                String femalePopularity = input.next();

                switch (value) {
                    case 1:
                        System.out.println(position + "\t" + maleName + "\t" + malePopularity + "\t");
                        break;
                    case 2:
                        System.out.println(position + "\t" + femaleName + "\t" + femalePopularity + "\t");
                        break;
                }
//                if (sex.sexInput().equals("M")) {
//                    System.out.println(position + "\t" + maleName + "\t" + malePopularity + "\t");
//                }
//                else if (sex.sexInput().equals("F")) {
//                    System.out.println(position + "\t" + femaleName + "\t" + femalePopularity + "\t");
//
//                }
            }

//        else if (sex.sexInput().equals("F")) {
//            while (input.hasNext()) {
//                String position = input.next();
//                String maleName = input.next();
//        String malePopularity = input.next();
//        String femaleName = input.next();
//        String femalePopularity = input.next();
//                System.out.println(position + "\t" + femaleName + "\t" + femalePopularity + "\t");
//            }
//
//        }


//            if(line.contains(searchName))
//                System.out.println(line);
    }
}


