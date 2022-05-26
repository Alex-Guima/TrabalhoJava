public class Main{	
	public static void main(String[] args){
		Videogames videogame = new Videogames();
		PS4 ps4 = new PS4();
		Xbox xboxOne = new Xbox();

		ps4.setMarca("Sony");
		ps4.setExclusivos("Bloodborne, Uncharted 4, God of War, Gran Turismo");
		ps4.setVendas("116.000.000");
		
		xboxOne.setMarca("Microsoft");
		xboxOne.setExclusivos("Jogos Forza, Halo, Gears of War"); 
		xboxOne.setVendas("56.000.000");

		videogame.consoles();
		ps4.consoles();
		xboxOne.consoles();
	}
}