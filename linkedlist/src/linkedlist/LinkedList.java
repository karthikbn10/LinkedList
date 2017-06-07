package linkedlist;

public class LinkedList {
	protected Node start;
    protected Node end ;
    protected Node head;
    protected Node rear; 
    
    
    public LinkedList()
    {
        start = null;
        end = null;
        
        
    }
    
    public void display()
    {
        System.out.print("Linked List: ");
        if (start==null) 
        {
            System.out.print("list is empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getItem() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getItem()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getItem()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getItem()+ "\n");
    }
    
    public void appendItem(int item)
    {
    	
        Node nptr = new Node(item,null);    
        
        
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
       
        
        
    }
    
    public void removeItem()
    {
    	Node temp=null;
    	Node s= start;
    	if(start==null)
    	{
    		System.out.println("List was empty. There were no items to delete");
    		return;
    	}
    	
    	if(start.getLink()==null)
    	{	System.out.println(start.item+ " is removed from the list");
    		start = null;
    		end = start;    		
    		   		
    		return;
    	}
    	
    		while(s.getLink() !=null)
    		{
    			temp = s;
    			s=s.getLink();
    			    			
    		}
    		
    		temp.link = null;
    		end = temp;
    		end.link = null;
    		
    		System.out.println(s.item+ " is removed from the list");
    		
    		
    	
    		
    }
    
    public void removeTargetGreater(int target)
    {
    	if(start==null)
    	{
    		System.out.println("List was empty. There were no items to delete");
    		    		return;
    	}
    	else if(start.getLink()==null)
    	{
    		if(start.getItem()>=target)
    		{
    			start=null;
    			end=start;
    			return;
    		}
    		return;
    	
    	}
    	else
    	{
    		
    		Node current = start;
    		head = null;
    		rear = null;
    		
    		
    		while(current.getLink()!=null)
    		{
    			
    			if(current.item <= target)
    			{
    				appendItemTarget(current.getItem());
    			}
    			
    		
    			current = current.getLink();
    		
    		}
    		start = null;
    		end=null;
    		start = head;
    		end=rear;
    		
    		
    	}
    	
    	
    }
    
    public void appendItemTarget(int item)
	{
        Node nptr = new Node(item,null);    
        
        
        if(head == null) 
        {
            head = nptr;
            rear = head;
        }
        else 
        {
            rear.setLink(nptr);
            rear = nptr;
        }
	}

}
