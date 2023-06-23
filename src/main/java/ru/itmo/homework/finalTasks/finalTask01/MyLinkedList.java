package ru.itmo.homework.finalTasks.finalTask01;

public class MyLinkedList<T> {
    private ListNode<T> head;
    private int peekIndex;

    public MyLinkedList() {
        peekIndex = -1;
        head = null;
    }

    public MyLinkedList(T obj) {
        peekIndex = 0;
        head = new ListNode<T>(obj);
    }

    public synchronized T get(int index) {
        if (indexOutOfRange(index))
            throw new ArrayIndexOutOfBoundsException();

        int currIndex = peekIndex;
        ListNode<T> currNode = head;
        while (index < currIndex) {
            currNode = currNode.prev;
            currIndex--;
        }

        return currNode.val;
    }
    public synchronized T remove(int index) {
        if (indexOutOfRange(index))
            throw new ArrayIndexOutOfBoundsException();

        int currIndex = peekIndex;
        ListNode<T> currNode = head;
        while (index < currIndex) {
            currNode = currNode.prev;
            currIndex--;
        }

        T returnVal = currNode.val;

        if (currNode.prev != null) {
            currNode.prev.next = currNode.next;
        } else {
            head = currNode.next;
        }

        peekIndex--;
        return returnVal;


    }
    public synchronized void add(T obj) {
        ListNode<T> newHead = new ListNode<>(obj);
        newHead.prev = head;
        head = newHead;
        peekIndex++;
    }

    private boolean indexOutOfRange(int index) {
        return index > peekIndex || index < 0;
    }

    static class ListNode<T> {
        private T val;
        private ListNode<T> next;
        private ListNode<T> prev;

        ListNode(T obj) {
            val = obj;
        }

    }
}
