package exercicio04;

import java.util.Scanner;

public class Usuario 
{
	private Integer id;
	private String nome;
	private String senha;
	Scanner entrada = new Scanner(System.in);
	int operador;	
	Usuario(Integer id, String nome, String senha)
	{
		System.out.println("Bem vindo, insira os adados por favor\n");
		System.out.println("0=Id\n1=Nome\n2=Senha\n");
		operador=entrada.nextInt();
			if(operador==0)
			{
			
			System.out.println("Insira seu Id:\n");
			id=entrada.nextInt();
				
			}
			else if(operador==1)
			{
				System.out.println("Insira seu Nome:\n");
					nome=entrada.next();
			}
			else if(operador==2)
			{
				System.out.println("Insira sua senha:\n");
				senha=entrada.next();
			}
		}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	public Integer getId() {
		return id;
	}
}
