package LinkedList;

import javax.swing.*;
import javax.swing.undo.UndoableEdit;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;


public class LinkedListLearn {


    /*private static class Node{

        private int val;
        private Node next;

        private Node head;
        private Node tail;
        private int size;

        public Node(){}

        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
        public void insertAtFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail == null)
                tail = head;

            size++;
        }
        public void insertAtLastWithTail(int val){
            if(tail == null){
                insertAtFirst(val);
                return;
            }
            Node newNode = new Node(val);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
        public void insertAtLastWihtoutTail(int val){

            if(size == 0){
                insertAtFirst(val);
                return;
            }

            Node tempTail = head;

            for(int nodeInd = 1 ; nodeInd <= size ; nodeInd++){
                tempTail = tempTail.next;
            }
            Node newNode = new Node(val);
            tempTail.next = newNode;
            tempTail = newNode;

            tail = newNode;
            size++;

        }
        public void insertAtInd(int val, int ind) {
            if (ind < 0 || ind > size) {
                System.out.println("Invalid index");
                return;
            }

            if (ind == 0) {
                insertAtFirst(val);
                return;
            }

            if (ind == size) {
                insertAtLastWithTail(val);
                return;
            }

            Node prev = head;
            for (int i = 1; i < ind-1; i++) {
                prev = prev.next;
            }

            Node newNode = new Node(val, prev.next);
            prev.next = newNode;
            size++;
        }
        public void deleteFirst(){
            int val = head.val;
            head = head.next;
            if(head == null)
                tail = null;
            size--;
            System.out.println(val);

        }
        public void deleteLast(){
            if(tail == null){
                System.out.println("Linked List is Empty");
                return;
            }
            Node lastSecHead = head;
            for(int nodeInd = 1 ; nodeInd < size-1 ; nodeInd++){
                lastSecHead = lastSecHead.next;
            }
             tail = lastSecHead;
            tail.next = null;
            size--;
        }
        public void deleteAtInd(int ind){

            if(ind > size || ind < 0){
                System.out.print("Out of Bounds");
                return;
            }
            if(ind == 0)
                deleteFirst();
            if(ind == size)
                deleteLast();

            Node prev = head;
            for(int nodeInd = 1 ;nodeInd < ind ; nodeInd++)
                prev = prev.next;
            prev.next = prev.next.next;
            size--;
        }
        public void print(){

            Node tempHead = head;

            while(tempHead != null){
                System.out.print(" -> " +tempHead.val);
                tempHead = tempHead.next;
            }
            System.out.println();
        }
        public void printSize(){
            System.out.println(size);
        }
    }*/
    /*private static class Node{

        int val;
        Node next;
        Node prev;

        Node head;
        Node tail;
        int size;

        public Node(){}
        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node prev , Node next){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }


        public void insertFirst(int val){

            Node node = new Node(val);
            node.next = head;
            node.prev = null;
            if(head != null)
                head.prev = node;
            if(tail == null)
                tail = node;
            head = node;
            size++;
        }
        public void insertLast(int val){

            if(size == 0) {
                insertFirst(val);
                return;
            }

            Node node = new Node(val);
            node.prev = tail;
            if(tail != null)
                tail.next = node;
            tail = node;
            size++;
        }
        public void reverse(){

            if(size == 0){
                System.out.println("Empty");
                return;
            }
            Node tempTail = tail;
            tail = head;
            while(head != null){

                Node tempNext = head.next;
                head.next = head.prev;
                head.prev = tempNext;
                head = tempNext;

            }
            head = tempTail;
        }

        public void print(){

            Node tempHead = head;

            while(tempHead != null){
                System.out.print(" -> "+tempHead.val);
                tempHead = tempHead.next;
            }
            System.out.println();
        }
        public void printReverse(){

            Node tempTail = tail;

            while(tempTail != null){
                System.out.print(" -> "+tempTail.val);
                tempTail = tempTail.prev;
            }
            System.out.println();
        }
    }*/


    public static void main(String[] args) {

        // Single Linked List

        /*Node node = new Node();
        node.insertAtFirst(5);
        node.insertAtFirst(3);
        node.insertAtFirst(2);
        node.print();
        node.insertAtLastWithTail(6);
        node.print();
        node.insertAtLastWithTail(7);
        node.print();
        node.insertAtInd(4 , 3);
        node.print();
//        node.printSize();
        node.deleteFirst();
        node.print();
        node.deleteLast();
        node.print();
        node.deleteAtInd(2);
        node.print();*/

        // Double Linked List

        /*Node node = new Node();
        node.insertFirst(1);
        node.insertFirst(2);
        node.insertFirst(3);
        node.print();
        node.printReverse();
        node.insertLast(4);
        node.print();
        node.printReverse();*/
        /*Node node = new Node();
        node.insertLast(1);
        node.insertLast(2);
        node.insertLast(3);
        node.print();
        node.reverse();
        node.print();*/



    }
}
