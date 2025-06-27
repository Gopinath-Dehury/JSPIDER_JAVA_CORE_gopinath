package DSA;

public class ArrayList {
    Object[] a = new Object[10];
    int index = 0;

    // add method
    public void add(Object e) {
        if (index >= a.length)// before add the new Object it will check the index is greater than equals to
                              // length of array
            increase();// if index is greater or equal to length of array then it will call increase()
                       // to increase the size and increment will happen of the array
        a[index++] = e;
    }

    // Increase method
    private void increase() {
        Object[] t = new Object[(a.length * 3) / 2];// create a new array of Object size 1.5% bigger than previous array
                                                    // size
        for (int i = 0; i < index; i++) {// this loop will copy all element from old array to new array of bigger size.
            t[i] = a[i];
        }
        a = t;// this new bigger size array is assign to variable "a" which is Object[]
              // reference
    }

    // add inbetween position
    public void add(int pos, Object e) {
        if (pos < 0 || pos >= size()) {// it will first check the position is valid or not by (pos<0 || pos>=index)
                                       // condition
            throw new IndexOutOfBoundsException();// if not valid then throw an IndexOutOfBoundsException() Object of
                                                  // Exception type
        }
        if (index >= a.length)// checking the index when even it greater or equal to array length it call
                              // increase() method for size increment
            increase();
        for (int i = size() - 1; i >= pos; i--) {// this loop shift all elements from the position passed as argument to
                                                 // 1 positiom right means to make that place blank for insertion of new
                                                 // element
            a[i + 1] = a[i];// shifting size()-1 element to size() place 1 position right so on upto pos
                            // index
        }
        a[pos] = e;// assigning the new element in that position
        index++;// increasing the index as new element is added

    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public Object get(int pos) {
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return a[pos];

    }
    //remove method 
    public void remove(int pos) {
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = pos + 1; i < size(); i++) {
            a[i - 1] = a[i];
        }
        a[size() - 1] = null;
        index--;

    }

    public boolean contains(Object e) {
        if (size() == 0)
            return false;
        for (int i = 0; i < size(); i++) {
            if (a[i] == null && e == null)
                return true;
            if (a[i] != null && a[i].equals(e))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (index == 0)
            return "[]";
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            s.append(a[i]);
            if (i < index - 1)
                s.append(",");
        }
        s.append("]");
        return s.toString();
    }

    public void clear() {
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                a[i] = null;
            }
            index = 0;
        } else {
            System.out.println("Already Empty");
        }
    }

}