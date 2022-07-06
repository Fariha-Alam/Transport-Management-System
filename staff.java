package project_1;

public class staff {
	private String driver_Id,manager_Id,driver_Name,manager_Name,driver_contact;
	public staff() {
  	  
    }
    public staff(String driver_Id,String manager_Id,String driver_Name,String manager_Name,String driver_contact) {
  	  this.driver_Id=driver_Id;
  	  this.manager_Id=manager_Id;
  	  this.driver_Name=driver_Name;
  	  this.manager_Name=manager_Name;
  	  this.driver_contact=driver_contact;
  	  
    }
    public String getdriver_Id() {
  	  return driver_Id;
    }
    public void  setdriver_Id(String driver_Id) {
  	  this.driver_Id=driver_Id;
    }
    
    public String getmanager_Id() {
    	  return manager_Id;
      }
      public void  setmanager_Id(String manager_Id) {
    	  this.manager_Id=manager_Id;
      }
    
    public String getdriver_Name() {
  	  return driver_Name;
    }
    public void  setdriver_Name(String driver_Name) {
  	  this.driver_Name=driver_Name;
    }
    public String getmanager_Name() {
    	  return manager_Name;
      }
      public void  setmanager_Name(String manager_Name) {
    	  this.manager_Name=manager_Name;
      }
    public String getdriver_contact() {
  	  return driver_contact;
    }
    public void  setdriver_contact(String driver_contact) {
  	  this.driver_contact=driver_contact;
    }
   public  String toString() {
  	 return"staff("+"driver_Id="+driver_Id+",manager_Id"+manager_Id+",driver_Name"+driver_Name+",driver_contact"+driver_contact+')';
   }


}
