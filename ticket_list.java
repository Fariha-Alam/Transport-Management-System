package project_1;


class tnode
{
	ticket ti;
	tnode next,pre;
	public tnode() {
		
	}
    public tnode(ticket ti) {
		this.ti=ti;
		next=null;
		pre=null;
	}
}
public class ticket_list {
     tnode head,tail;
	
    public ticket_list() {
  	  head=null;
  	  tail=null;
    }
    public void  enqueue(ticket ti)
    {
  	  tnode node=new  tnode(ti);
  	  if(head==null  || tail==null)
  	  {
  		  head=node;
  		  tail=node;
  	  }
  	  else if(head.ti.getpriority()<ti.getpriority())
  	  {
  		  head.next=node;
  		  node.pre=head;
  		  head=node;
  	  }
  	  else if(tail.ti.getpriority()>=ti.getpriority())
	  {
  		  tail.pre=node;
		  node.next=tail;
		  tail=node;
	  }
    else
  	  {
  		  tnode temp=tail;
  		while(temp!=null)
    	  {
    		  if(temp.ti.getpriority()>=ti.getpriority())
    		  {
    			  break;
    		  }
    		  temp=temp.next;
    	  }
  		  node.next=temp;
		  node.pre=temp.pre;
		  temp.pre.next=node;
		  temp.pre=node;
  	  }
    }
    public ticket dequeue() {
  	  
  		  if(head==null)
  		  {
  			  return null;
  		  }
  		 tnode ticket=head;
  		 head=head.next;
  	  
  	  return ticket.ti;
    }
    
    public void print() 
    {
    	  tnode temp=head;
    	  while(temp!=null)
    	  {
    		  System.out.println(temp.ti.getpassenger()+"\n "+temp.ti.getstaff()+"\n "+temp.ti.getpriority()+"\n "+temp.ti.getrecommend()+"\n "+temp.ti.getDate()+"\n "+temp.ti.getprice()+"\n "+temp.ti.getdestination());
    		  temp=temp.pre;
    	  }
    	 
      }
    
}