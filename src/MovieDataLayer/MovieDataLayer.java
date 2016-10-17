package MovieDataLayer;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import MovieClassLayer.Film;

public class MovieDataLayer {
	static int i=0;
	Film film= new Film();
	List<Film> flims;
	public String Film_ID;
	public String Film_Name;
	public String IMDB_Rating;
	public String Director_ID;
	public String Director_Nane;
	public String Actor_ID;
	public String Actor_Name;
	public String Year;

	
	public MovieDataLayer() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/Everything/Capita/Workspace_Neon/IMDb/TestData.csv"));
		String line = br.readLine(); // Reading header, Ignoring

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			String[] fields = line.split(",");

			Film_ID = fields[0];
			Film_Name = fields[1];
			IMDB_Rating = fields[2];
			Director_ID = fields[3];
			Director_Nane = fields[4];
			Actor_ID = fields[5];
			Actor_Name = fields[6];
			Year = fields[7];
		}
		}
}




