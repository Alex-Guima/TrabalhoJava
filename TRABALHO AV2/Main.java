public class Main{	
	public static void main(String[] args){
		Videogames videogame = new Videogames();
		Xbox xboxOne = new Xbox();
		NSW nsw = new NSW();

        //Ou passa como parâmetro no método construtor, ou usa os métodos set separadamente para alterar o valor das variáveis da classe PS4

		PS4 ps4 = new PS4("Sony", "Horizon Zero Dawn, Infamous Second Son, The Last of Us", "116.000.000");

		//ps4.setMarca("Sony");
		//ps4.setExclusivos("Bloodborne, Uncharted 4, God of War, Gran Turismo");
		//ps4.setVendas("116.000.000");

		
		xboxOne.setMarca("Microsoft");
		xboxOne.setExclusivos("Jogos Forza, Halo, Gears of War"); 
		xboxOne.setVendas("56.000.000");

		nsw.setMarca("Nintendo");
		nsw.setExclusivos("Breath of the Wild, Super Mario Odyssey, Super Smash Bros Ultimate");
		nsw.setVendas("107.000.000");

		videogame.consoles();
		ps4.consoles();
		xboxOne.consoles();
		nsw.consoles();
	}
}