package maymonakhanfar201910408;

public interface MyLists<E> {

    public void add(E e);

    public void add(int index, E e);

    public void remove(E e);

    public void removByIndex(int index);

    public void clear();

    public boolean isEmpty();

    public E get(int index);

    public int indexOf(E e);

    public int lastIndexOf(E e);

    public boolean contains(E e);

    public int size();

}
