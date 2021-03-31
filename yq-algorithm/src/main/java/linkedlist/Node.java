package linkedlist;


/**
 * @ClassName: Node
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/3/31 16:47
 * @Version 1.0
 **/
public class Node {
  private int data;

  private Node pre;

  private Node next;

  public Node(int data, Node pre, Node next) {
    this.data = data;
    this.pre = pre;
    this.next = next;
  }
  public Node(int data) {
    this.data = data;
  }
  public Node() {
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getPre() {
    return pre;
  }

  public void setPre(Node pre) {
    this.pre = pre;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
