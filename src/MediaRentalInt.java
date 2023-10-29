package application;

import java.util.ArrayList;
import java.util.*;

public interface MediaRentalInt {

	public void addCustomer(String ID, String name, String address,String mobileNumber, String plan);
	void addMovie(String Code,String title, int copiesAvailable, String rating);
	void addGame(String Code,String title, int copiesAvailable, double weigth);
	void addAlbum(String Code,String title, int copiesAvailable, String artist, String song);
	
	void setLimitedPlanLimit(int value);
	
	public String getAllCustomersInfo();
	public String getAllMediaInfo();
	
	public boolean addToCart(String customerName,String mediaTitle);
	public boolean removeFromCart(String customerName, String mediaTitle);

	
	public String processRequests();
	
	public boolean returnMedia(String customerName,String mediaTitle);
	public ArrayList<String> searchMedia(String title,String rating, String artist,String songs);

	
	
}
