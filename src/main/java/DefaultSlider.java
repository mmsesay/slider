import java.util.ArrayList;

public class DefaultSlider<T> implements Slider<T> {

    private int startIndex, rounds, roundIndex, roundsRead;

    private ArrayList<T> items = new ArrayList<T>();

    @Override
    public int cap() {
        return items.size();
    }

    @Override
    public void add(T t) {
        items.add(t); // add any new items
    }

    @Override
    public T next() {

        if(items.isEmpty()) throw new IllegalStateException("Slider has no next element");
        int current;
        if(roundsRead == items.size()) {
            rounds++; // increment the rounds
            startIndex = (items.size() + rounds) % items.size();
            current = roundIndex = startIndex;
            roundsRead = 0;
        } else {
            if(startIndex == 0) {
                current = roundIndex;
                roundIndex = (roundIndex + 1) % items.size();
            } else {
                roundIndex = (roundIndex + 1) % items.size();
                current = roundIndex;
            }

        }
        ++roundsRead;
        return items.get(current);
    }
}
