public class DoublyMain 
{
    public static void main(String[] args) 
	{
        DoublyLinkedList dll = new DoublyLinkedList();

       
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtBeginning(10);
        dll.insertAtEnd(40);

        System.out.println("Current State");
        dll.displayForward();
        dll.displayBackward();

        
        System.out.println("Deletions");
        dll.deleteFromBeginning();
        dll.deleteFromEnd();

        System.out.println("Final State");
        dll.displayForward();
        dll.displayBackward();
    }
}