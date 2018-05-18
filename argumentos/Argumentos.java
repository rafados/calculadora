package argumentos;
/**
*Crea una clase Metodos tal y como se explica: 
*	Un método incrementa(int i) que incremente y muestre el argumento dentro. (parámetro por valor) 
*	Un método modifica(int i, char c, double d) que modifique y muestre los tres argumentos dentro. (parámetro por valor) 
*	Un método incrementa(int [] v) que incremente y muestre el primer elemento del vector dentro (parámetro por valor)
*Crea también una clase Argumentos (con main) que invoque a los tres métodos anteriores y muestre inmediatamente después los argumentos enviados. 
*Recuerda que cuando envías un argumento estás haciendo una copia para utilizarla dentro del método. Así:
*	Cuando envías una variable primitiva (int, char, double...), estás enviando su copia. Si la modificas, no afecta al argumento original (a no ser que la devuelvas con un retunr y lo asignes)
*	Cuando envías una referencia a un objeto (String, array, cualquier otro objeto ...), estás haciendo una copia de la referencia (que apunta al mismo objeto). Si la modificas, no afecta al argumento original (referencia), PERO SÍ PUEDES MODIFICAR EL OBJETO AL QUE APUNTA (ambas referencias apuntan a la misma copia
*Responde a las siguientes preguntas:
*	¿Se mantienen todas las modificaciones hechas dentro de un método?
*	¿Cómo mantener las modificaciones hechas dentro de un método? 
*@author José María Romero Ruiz
*@version 1.0 
*/
public class Argumentos { 
	public static void main(String[] args){
		int i=3;
		char c='t';
		double d=1.4;
		System.out.println("i= "+i+ " c= "+c+" d= "+d);
		System.out.print("Incrementa ");
		Metodos.incrementa(i);
		System.out.print("Modifica ");
		Metodos.modifica(i,c,d);
		int[] vector=new int[3];
		System.out.println("Vector[0]="+vector[0]);
		System.out.print("Incrementa vector ");
		Metodos.incrementa(vector);
		System.out.print("Incrementa ");
		Metodos.incrementa(vector[0]);
	}
}