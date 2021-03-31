package linkedlist;

import java.util.LinkedList;

/**
 * @ClassName: NodeTest
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/3/31 16:48
 * @Version 1.0
 **/
public class NodeTest {

  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    Node node7 = new Node(7);
    Node node8 = new Node(8);
    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node5);
    node5.setNext(node6);
    node6.setNext(node7);
    node7.setNext(node8);
    System.out.println(centerNode(node1).getData());
//    Node reverse = reverse(node1);
//    System.out.println(ringCheck(node1));


  }
  public static Node reverse(Node head){
    if(head == null || head.getNext() == null){
        return head;
    }
    Node pre = head;
    Node curr = pre.getNext();
    Node temp;
    while (curr != null){
      temp = curr.getNext();
      curr.setNext(pre);
      pre = curr;
      curr = temp;
    }
    head.setNext(null);
    return pre;
  }

  public static boolean ringCheck(Node head){
      if(head ==null|| head.getNext() == null){
        return false;
      }
      Node k = head;
      Node m = head;
      while (k != null && m != null){
        k = k.getNext();
        if(k != null){
          k = k.getNext();
        }
        m = m.getNext();
        if(k == m){
          return true;
        }
      }
      return false;
  }

  public static Node centerNode(Node head){
    if(head ==null|| head.getNext() == null){
      return head;
    }
    Node k = head;
    Node m = head;
    while (k!= null){
      if(k.getNext() != null){
        m = m.getNext();
      }
      k = k.getNext();
      if(k != null){
        k = k.getNext();
      }
    }
    return m;
  }
}
