package application;


public class Movie extends Media {
	
	private String rating;

	public Movie(String Code,String title, int copiesAvailable, String rating) {
		super(title, copiesAvailable);
		this.Code=Code;
		this.rating = rating;
		System.out.println(toString());

	}
	public Movie(String title, int copiesAvailable, String rating) {
		super(title, copiesAvailable);
		this.rating = rating;
		System.out.println(toString());

	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie"+super.toString()+"[rating=" + rating + "]";
	}
	
	
	
	

}
