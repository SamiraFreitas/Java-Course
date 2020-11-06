package exercicio03;

public class FormaGeomtricaFactory 
{
	public static FormaGeometrica criarForma (String f)
	{
		if (f == null )
			return null;
		if(f.equalsIgnoreCase("Circulo")){
			return new Circulo();
		}else if (f.equalsIgnoreCase("Triangulo"))
		{
			return new Triangulo();
		}else if (f.equalsIgnoreCase("Quadrado")){
			return new Quadrado();
		}
		return null;
	}
	
}
