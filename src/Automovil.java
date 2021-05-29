
public class Automovil 
{
	// atributos o características 
	String Marca;
	int modelo;
	int precio;
	
	boolean estado = false; 
	
	// definición del constructor 
	public Automovil()
	{
		System.out.println("Se creo un objeto de tipo automovil");
	}
	
	//Metodos o acciones 
	public void encender ()
	{
		if(estado==true)
		{
			System.out.println("El automovil ya esta encendio");
		}
		else 
		{
			System.out.println("El automovil se ha encendio");
			estado=true;
		}
			
	}
	
	public void apagar ()
	{
		if(estado==true)
		{
			System.out.println("El automovil se apago");
			estado=false;
		}
		else 
		{
			System.out.println("El automovil ya esta apagado");
		}
	}
	
	public void avanzar ()
	{
		System.out.println("El automovil esta avanzando");
	}

}
