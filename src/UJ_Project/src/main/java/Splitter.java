import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Splitter {



    public static void main (String[] args) {

        BufferedReader br = null;
        String[] position = new String[1100];
        String[] maleName = new String[1100];
        String[] maleAmountOfNamesGiven = new String[1100];
        String[] femaleName = new String[1100];
        String[] femaleAmountOfNamesGiven = new String[1100];


        try {

            String currentLine;
            br = new BufferedReader(new FileReader("resources/2015.txt"));

            int i = 0;
            while ((currentLine = br.readLine()) != null) {
                String[] arr = currentLine.split("\t");

                position[0] = arr[0];
                maleName[1] = arr[1];
                maleAmountOfNamesGiven[2] = arr[2];

                if (arr.length == 4)
                femaleName[3] = arr[3];
                if (arr.length == 5)
                femaleAmountOfNamesGiven[4] = arr[4];

                i++;
                System.out.print(position[0] + "\t");
                System.out.print(maleName[1] + "\t");
                System.out.print(maleAmountOfNamesGiven[2] + "\t");
                System.out.print(femaleName[3] + "\t");
                System.out.print(femaleAmountOfNamesGiven[4] + "\t\n");

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
