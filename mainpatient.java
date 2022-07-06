package project_1;

public class mainpatient {
     public static  void main(String[] args)
     {
    	 passenger p1=new passenger("0021","asif","0111111112");
    	 passenger p2=new passenger("0022","arif","0111111113");
    	 passenger p3=new passenger("0023","manik","0111111114");
    	 passenger p4=new passenger("0024","joya","0111111115");
    	 passenger p5=new passenger("0025","monir","0111111116");
    	 
    	 
    	
    	 
    	 
    	 passenger_list plist =new passenger_list();
    	 plist.insert(p1);
    	 plist.insert(p2);
    	 plist.insert(p3);
    	 plist.insert(p4);
    	 plist.insert(p5);
    	 
    	 staff s1=new staff("driver1021","m1021","rahim","asif","0161111112\n");
    	 staff s2=new staff("driver2022","m2022","asif","lopa","0161111113\n");
    	 staff s3=new staff("driver3023","m3023","amir","manik","0161111114\n");
    	 staff s4=new staff("driver4024","m4024","karim","joya","0161111115\n");
    	 staff s5=new staff("driver5025","m5025","harun","monir","0161111116\n");
    	 
    	 staff_list slist =new staff_list();
    	 
    	 slist.insert(s1);
    	 slist.insert(s2);
    	 slist.insert(s3);
    	 slist.insert(s4);
    	 slist.insert(s5);
    	 
    	 
    	 staff m1=new staff("driver1021 ","m1021"," rahim"," asif","0161111112\n");
    	 staff m2=new staff("driver2022","m2022","asif","lopa","0161111113\n");
    	 staff m3=new staff("driver3023","m3023","amir","manik","0161111114\n");
    	 staff m4=new staff("driver4024","m4024","karim","joya","0161111115\n");
    	 staff m5=new staff("driver5025","m5025","harun","monir","0161111116\n");
    	 
    	 staff_list mlist =new staff_list();
    	 
    	 mlist.insert(m1);
    	 mlist.insert(m2);
    	 mlist.insert(m3);
    	 mlist.insert(m4);
    	 mlist.insert(m5);
    	 
    	 
    	 
    	 
    	 ticket_list tlist =new ticket_list(); 
    	 ticket t1=new ticket(p1,s1,2,"1","26 june","120tk","cumilla");
    	 ticket t2=new ticket(p1,s1,2,"3","26 june","120tk","cumilla");
    	 ticket t3=new ticket(p1,s1,3,"1","29 june","100tk","dhaka");
    	 ticket t4=new ticket(p1,s1,6,"4","26 june","120tk","cumilla");
    	 ticket t5=new ticket(p1,s1,2,"1","26 june","120tk","cumilla");
    	 
    	 
    	 tlist.enqueue(t1);
    	 tlist.enqueue(t2);
    	 tlist.enqueue(t3);
    	 tlist.enqueue(t4);
    	 tlist.enqueue(t5);
    	 tlist.print();
    	 
    	 
    	 
    	 
    	 
    	// mlist.all_manager_info();
    	 
    	 
    	// slist.all_staff_info();
    	// System.out.println(slist.searchById("d4024").getdriver_contact());
    	 //System.out.println(slist.searchBycontact("0161111114").getdriver_Name());
     }
}
