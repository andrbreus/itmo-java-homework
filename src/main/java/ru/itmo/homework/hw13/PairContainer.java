package ru.itmo.homework.hw13;

public class PairContainer<T, K> {
    private T key;
    private K value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PairContainer{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
