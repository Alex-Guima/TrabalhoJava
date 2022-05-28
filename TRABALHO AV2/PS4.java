public class PS4 extends Videogames{
	public PS4(String novaMarca, String novosExclusivos, String novasVendas){
		setMarca(novaMarca);
		setExclusivos(novosExclusivos);
		setVendas(novasVendas);
	}
	public void consoles(){
		System.out.printf("PS4: %n  Marca: %s%n  Principais Exclusivos: %s%n  Numero de Vendas: %s%n", getMarca(), getExclusivos(),getVendas());
		System.out.println("-------------------------------------------------------");
	}
}
