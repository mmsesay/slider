import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String...args) {

        DefaultSlider<String> dfs = new DefaultSlider<>("left");
        dfs.add("0");
        dfs.add("1");
        dfs.add("2");
        dfs.add("3");
//        dfs.add("4");
//        dfs.add("5");
//        dfs.add("6");
//        dfs.add("7");
        for(int i =0; i < dfs.cap(); i++){
            System.out.print("Round "+i+": ");
            for(int j =0; j < dfs.cap(); j++){
                System.out.print(dfs.next()+" -> ");
            }
            System.out.println("");
        }
    }
}
