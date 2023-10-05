import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String>coffeeMenus = new ArrayList<String>();

    Cafe(){

    }

    void loadMenuData(){
        File file = new File("coffees.txt");
        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNext()){
                coffeeMenus.add(scan.nextLine());
                System.out.println(coffeeMenus);
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
