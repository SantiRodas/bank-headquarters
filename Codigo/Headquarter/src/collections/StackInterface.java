/*
 * UNIVERSIDAD ICESI
 * TAREA INTEGRADORA 1 - ESTRUCTURAS DE DATOS
 * RODAS / DIAZ / MARTINEZ
 */

package collections;

public interface StackInterface<H> {
	
	//------------------------------------------------------------------------------------
	
	//Method 1
	
	public void push(H newValue);
	
	//------------------------------------------------------------------------------------
	
	//Method 2
	
	public H pop();
	
	//------------------------------------------------------------------------------------
	
	//Method 3
	
	public H peek();
	
	//------------------------------------------------------------------------------------
	
	//Method 4

	public void empty();
	
	//------------------------------------------------------------------------------------
	
	//Method 5
	
	public boolean isEmpty();
	
	//------------------------------------------------------------------------------------
	
	//Method 6
	
	public int size();
	
	//------------------------------------------------------------------------------------
	
}
