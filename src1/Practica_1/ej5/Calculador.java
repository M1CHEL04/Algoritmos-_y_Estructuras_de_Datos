package Practica_1.ej5;
public class Calculador {
	//retorno los valores pedidos mediante un return
	public static Valores ValorPorReturn(int []numeros) {
		int min=10000;
		int max=-10000;
		int suma=0;
		for(int aux : numeros) {
			if(aux>max) {
				max=aux;
			}
			if(aux<min) {
				min=aux;
			}
			suma+=aux;
		}
		return (new Valores((suma/numeros.length),max,min));
	}
	
	//retorno los valores pedidos mediante un parametro
	public static void ValorPorParametro (int []numeros, Valores v1) {
		int min=10000;
		int max=-10000;
		int suma=0;
		for(int aux : numeros) {
			if(aux>max) {
				max=aux;
			}
			if(aux<min) {
				min=aux;
			}
			suma+=aux;
		}
		v1.setMax(max);
		v1.setMin(min);
		v1.setProm(suma/numeros.length);
	}
	
	//retorno los valores pedidos mediante una variable global
	public void ValorPorVariableGlobal(int []numeros) {
		int min=10000;
		int max=-10000;
		int suma=0;
		for(int aux : numeros) {
			if(aux>max) {
				max=aux;
			}
			if(aux<min) {
				min=aux;
			}
			suma+=aux;
		}
		v3.setMax(max);
		v3.setMin(min);
		v3.setProm(suma/numeros.length);
	}
	
	static Valores v3= new Valores ();
	public static void main(String[] args) {
		int [] numeros = {2,4,6,8,10,12,14,16,18,20};
		Calculador c= new Calculador ();
		Valores v1,v2= new Valores ();
		
		//Valores por retorno
		v1=ValorPorReturn(numeros);
		System.out.println("Por retorno| \n Maximo: "+v1.getMax()+" \n Minimo: "+v1.getMin()+" \n Promedio: "+v1.getProm());
		
		//valores por parametro
		ValorPorParametro(numeros, v2);
		System.out.println("Por parametro| \n Maximo: "+v2.getMax()+" \n Minimo: "+v2.getMin()+" \n Promedio: "+v2.getProm());
		
		//valores por variable global
		c.ValorPorVariableGlobal(numeros);
		System.out.println("Por variable global| \n Maximo: "+v3.getMax()+" \n Minimo: "+v3.getMin()+" \n Promedio: "+v3.getProm());
	}

}
