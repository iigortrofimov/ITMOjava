package other.linkedList;



public class LinkedList {
    Node head;

    void addNode(int data, int index) {
        Node node = new Node();
        node.data = data;
        node.index = index;
        if (head == null) {
            head = node;
        } else
            node.next = head;
        head = node;
    }

    void showList() {
        Node show = head;
        while (show != null) {
            System.out.println(show.data);
            show = show.next;
        }
    }

    void showIndex() {
        Node showIndex = head;
        while (showIndex != null) {
            System.out.println(showIndex.index);
            showIndex = showIndex.next;
        }
    }

    void showDataForIndex(int index) {
        Node showDFI = head;
        while (showDFI != null) {
            if (showDFI.index == index) {
                System.out.println(showDFI.data);
            } else {
            }
            showDFI = showDFI.next;
        }
    }

    void deletNode(int index) {
        if (head == null) {
            return;
        }
        if (head.index == index) {
            head = head.next;
            return;
        }
        Node delIndex = head;
        while (delIndex.next != null){
            if(delIndex.next.index == index){
                delIndex.next = delIndex.next.next;
                return;
            } else
                delIndex = delIndex.next;
        }

//    void showListInIndex(int index) {
//        while (head != null){
//            if (head.index == index){
//                System.out.println(head.data);
//                return;
//            }else { }
//            head = head.next;
//        }
//
//    }


    }
}



