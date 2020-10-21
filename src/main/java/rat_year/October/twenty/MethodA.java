package rat_year.October.twenty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 小夫
 * @Description TODO
 * @Date: 2020/10/21 15:57
 */
public class MethodA {

    public static void reorderList(ListNode head) {
        if (head == null){
            return;
        }
        List<ListNode> list = new ArrayList<ListNode>();
        while (head != null){
            list.add(head);
            head = head.next;
        }
        int i = 0 ;
        int j = list.size()-1;
        while (i < j){
            list.get(i).next = list.get(j);
            i++;
            if (i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode
                (1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.println(listNode);
    }

}
