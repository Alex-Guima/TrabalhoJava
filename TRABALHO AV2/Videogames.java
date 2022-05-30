public class Videogames{
	private String marca, principaisExclusivos, nmroVendas;

	//Método que vai sofrer polimorfismo nas diferentes subclasses
	
	public void consoles(){
		System.out.printf("Consoles existem desde 1972%n");
		System.out.println("-------------------------------------------------------");
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public void setExclusivos(String principaisExclusivos){
		this.principaisExclusivos = principaisExclusivos;
	}

	public void setVendas(String nmroVendas){
		this.nmroVendas = nmroVendas;
	}
	
	public String getMarca(){
		return this.marca;
	}	

	public String getExclusivos(){
		return this.principaisExclusivos;
	}
		
	public String getVendas(){
		return this.nmroVendas;
	}
}