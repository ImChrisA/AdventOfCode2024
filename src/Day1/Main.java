package Day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Day 1 of 2024's advent of code.");

        ArrayList<Integer> List1 = new ArrayList<Integer>();
        ArrayList<Integer> List2 = new ArrayList<Integer>();

        try{
            File file = new File("C:\\Users\\chris\\IdeaProjects\\AdventOfCode2024\\src\\Day1\\input.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextInt()){
                List1.add(scan.nextInt());
                List2.add(scan.nextInt());

            }
        }catch(IOException e){
            e.printStackTrace();
        }

        //sorts the lists so the lowest numbers gets paired.
        Collections.sort(List1);
        Collections.sort(List2);

        int totalDistance = subtractPairs(List1, List2);

        System.out.println("Total distance = " + totalDistance);

    }

    private static int subtractPairs(ArrayList<Integer> List1, ArrayList<Integer> List2){
        int out = 0;

        for(int i = 0; i < List1.size(); i++){
            int subtractedPair = List1.get(i) - List2.get(i);

            if(subtractedPair < 0){
                subtractedPair *= -1;
            }

            out += subtractedPair;
        }

        return out;
    }
}
