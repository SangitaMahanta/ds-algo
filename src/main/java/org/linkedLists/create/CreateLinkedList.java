package org.linkedLists.create;

public class CreateLinkedList {
static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }
    public static void main(String[] args) {
        CreateLinkedList lt=new CreateLinkedList();
        lt.head=new Node(11);
        Node second=new Node(22);
        Node third=new Node(33);
        Node fourth=new Node(44);

        lt.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        Node node = lt.head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }

    }
}
