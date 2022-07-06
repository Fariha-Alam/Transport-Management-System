package project_1;


class dnode
{
	staff staff;
	dnode next,pre;
	public dnode() {
		
	}
    public dnode(staff staff) {
		this.staff=staff;
		next=null;
		pre=null;
	}
}



public class staff_list {
	dnode head,tail;
	
    public staff_list() {
  	  head=null;
  	  tail=null;
    }
    public void insert(staff staff)
    {
  	  dnode node=new  dnode(staff);
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
    public staff searchById(String Id) {
  	  dnode temp=head;
  	  while(temp!=null)
  	  {
  		  if(temp.staff.getdriver_Id().equals(Id))
  		  {
  			  return temp.staff;
  		  }
  		  temp=temp.pre;
  	  }
  	  return null;
    }
    public staff searchBycontact(String contact) {
  	  dnode temp=head;
  	  while(temp!=null)
  	  {
  		  if(temp.staff.getdriver_contact().equals(contact))
  		  {
  			  return temp.staff;
  		  }
  		  temp=temp.pre;
  	  }
  	  return null;
    }
    public void all_staff_info() 
    {
    	  dnode temp=head;
    	  while(temp!=null)
    	  {
    		  System.out.println("staff\n"+temp.staff.getdriver_Id()+"\n name:"+temp.staff.getdriver_Name()+"\n contact:"+temp.staff.getdriver_contact());
    		  temp=temp.pre;
    	  }
    	 
      }
    public void all_manager_info() 
    {
    	  dnode temp=head;
    	  while(temp!=null)
    	  {
    		  System.out.println("\n staff\n"+temp.staff.getmanager_Id()+"\n name:"+temp.staff.getmanager_Name());
    		  temp=temp.pre;
    	  }
    	 
      }
}
