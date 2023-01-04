package InterviewProgrammig.SecondLevelProgramming;

import java.util.Scanner;

class node<T> {
    T data;
    node<T> next;

    node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReverse {
    public static node<Integer> input() {
        try (Scanner sc = new Scanner(System.in)) {
            int data = sc.nextInt();
            node<Integer> head = null;
            node<Integer> tail = null;

            while (data != -1) {
                node<Integer> curr = new node<>(data);
                if (head == null) {
                    head = curr;
                    tail = curr;
                } else {
                    tail.next = curr;
                    tail = curr;
                }
                data = sc.nextInt();
            }
            return head;
        }
    }

    public static void printLL(node<Integer> head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static node<Integer> linkedListReverse(node<Integer> head) {
        node<Integer> prev = null;
        node<Integer> Next = null;
        node<Integer> curr = head;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        node<Integer> head = input();
        node<Integer> newHead = linkedListReverse(head);
        printLL(newHead);

    }

}
