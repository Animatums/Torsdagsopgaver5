package Task2;

import Task1.Customer;
import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<String>();

    // Spørg ind til henvisning af fil nedenunder
void loadMenuData (){
    try {
        File file = new File("C:\\Users\\xMikk\\IdeaProjects\\Task 2\\src\\Task2\\Coffee");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            coffeeMenu.add(scanner.nextLine());
        }
    }
    catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }






}







}


