package UJ_Project;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Salek on 23.03.2017.
 */
public class Init {
    public static void main (String[] args) throws FileNotFoundException{

        DataInput data = new DataInput();
        data.sexInput();


        if (data.sexInput() == "F" ) {


        }

        else if (data.sexInput() == "M") {

        }




        SearchFile search = new SearchFile();
        search.File("resources/2015.txt", data.nameInput());

    }
}
