package application;


public class Album extends Media {
	
	private String artist;
	private String song;
	
	public Album(String Code,String title, int copiesAvailable, String artist, String song) {
		super(title, copiesAvailable);
		this.Code=Code;
		this.artist = artist;
		this.song = song;
		System.out.println(toString());

	}
	public Album(String title, int copiesAvailable, String artist, String song) {
		super(title, copiesAvailable);
		this.artist = artist;
		this.song = song;
		System.out.println(toString());

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public String toString() {
		return "Album"+super.toString()+"artist=" + artist + ", song=" + song + "]";
	}
	
	

}
