package maymonakhanfar201910408;

import javax.swing.JOptionPane;

public class MyArrayList<E> implements MyLists<E> {

    private int size = 0;
    private int capacity = 16;
    private Object element[] = new Object[capacity];

    public MyArrayList() {
    }

    public void ensureCapacity() {
        E temp[] = (E[]) new Object[element.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = (E) element[i];
        }
        element = temp;
    }

    public void setElement(E[] element) {
        this.element = element;
    }

    @Override
    public void add(E e) {
        if (size == element.length) {
            ensureCapacity();
        }
        element[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            JOptionPane.showMessageDialog(null, "    index is outside the limits of list , size = " + size);
        } else if (index == size) {
            add(e);
        } else {
            if (size == element.length) {
                ensureCapacity();
            } else {
                for (int i = size - 1; i >= index; i--) {
                    element[i + 1] = element[i];

                }
                element[index] = e;
                size++;
            }
        }
    }

    @Override
    public void remove(E e) {
        if (size == 0) {
            JOptionPane.showMessageDialog(null, "   No element to remove , size = " + size);
        } else {
            size--;
        }
    }

    @Override
    public void removByIndex(int index) {
        if (index >= size || index < 0) {
            JOptionPane.showMessageDialog(null, "   index is outside the limits of list , size =" + size);
        } else {

            for (int i = index; i < size - 1; i++) {
                element[i] = element[i + 1];
            }

            size--;

        }
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index >= size) {
            JOptionPane.showMessageDialog(null, "   index is outside the limits of list , size = " + size);
        }
        return (E) element[index];
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(e)) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--) {
            if (element[i].equals(e)) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(e)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        return size;

    }

   

}
