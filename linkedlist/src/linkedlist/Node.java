package linkedlist;

public class Node {
	
	protected int item;
    protected Node link;
 
    
    public Node()
    {
        link = null;
        item = 0;
    }    
    
    public Node(int it,Node n)
    {
        item = it;
        link = n;
    }    
    
    public void setLink(Node n)
    {
        link = n;
    }    
   
    public void setItem(int it)
    {
        item = it;
    }    
    
    public Node getLink()
    {
        return link;
    }    
    
    public int getItem()
    {
        return item;
    }

}
