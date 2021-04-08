import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // will slide the values
    public static void slider(ArrayList data, int shift) {

        int loop = 0;
        int currentPosition = 0;
        int[] arrayValues;

        // create new array list object
        ArrayList arrayList = new ArrayList();

        int currentHead = 0;
        int currentTail = 0;
        int nextValue = 0;
//        int idx = values.size(); // 3

        //n determine the number of times an array should be rotated
        int n = 3;

        // this loop adds the values to the arrayList
//        for(int i = 0; i < values.size(); i++) {
//            arrayList.add(values.get(i));
//        }

        while (loop < data.size()) {
//            currentPosition = data.size()-1;
            System.out.println(currentPosition);
            for(int i = 0; i < data.size(); i++) {
                currentPosition = data.size()-1;
                if(loop > 0) {

//                    for (int index = data.size()-1; index >=0; index--)
//                    data.set(0, currentPosition);
                    System.out.println("Index: " + i +"| Value: " + data.get(i));
                } else {
                    System.out.println("Index: " + i +"| Value: " + data.get(i));
                }

            }

        System.out.println("---------------END OF LOOP: "+ (loop+1) +"---------------");

//            currentPosition += 1;
            loop += 1;
        }
        System.out.println(data);
    }

    public static void main(String...args) {



        ArrayList<String> letters = new ArrayList<String>(
                Arrays.asList("A", "B", "C")
        );

        ArrayList<Integer> ages = new ArrayList<Integer>(
                Arrays.asList(10, 15, 20)
        );
        slider(letters, 1);
//        addValues(values2);

    }
}





//                for (int index = data.size()-1; index >=0; index--){
////                    data.set(index +1, data.get(index));
//
//                    System.out.println("Index: "+ index +"| Value: "+ data.get(index));
//                }
//                data.set(0, lastElement);
//                System.out.println("Final: "+ data);