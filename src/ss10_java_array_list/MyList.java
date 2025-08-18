package ss10_java_array_list;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

    }

    public int size() {
        return this.size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E get(int i) {
        if (i < 0 || i > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + i + " Size:" + size);
        }
        return (E) elements[i];
    }

    public boolean add(E element) {
        if(elements.length == size){
            ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public void add(E element, int index){
        if(index>size) {
            throw new IllegalArgumentException("index " + index);
        } else if (index==size){
            ensureCapacity(1);
        }
        if(elements[index]==null){
            elements[index]=element;
            size++;
        } else {
            for (int i = size+1; i >=index; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }

}

