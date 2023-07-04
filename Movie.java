
public class Movie
{
	
	public Movie(String name)
	{
		this.name = name;
		/*this.year = year;
		this.director = director;
		this.description = description;
		this.ratings = ratings;*/
	}

	private String name;
	public String getName()
	{
		return name;
	}
	public void setName( String name )
	{
		this.name = name;
	}
	
	private int year;
	public int getYear()
	{
		return year;
	}
	public void setYear( int year )
	{
		this.year = year;
	}
	
	private String director;
	public String getDirector()
	{
		return director;
	}
	public void setDirector( String director )
	{
		this.director = director;
	}

	private String description;
	public String getDescription()
	{
		return description;
	}
	public void setDescription( String description )
	{
		this.description = description;
	}

	private int ratings;
	public int getRatings()
	{
		return ratings;
	}
	public void setRatings( int ratings )
	{
		this.ratings = ratings;
	}

	public String toString()
	{
		return name + ", " + year + ", " + ratings;
	}

	public boolean equals(Object other)
	{
		Movie newMovie = (Movie)other;
		if(name.equals(newMovie.name) && director.equals(newMovie.director) && year == (newMovie.year) )
		{
			return true;
		} 
		 else { 
		 	return false; 
		}
	}

	public int compareTo(Movie other)
	{
		if( name.compareTo(other.name) > 0)
		{
			return 1;
		} else if( name.compareTo(other.name) < 0 )
		{
			return -1;
		} else 
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		Movie s = new Movie("Jim");
		Movie q = new Movie("Jim");
		s.setRatings(5);
		System.out.println(s);
		System.out.println(q.compareTo(s));
		//System.out.println(s.equals(q));
	}
}