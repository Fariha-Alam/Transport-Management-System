package project_1;

public class ticket {
	passenger passenger;
	staff staff;
	int priority;
	String recommend,Date;
	String price;
	String destination;
	
	public ticket(passenger passenger,staff staff,int priority,String recommend,String Date,String price,String destination) {
	  	  this.passenger=passenger;
	  	  this.staff=staff;
	  	  this.priority=priority;
	  	  this.recommend=recommend;
	  	  this.Date=Date;
	  	  this.price=price;
	  	  this.destination=destination;
	  	  
	    }
	public passenger getpassenger() {
	  	  return passenger;
	    }
	    public void  setpassenger(passenger passenger) {
	  	  this.passenger=passenger;
	    }
	    
	    
	    public staff getstaff() {
		  	  return staff;
		    }
		    public void  setstaff(staff staff) {
		  	  this.staff=staff;
		    }
	    public int getpriority() {
	    	  return priority;
	      }
	      public void  setpriority(int priority) {
	    	  this.priority=priority;
	      }
	    
	    public String getrecommend() {
	  	  return recommend;
	    }
	    public void  setrecommend(String recommend) {
	  	  this.recommend=recommend;
	    }
	    public String getDate() {
	    	  return Date;
	      }
	      public void  setDate(String Date) {
	    	  this.Date=Date;
	      }
	    public String getprice() {
	  	  return price;
	    }
	    public void  setprice(String price) {
	  	  this.price=price;
	    }
	    public String getdestination() {
		  	  return destination;
		    }
		    public void  setdestination(String destination) {
		  	  this.destination=destination;
		    }
		    public  String toString() {
		     	 return"ticket("+"passenger"+passenger.toString()+",staff"+staff.toString()+",priority"+priority+",recommend"+recommend+",Date"+Date+",price"+price+",destination"+destination+')';
		      }
}
