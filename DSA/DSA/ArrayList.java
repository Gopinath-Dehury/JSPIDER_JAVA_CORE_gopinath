package DSA;

public class ArrayList {
    Object[] a = new Object[10];
    int index = 0;

    public void add(Object e) {

        if (index >= a.length)
            increase();
        a[index++] = e;
    }

    private void increase() {
        Object[] t = new Object[(a.length * 2) / 3];
        for (int i = 0; i < index; i++) {
            t[i] = a[i];
        }
        a = t;
    }

    public void add(int pos, Object e) {
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index >= a.length)
            increase();
        for (int i = size() - 1; i >= pos; i--) {
            a[i + 1] = a[i];
        }
        a[pos] = e;
        index++;

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