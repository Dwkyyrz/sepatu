// import java.util.List;

class LinkedList
{
    Node head; //Kepala node
 
    /*Kelas node untuk linked link*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    /* Memasukan node baru pada awalan dari list.*/
    public void push(int new_data)
    {
        /* Step 1 & 2: Meengalokasikan node dan memasukannya kedalam data*/
        Node new_node = new Node(new_data);
 
        /* 3. Membuat node selanjutnya sebagai head atau kepala*/
        new_node.next = head;
 
        /* 4. Memindahkan head atau kepala ke poin node baru*/
        head = new_node;
    }
 
    /* Memasukan node baru setelah node sebelumnya diberikan */
    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Cek jika node yang diberikan bernilai kosong/null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
 
        /* 2 & 3: Alokasikan node dan letakan kedalam Data*/
        Node new_node = new Node(new_data);
 
        /* 4. Buat node baru selanjutnya sebagai prev-node selanjutnya*/
        new_node.next = prev_node.next;
 
        /* 5. Buat prev-node selanjutnya sebagai node baru*/
        prev_node.next = new_node;
    }
    
    /* Menambahkan node baru pada akhiran. Metod ini mdidefinisikan di dalam kelas LinkedList yang ditunjukkan di atas*/
    public void append(int new_data)
    {
        /* 1. Alokasi node &
           2. Letakan kedalam data
           3. Atur selanjutnya menjadi Null*/
        Node new_node = new Node(new_data);
 
        /* 4. Jika Lingkedlist kosong, lalu buat node baru sebagai kepala */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        /* 4. Node baru ini akan menjadi node terakhir, maka
              jadikan selanjutnya sebagai null*/
        new_node.next = null;
 
        /* 5. Else atau Lainnya lintasi sampai node terakhir*/
        Node last = head;
        while (last.next != null)
            last = last.next;
 
        /* 6. Rubah node terakhir selanjutnya*/
        last.next = new_node;
        return;
    }
 
    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
 
    /* Driver program to test above functions. Ideally this function
       should be in a separate user class.  It is kept here to keep
       code compact */
    public static void main(String[] args)
    {
        // /* Start with the empty list */
        // LinkedList llist = new LinkedList();
        // // Insert 6.  So linked list becomes 6->NUllist
        // llist.append(5);
 
        // // Insert 7 at the beginning. So linked list becomes
        // // 7->6->NUllist
        // llist.push(3);
      
        // // Insert 1 at the beginning. So linked list becomes
        // // 1->7->6->NUllist
        // llist.push(2);
        // llist.push(1);
        // // Insert 4 at the end. So linked list becomes
        // // 1->7->6->4->NUllist
        // llist.append(6);
        // llist.append(7);
 
        // // Insert 8, after 7. So linked list becomes
        // // 1->7->8->6->4->NUllist
        // llist.insertAfter(llist.head.next.next, 4);
        LinkedList llist = new LinkedList();
        llist.push(3);
        llist.append(4);
        llist.push(2);
        llist.append(6);
        llist.insertAfter(llist.head.next.next, 5);
 
        System.out.println("\nLinkedlist yang terbuat : ");
        llist.printList();
    }
}