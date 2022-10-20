package tree;

public abstract class ObjectTree<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
