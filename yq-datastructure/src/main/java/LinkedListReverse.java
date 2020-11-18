import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: LinkedListResrve
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/12 17:46
 * @Version 1.0
 **/
public class LinkedListReverse {


  public static void main(String[] args) {
    ListNode linkedList1 = new ListNode(1);
    ListNode linkedList2 = new ListNode(2);
    ListNode linkedList3 = new ListNode(3);
    ListNode linkedList4 = new ListNode(4);
    ListNode linkedList5 = new ListNode(5);
    ListNode linkedList6 = new ListNode(6);
    linkedList1.next = linkedList2;
    linkedList2.next = (linkedList3);
    linkedList3.next = (linkedList4);
    linkedList4.next =(linkedList5);
    linkedList5.next =(linkedList6);
    LinkedListReverse l = new LinkedListReverse();
    JSONObject.toJSONString(l.reverseList(linkedList1));
  }

  public ListNode reverseList(ListNode head){
      if(head == null){
          return null;
      }
      ListNode header = head;
      if(header.next == null){
          return header;
      }
      ListNode pre = header;
      ListNode current = header.next;
      if(current.next == null){
        current.next = header;
        header.next = null;
        return current;
      }
      ListNode nextList = current.next;

      while (current != null){
        current.next = pre;
        pre = current;
        current = nextList;
        if(nextList != null){
          nextList = nextList.next;
        }
      }
      header.next =null;

      return pre;
  }
}
