package Day2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<Integer>();
        Collections.addAll(List1, 7,6,4,2,1);

        System.out.println(decByAtMostThree(List1));
        System.out.println(incByAtMostThree(List1));

    }

    private static boolean decByAtMostThree(ArrayList<Integer> list){

        for(int i = 0;i < list.size() - 1; i++){
            int diff = list.get(i) - list.get(i + 1);
            if(diff > 3){
                return false;
            } else if (diff <= 0) {
                return false;
            }

        }
        return true;
    }

    private static boolean incByAtMostThree(ArrayList<Integer> list){

        for(int i = 0; i < list.size() -1; i++){
            int diff = list.get(i + 1) - list.get(i);
            if(diff > 3 ){
                return false;
            } else if (diff <= 0) {
                return false;
            }
        }

        return true;

    }

}