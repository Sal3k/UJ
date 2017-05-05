import java.io.FileNotFoundException;
import java.util.Scanner;

/** Plik 2015.txt zawiera dane o pupularności imion nadawanych w USA w roku 2015. Napisz program, który umożliwi

 wyszukanie imienia i wypisze jego pozycję i ilość;
 wypisze wszystkie imiona na daną literę (kobiety, mężczyźni, kobiety i mężczyżni) - sortując losowo, leksykograficzne lub według popularności.

 Zadanie na podstawie *12.31
 **/

public class Init {
    public static void main (String[] args) throws FileNotFoundException{

        DataInput data = new DataInput();


        SearchFile search = new SearchFile();
        search.File("/home/salek/IdeaProjects/UJ/src/UJ_Project/src/main/resources/2015.txt", data.nameInput());

    }
}
