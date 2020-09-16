public class MyLinkedList
{
    Node head;

    void add(int data)
    {
        Node nodeToAdd = new Node(data);
        
        if(isEmpty())
        {
            head = nodeToAdd;
            return;
        }
        
        Node temp = head;
        while(temp.Next != null)
        {
            temp = temp.Next;
        }
        temp.Next = nodeToAdd;
    }
    
    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println("Element is: "+temp.data);
            temp = temp.Next;
        }
    }
    
    public void remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("You can't remove an element from empty LinkedList");
        }
        Node temp = head;
        while(temp.Next.Next != null)
        {
            temp = temp.Next;
        }
        temp.Next = null;
    }
    
    public void removeFromTop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("You can't remove an element from empty LinkedList");
        }
        
        if(head.Next == null)
        {
            head = null;
            return;
        }
        head = head.Next;
    }
    
    public boolean isEmpty()
    {
        return head==null;
    }
    
    static class Node
    {
        int data;
        Node Next;
        
        public Node(int data) 
        {
            this.data = data;
            Next = null;
        }
    }
}