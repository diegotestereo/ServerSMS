

import java.util.regex.Pattern;

public class LeerMsg {
	
	
	 private static final Pattern SPACE = Pattern.compile(" ");
	 int Radiobase,Alarma;
	 String StringAlarma;

	 String mensaje=null;
	
	public LeerMsg(String mensaje){
		
		
		this.mensaje=mensaje;
		
		
	}
	
	
	public void leer(){

		System.out.println("mensajeevento: "+mensaje);
	
			
		String[] arr = SPACE.split(mensaje); // str is the string to be split
		Radiobase=Integer.parseInt(arr[1]);
		Alarma=Integer.parseInt(arr[2]);
		int dni=0;
		if (Radiobase>100000){
			
			System.out.println("ES un DNI:"+dni);
			
		}
		// cuando la alarma es '1' es una keep alive.
		// caso contrario es una alarma de algun tipo.
	


}
}