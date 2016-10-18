package MovieDataLayer;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import MovieClassLayer.Actor;
import MovieClassLayer.Director;
import MovieClassLayer.Film;

public class MovieDataLayer {
	static int i=0;
	Film film= new Film();
	Director d = new Director();
	List<Film> flims;
	public String Film_ID;
	public String Film_Name;
	public String IMDB_Rating;
	public String Director_ID;
	public String Director_Name;
	public String Actor_ID;
	public String Actor_Name;
	public String Year;

	static List<Director> Director_Names = new ArrayList<Director>();
	static List<Actor> Actor_Names = new ArrayList<Actor>();


	public MovieDataLayer() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("TestData.csv"));
		String line = br.readLine(); // Reading header, Ignoring

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			String[] fields = line.split(",");

			Film_ID = fields[0];
			Film_Name = fields[1];
			IMDB_Rating = fields[2];
			Director_ID = fields[3];
			Director_Name = fields[4];
			Actor_ID = fields[5];
			Actor_Name = fields[6];
			Year = fields[7];


			Director d = new Director();
			d.setDirectorName(Director_Name);
			d.getDirectorName();
			Director_Names.add(d);


			Actor a = new Actor();
			a.setActorName(Actor_Name);
			a.getActorName();
			Actor_Names.add(a);

			System.out.println("testing");
			System.out.println("test");

		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




