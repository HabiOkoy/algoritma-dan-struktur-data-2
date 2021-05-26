package Tugas5;
	public class No1_Node {
	    protected int data;
	    protected No1_Node link;
	    
	    /* Constructor */
	    public No1_Node()
	    {
	        link = null;
	        data = 0;
	    }
	    
	    /* Constructor */
	    public No1_Node (int d, No1_Node n)
	    {
	     data = d;
	     link = n;
	    }
	    
	        /* Function to get data from current Node */
	    public void setLink(No1_Node n)
	    {
	     link = n;
	    }
	    
	        /* Function to get data from current Node */
	    public void setData(int d)
	    {
	     data = d;
	    }
	    
	        /* Function to get data from current Node */
	    public No1_Node getLink()
	    {
	     return link;
	    }
	    
	    /* Function to get data from current Node */
	    public int getData()
	    {
	     return data;
	    }
	}

