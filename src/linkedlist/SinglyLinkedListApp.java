/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author User
 */
public class SinglyLinkedListApp {
    public static void main(String[] args) {
    SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(10);
        lk.display();
        lk.insertAwal(20);
        lk.display();
        lk.insertAkhir(30);
        lk.display();
        lk.insertAwal(40);
        lk.display();
        lk.insertAtPos(50, 2);
        lk.display();
        lk.insertAkhir(60);
        lk.display();
        lk.deleteAtPos(2);
        lk.display();
    }
}
