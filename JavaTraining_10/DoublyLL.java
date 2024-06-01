import java.util.Scanner;

public class DoublyLL {
    public class GetNode{
        int data;
        GetNode right, left;

        public  GetNode(){
            right = null;
            left = null;
        }
    }
    GetNode head = null;
    Scanner sc = new Scanner(System.in);

    @SuppressWarnings("unused")
    public void append(){
        System.out.print("Enter data to be inserted: ");
        int data = sc.nextInt();

        GetNode newNode = new GetNode();
        newNode.data = data;
        if(newNode == null){
            System.out.println("Memory is Empty");
        }
        else if(head==null){
            head = newNode;
        } else{
            GetNode ptr = head;
            while(ptr.right != null){
                ptr = ptr.right;
            }
            ptr.right = newNode;
            System.out.println(data+" appended successfully!");
        }
    }

    public void appendBegin(){

        System.out.print("Enter data to be inserted: ");
        int data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        newNode.left = null;

        GetNode ptr = head;

        head = newNode;
        newNode.right=ptr;
    }

    public void appendAfter(){
        System.out.println("Enter data to be inserted: ");
        int data = sc.nextInt();
        System.out.println("Enter data after which to insert: ");
        int key = sc.nextInt();

        GetNode newNode = new GetNode();
        newNode.data = data;
        GetNode ptr = head;
        while(ptr.data != key){
            ptr = ptr.right;
        }
        GetNode ptr1 = ptr.right;
        ptr.right = newNode;
        newNode.left = ptr;
        newNode.right = ptr1;
    }

    public void deleteEnd(){
        GetNode ptr = head;
        GetNode prevPtr = head;
        while(ptr.right != null){
            prevPtr = ptr;
            ptr = ptr.right;
        }
        prevPtr.right = null;
        System.out.println("Deleted node from End!");
    }

    public void deleteBegin(){
        head = head.right;
        System.out.println("Deleted node from Begin!");
    }

    public void deleteAnywhere(){
        System.out.println("Enter data after which to delete: ");
        int data = sc.nextInt();
        GetNode ptr = head;
        while(ptr.data != data){
            ptr = ptr.right;
        }
        GetNode ptr1 = ptr.right;
        ptr.right = ptr1.right;
        ptr1.left= ptr;
        System.out.println("Deleted node after "+ptr.data+" successfully!");
        ptr1 = null;
    }


    public void traverse(){
        GetNode ptr = head;
        while(ptr!=null){
            System.out.print("|"+ptr.data+"|<-->");
            ptr = ptr.right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLL d = new DoublyLL();
        int choice;
        do {
            System.out.println("\n1. Append(add at end)");
            System.out.println("2. Add at Begin");
            System.out.println("3. Add after a node");
            System.out.println("4. Delete End");
            System.out.println("5. Delete at anywhere");
            System.out.println("6. Delete from Begin");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    d.append();
                    break;
                case 2:
                    d.appendBegin();
                    break;
                case 3:
                    d.appendAfter();
                    break;
                case 4:
                    d.deleteEnd();
                    break;
                case 5:
                    d.deleteAnywhere();
                    break;
                case 6:
                    d.deleteBegin();
                    break;
                case 7:
                    d.traverse();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);
        sc.close();
    }
}
