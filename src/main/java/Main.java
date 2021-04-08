import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // will slide the values
    public static <V> void slider(ArrayList<V> data) {

        // create new array list object
        ArrayList arrayList = new ArrayList();

        int outerLoopCounter = 0;
        int currentPosition = 0;
        int nextPosition = 0;

        // this loop adds the values to the arrayList
//        for(int i = 0; i < values.size(); i++) {
//            arrayList.add(values.get(i));
//        }

        while (outerLoopCounter < data.size()) {
            currentPosition = data.size()-1;

            if (outerLoopCounter == 0) {
                // this loop prints out the values in asc order
                for(int i = 0; i < data.size(); i++)
                    System.out.println("Index: " + i +"| Value: " + data.get(i));
            } else {

                // this loop prints out the values in desc order
                for (int index = data.size()-1; index >= 0; index--) {

                    System.out.println("Index: " + index +"| Value: " + data.get(index));
                    data.add(index, data.get(index));
//                    index = index % currentPosition;
//                    System.out.println("Index: " + index +"| Value: " + data.get(nextPosition));

                }
            }
            System.out.println("---------------END OF LOOP: "+ (outerLoopCounter+1) +"---------------");
            outerLoopCounter += 1; // increment the outerLoopCounter
//            nextPosition = currentPosition % nextPosition;
        }
    }

    public static void main(String...args) {

//        ArrayList<String> letters = new ArrayList<String>(
//                Arrays.asList("A", "B", "C")
//        );
//
//        ArrayList<Integer> ages = new ArrayList<Integer>(
//                Arrays.asList(10, 15, 20)
//        );
//        slider(letters);

        DefaultSlider<String> dfs = new DefaultSlider<>();
        dfs.add("0");
        dfs.add("1");
        dfs.add("2");
        dfs.add("3");
        dfs.add("4");
        dfs.add("5");
        dfs.add("6");
        dfs.add("7");
        for(int i =0; i < dfs.cap(); i++){
            System.out.print("Round "+i+": ");
            for(int j =0; j < dfs.cap(); j++){
                System.out.print(dfs.next()+" -> ");
            }
            System.out.println("");
        }
    }
}