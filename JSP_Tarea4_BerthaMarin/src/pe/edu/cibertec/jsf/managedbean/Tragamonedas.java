package pe.edu.cibertec.jsf.managedbean;


import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="tareaVirtual")
@SessionScoped
public class Tragamonedas {

	public static int contador=10;
	private int aleatorios1=0;
	private int aleatorios2=0;
	private int aleatorios3=0;
	public  int numIntentos=0;
	public String mensaje;
	
	
	

public String retornar(){
	
	contador=10;

	
	return "Tragamonedas";
}
	public String  aleatorios(){
		
			Random randon=new Random(System.currentTimeMillis());
			
			int n1= randon.nextInt(10);
			int n2= randon.nextInt(10);
			int n3= randon.nextInt(10);
			
		
if(contador>=0 && contador<=10){
	aleatorios1=n1;

	aleatorios2=n2;
	aleatorios3=n3;
		
			
						if( aleatorios1==aleatorios2  && aleatorios1==aleatorios3 && aleatorios2==aleatorios3){
								//
			
						mensaje="ganastes";
						}else{
							
							mensaje="Sigue intentando";
							numIntentos=contador--;
							
						}
                  }		
                else  {
        	 mensaje="Ud Ha ganado";
				
        	 return "Gane";
         }
    

			
		return "Tragamonedas";
	}



	public int getAleatorios1() {
		return aleatorios1;
	}


	public void setAleatorios1(int aleatorios1) {
		this.aleatorios1 = aleatorios1;
	}


	public int getAleatorios2() {
		return aleatorios2;
	}


	public void setAleatorios2(int aleatorios2) {
		this.aleatorios2 = aleatorios2;
	}


	public int getAleatorios3() {
		return aleatorios3;
	}


	public void setAleatorios3(int aleatorios3) {
		this.aleatorios3 = aleatorios3;
	}


	public  int getNumIntentos() {
		return numIntentos;
	}


	public  void setNumIntentos(int numIntentos) {
		this.numIntentos = numIntentos;
	}
	
	public static int getContador() {
		return contador;
	}



	public static void setContador(int contador) {
		Tragamonedas.contador = contador;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	
}
