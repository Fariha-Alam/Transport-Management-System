package project_1;

public class passenger {
          private String Id,Name,contact;
          public passenger() {
        	  Id="";
        	  this.Name="";
        	  this.contact="";
        	  
          }
          public passenger(String Id,String Name,String contact) {
        	  this.Id=Id;
        	  this.Name=Name;
        	  this.contact=contact;
        	  
          }
          public String getId() {
        	  return Id;
          }
          public void  setId(String Id) {
        	  this.Id=Id;
          }
          
          public String getName() {
        	  return Name;
          }
          public void  setName(String Name) {
        	  this.Name=Name;
          }
          public String getcontact() {
        	  return contact;
          }
          public void  setcontact(String contact) {
        	  this.contact=contact;
          }
         public  String toString() {
        	 return"passenger("+"Id="+Id+",Name"+Name+",contact"+contact+')';
         }
}
