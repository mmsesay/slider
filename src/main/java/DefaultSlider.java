import java.util.ArrayList;

public class DefaultSlider<T> implements Slider<T> {

    private int startIndex, rounds, roundIndex, roundsRead, current;
    private String itemsDirection;

    private ArrayList<T> items = new ArrayList<>(); // instantiate an ArrayList object

    // constructor
    public DefaultSlider (String direction) {
        itemsDirection = direction;
    }

    @Override
    public int cap() {
        return items.size(); // return the size of the ArrayList object
    }

    @Override
    public void add(T t) {
        items.add(t); // add any new items
    }

    @Override
    public T next() {

        if (items.isEmpty()) throw new IllegalStateException("Slider has no next element");

        if(roundsRead == items.size()) {
            rounds++; // increment the rounds

            switch (itemsDirection){
                case "right": startIndex = (items.size() - rounds) % items.size(); // go right
                    break;
                case "left": startIndex = (items.size() + rounds) % items.size(); // go left
                    break;
                default: System.out.println("The provided items direction is not valid. Keyword right or left are the ones required.");
            }

            current = roundIndex = startIndex; // set the current position based on the startIndex
            roundsRead = 0; // reset the roundsRead
        } else {

            if (startIndex == 0) {
                current = roundIndex;
                roundIndex++;
            }
            else {
                roundIndex = (roundIndex + 1) % items.size();
                current = roundIndex;
            }

        }

        ++roundsRead;
        return items.get(current);

    }
}
