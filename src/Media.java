package application;

import java.util.*;
import java.util.ArrayList;

public abstract class Media implements Comparable<Media>{
	
	protected String Code;
	private String title;
	private int copiesAvailable; 

	public Media() {
		super();
	}

	public Media(String title, int copiesAvailable) {
		
		this.title = title;
		this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setcopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}
	
	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public int compareTo(Media m)
	{
		if (this.getTitle().compareTo(m.getTitle())>0)
			return 1;
		else if (this.getTitle().compareTo(m.getTitle())<0)
			return -1;
		else 
			return 0;
	}
	
	public void copiesIndication(boolean b)
	{
		if (copiesAvailable>0) {
		if (b==true) 
		{
			copiesAvailable++;
		}
		else 
		{
			copiesAvailable--;			
		}
	}
	}
	
	@Override
	public boolean equals(Object o) {
		
		return (this.getTitle().equals(((Media)o).getTitle()));
	}

	@Override
	public String toString() {
		return "[title=" + title + ", copiesAvailable=" + copiesAvailable + "]";
	}

	

	

	
	
	
	

	
	
	
	
	
	
	

}
