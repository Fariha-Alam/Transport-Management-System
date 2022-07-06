package project_1;

class pnode
{
	passenger passenger;
	pnode next,pre;
	public pnode() {
		
	}
    public pnode(passenger passenger) {
		this.passenger=passenger;
		next=null;
		pre=null;
	}
}



public class passenger_list {
      pnode head,tail;
      public passenger_list() {
    	  head=null;
    	  tail=null;
      }
      public void insert(passenger passenger)
      {
    	  pnode node=new  pnode(passenger);
    	  if(head==null  || tail==null)
    	  {
    		  head=node;
    		  tail=node;
    	  }
    	  else
    	  {
    		  head.next=node;
    		  node.pre=head;
    		  head=node;
    	  }
      }
      public passenger searchById(String Id) {
    	  pnode temp=head;
    	  while(temp!=null)
    	  {
    		  if(temp.passenger.getId().equals(Id))
    		  {
    			  return temp.passenger;
    		  }
    		  temp=temp.pre;
    	  }
    	  return null;
      }
      public passenger searchBycontact(String contact) {
    	  pnode temp=head;
    	  while(temp!=null)
    	  {
    		  if(temp.passenger.getcontact().equals(contact))
    		  {
    			  return temp.passenger;
    		  }
    		  temp=temp.pre;
    	  }
    	  return null;
      }
}
