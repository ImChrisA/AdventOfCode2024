import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> List1 = new ArrayList<Integer>();
        ArrayList<Integer> List2 = new ArrayList<Integer>();

        try{
            File file = new File("C:\\Users\\chris\\IdeaProjects\\AdventOfCode2024\\src\\input.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextInt()){
                List1.add(scan.nextInt());
                List2.add(scan.nextInt());

            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(List1);
        System.out.println(List2);
    }
}