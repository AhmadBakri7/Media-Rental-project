package application;


public class Game extends Media {

	private double weigth;

	
	public Game(String Code,String title, int copiesAvailable, double weigth) {
		super(title, copiesAvailable);
		this.Code=Code;
		this.weigth = weigth;
		System.out.println(toString());
	}

	public Game(String title, int copiesAvailable, double weigth) {
		super(title, copiesAvailable);
		this.weigth = weigth;
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Game "+super.toString()+"[weigth=" + weigth + "]";
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	
	
	
	
	
	
}
