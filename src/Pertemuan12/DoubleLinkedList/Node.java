/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan12.DoubleLinkedList;

/**
 *
 * @author Farisa
 */
public class Node {
    int data;
    Node prev,next;

    public Node(Node prev, int data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    } 
}
