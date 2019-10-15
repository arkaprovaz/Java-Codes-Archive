import java.util.ArrayList;
public final class SelectionSort {
    private ArrayList<Integer> array = null;
    public ArrayList<Integer> getArray() {
        return array;
    }
    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }
    public SelectionSort() {
        array = new ArrayList<Integer>();
        getArray().add(62);
        getArray().add(20);
        getArray().add(82);
        getArray().add(70);
        getArray().add(49);
        getArray().add(40);
        getArray().add(18);
        getArray().add(50);
    }
    public ArrayList<Integer> sort() {
        int index = 0;
        int value = 0;
        int counter = 0;
        int current_value = 0;
        try {
            System.out.println("The initial array is: " + getArray());
            if (getArray() != null && !getArray().isEmpty()) {
                while (counter < getArray().size()) {
                    boolean change = false;
                    value = getArray().get(counter);
                    current_value = value;
                    for (int position = counter; position < getArray().size(); position++) {
                        if (getArray().get(position) < current_value) {
                            change = true;
                            current_value = getArray().get(position);
                            index = getArray().indexOf(current_value);
                        }
                    }
                    if (change) {
                        // swapping takes place
                        getArray().set(counter, current_value);
                        getArray().set(index, value);
                    }
                    System.out.println("Phase : " + (counter + 1) + " " + getArray());
                    counter += 1;
                }
            } else {
                System.out.println("Unable to sort array as there are no elements");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }
    public static void main(String[] args) {
        try {
            SelectionSort sort = new SelectionSort();
            sort.sort();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
