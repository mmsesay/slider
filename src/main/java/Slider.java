public interface Slider<T> {

  int cap();
  void add(T t); // add new values
  T next(); // return the next sequence

}
