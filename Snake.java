import java.util.Scanner;

public class Snake
{
	public static void main (String[] args)
	{			 
		Scanner arrow = new Scanner (System.in); 
		//Creación de un objeto Scanner
		
		System.out.println("Ingrese la direccion del despazamiento");
		System.out.println("w. Arriba");
		System.out.println("s. Abajo");
		System.out.println("a. Izquierda");
		System.out.println("d. Derecha");
		
		System.out.println("f. Terminar");
		
		char option;
		
		//Ciclo principal
		do
		{
			option = arrow.next().charAt(0); 
			
			
			if (option == 'w')
			{
				System.out.println("Se desplaza arriba");
				
			}
			else if(option == 's')
			{
				System.out.println("Se desplaza abajo");
				
			}
			else if(option == 'a')
			{
				System.out.println("Se desplaza a la izquierda");
				
			}
			else if(option == 'd')
			{
				System.out.println("Se desplaza a la derecha");
				
			}
			else 
			{
				System.out.println("Direccion incorrecta");
				
				System.out.println("w. Arriba");
				System.out.println("s. Abajo");
				System.out.println("a. Izquierda");
				System.out.println("d. Derecha");
		
			}
			
		}while(option != 'f');		
		
		System.out.println("--Terminado--");	

	}	
}
