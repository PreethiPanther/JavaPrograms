import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class sortById implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
	
}

public class MainOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Order o1 = new Order(1,"Pencil","preethi");
      Order o2 = new Order(3,"Eraser","meena");
      Order o3 = new Order(5,"scale","swetha");
      Order o4 = new Order(2,"pen","sujatha");
      
      try {
    	 FileOutputStream f = new FileOutputStream(new File("myObj1.txt"));
    	 ObjectOutputStream o = new ObjectOutputStream(f);
    	 o.writeObject(o1);
    	 o.writeObject(o2);
    	 o.writeObject(o3);
    	 o.writeObject(o4);
    	 
    	 o.close();
    	 f.close();
    	 
    	 FileInputStream fi = new FileInputStream(new File("myObj1.txt"));
         ObjectInputStream oi = new ObjectInputStream(fi);

         // Read objects
         Order pr1 = (Order) oi.readObject();
         Order pr2 = (Order) oi.readObject();
         Order pr3 = (Order) oi.readObject();
         Order pr4 = (Order) oi.readObject();
         

         System.out.println(pr1.toString());
         System.out.println(pr2.toString());
         System.out.println(pr3.toString());
         System.out.println(pr4.toString());

         oi.close();
         fi.close();
         
         ArrayList <Order> list = new ArrayList<>();
         list.add(pr1);
         list.add(pr2);
         list.add(pr3);
         list.add(pr4);
         Collections.sort(list,new sortById());
         for(int i=0;i<list.size();i++){
        	 System.out.println("sorted order::"+list.get(i));
         }
    	
      }catch (FileNotFoundException e){
    	  System.out.println("FileNotFound Exception");
      }catch (IOException e){
    	  System.out.println("InputOutput Exception");
      } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}