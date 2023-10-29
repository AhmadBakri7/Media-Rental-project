package application;

import java.util.ArrayList;
import java.util.Collections;

public class MediaRentalManger implements MediaRentalInt{

	private ArrayList<Customer> customer=new ArrayList<>(); // ArrayList to save the data of customers 
	private ArrayList<Media> media=new ArrayList<>(); // ArrayList to save the data of Media 

	// constructor that have no arguments 
	public MediaRentalManger() {
		
		 ArrayList<Customer> customer=new ArrayList<>();
		 ArrayList<Media> media=new ArrayList<>();
	}

	// constructor that have arguments "to Arraylist" 
	public MediaRentalManger(ArrayList<Customer> customer, ArrayList<Media> media) {
		
		this.customer = customer;
		this.media = media;
	}
    
	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}

	public ArrayList<Media> getMedia() {
		return media;
	}

	public void setMedia(ArrayList<Media> media) {
		this.media = media;
	}

	//method to add customer data to the ArrayList
	@Override
	public void addCustomer(String ID, String name, String address,String mobileNumber, String plan) {
		customer.add(new Customer(ID,name , address , mobileNumber ,plan));
	}
		
	//method to add Movie data to the ArrayList
	@Override
	public void addMovie(String Code,String title, int copiesAvailable, String rating) {
		media.add(new Movie(Code, title , copiesAvailable , rating));
	}
	
	//method to add Game data to the ArrayList
	@Override
	public void addGame(String Code,String title, int copiesAvailable, double weigth) {
		media.add(new Game(Code , title , copiesAvailable , weigth));
	}
	
	//method to add Album data to the ArrayList
	@Override
	public void addAlbum(String Code,String title, int copiesAvailable, String artist, String song) {
		media.add(new Album(Code , title, copiesAvailable, artist , song));
	}
	
	//method To setLimitedPlanLimit of customer that have limited plan
	@Override
	public void setLimitedPlanLimit(int value) {

		if (value>0)
		{
			for (int i=0;i<customer.size();i++)			
				if (customer.get(i).getPlan().equalsIgnoreCase("limited"))
					  customer.get(i).setValue(value);				   						
		}
	}
	
	//method that return the information of all customers and put it in String
	@Override
	public String getAllCustomersInfo() {
		
		String x = " ";
		Collections.sort(customer);
		for(int i=0;i<customer.size();i++) {
			x += customer.get(i).toString();
		}
		return x;	
	}

	//method that return the information of all Media in and put it in String
	@Override
	public String getAllMediaInfo() {
		
		String m=" ";
		Collections.sort(media);
		for (int i=0;i<media.size();i++) {
			m+=media.get(i).toString();
		}
		
		return m;
	}

	//method that check if the name and the media are exists then if the media in cart is differ than media input add it to cart"interested"
	@Override
	public boolean addToCart(String ID,String Code) {
		boolean flag=true;
	
		Customer c = null;	
		for (int i=0;i<customer.size();i++) {
			if (customer.get(i).getID().equals(ID))
			{
				int x=i;
				c=customer.get(x);
			}		
		}
		
		if (c==null) {
			return false;
		}
		
		Media m = null  ;
		for (int i=0;i<media.size();i++) {
			if (media.get(i).getCode().equals(Code))
			{
				int y=i;
				 m=media.get(y);
			}		
			
		}	
		if (m==null) {
			return false;
		}
		for (int i=0;i<c.intrested.size();i++) {
			//System.out.println(c.intrested.get(i).getTitle());
			if (c.intrested.get(i).getCode().equals(Code)) {
				flag= false;
			}					
		}		
		if (flag==true)
			c.intrested.add(m);
		
		
		//System.out.println(m.toString());
		return flag;
	}
	
	//method that check if the name and the media are exists then if the media in cart is same as media input then remove it from cart"interested"
	@Override
	public boolean removeFromCart(String ID, String Code) {
	
        Customer c = null;
		
		for (int i=0;i<customer.size();i++) {
			if (customer.get(i).getID().equals(ID))
			{
				int x=i;
				c=customer.get(i);
			}
		}
		
		if (c==null) {
			return false;
		}
		
		Media m = null ;
		for (int i=0;i<media.size();i++) {
			if (media.get(i).getCode().equals(Code))
			{
				int y=i;
				 m=media.get(y);
			}			  
		}
		if (m==null) {
			return false;
		}
		
		for (int i=0;i<c.intrested.size();i++) {
			if (c.intrested.get(i).getCode().equals(Code)) {
				 
				c.intrested.remove(m);
				return true;			
		}			
}
		return false;	
	}
	
	/*method that check the plan of customer then check if the title in the cart"intrested" equal the title in object then 
	 add the object that contains title to the rented Array and remove the same object from intrested ArrayList then check 
	 the numberOfcopiesAvailable*/
	@Override
	public String processRequests() {
		
		String AB=" ";
		boolean flag;
		Collections.sort(customer);
		
		for (int i=0 ; i<customer.size();i++){
			Customer c = customer.get(i);
			
			if (c.getPlan().equalsIgnoreCase("limited")) {
			for (int j=0 ; j<media.size();j++) {
				Media m =media.get(j);
				String x=m.getTitle();
				
				for  (int k=0 ;k< c.intrested.size();k++) {
					if (x.equals(c.intrested.get(k).getTitle())) {
						c.rented.add(c.intrested.get(k));
						c.intrested.remove(c.intrested.get(k));
						flag =false;
						m.copiesIndication(flag);
						AB+="Sending " + x + " to "+ c.getName();	
						c.setValue(c.getValue()-1);
					}
				}
			}
		}
			else {		
				if (c.getPlan().equalsIgnoreCase("unlimited")) {
				for (int j=0 ; j<media.size();j++) {
					Media m =media.get(j);
					String x=m.getTitle();
					
					for  (int k=0 ;k< c.intrested.size();k++) {
						if (x.equals(c.intrested.get(k).getTitle())) {
							c.rented.add(c.intrested.get(k));
							c.intrested.remove(c.intrested.get(k));
							flag =false;
							m.copiesIndication(flag);
							AB="Sending "+ x + "to "+ c.getName();
						}
					}
				}
			}
		}	
	}
		
		return AB;
	}

	/*method check the name of customer and mediaTitle then check the rented ArrayList title if the title input equal the title in rented Array 
	 then remove the object that contains mediaTitle from rented ArrayList then add one copy to the media in store system */ 
	@Override
	public boolean returnMedia(String ID,String Code) {
		boolean flag=false;
        Customer c = new Customer();
		
		for (int i=0;i<customer.size();i++) {
			if (customer.get(i).getID().equals(ID))
			{
				int x=i;
				c=customer.get(x);
			}
		}
		if (c==null) {
			return false;
		}
		
		Media m = null ;
		for (int i=0;i<media.size();i++)
		{
			if (media.get(i).getCode().equals(Code))
			{
				int y=i;
				 m=media.get(y);
			}			  
		}
		if (m==null) {
			return false;
		}
		
		for (int i=0;i<c.rented.size();i++)
		{
			if (c.rented.get(i).getCode().equals(Code)) {
				c.rented.remove(m);
	    		m.copiesIndication(true);
	    		return true;
		  }
		}
		
		return flag;
	}

	/*search the title of customer and every media and if the title not have value we will ignore it and added every title to ArrayList 
	 and in the end we will sort the ArrayList with title and return it*/
	@Override
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		
		ArrayList<String> list = new ArrayList();
		boolean t= title!=null, r= rating!=null, a=artist!=null , song=songs!=null;
		
		for (int i=0;i<media.size();i++) {
			Media f = media.get(i);
			if (!t && !r && !a && !song) {
				list.add(f.getTitle());
				continue;
			}
			if (t && f.getTitle().contains(title)) {
				list.add(f.getTitle());
				continue;
			}
			if (f instanceof Movie) {
				Movie m=(Movie)f;
				if (r && m.getRating().contains(rating)) {
					list.add(m.getTitle());
					continue;
				}
				else if (f instanceof Album)
				{
					Album p =(Album)f;
					if (a && p.getArtist().contains(artist)) {
						list.add(p.getArtist());
						continue;
					}
					if (song && p.getSong().contains(songs)) {
						list.add(p.getTitle());
						continue;
					}
				}
			}
		}
		Collections.sort(list);
		return list;
	}	
}
