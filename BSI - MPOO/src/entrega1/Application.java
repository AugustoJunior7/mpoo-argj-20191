package entrega1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Application {
	public static void main(String[] args) {
		SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
		
		HelloWorld helloWorld = new HelloWorld();
		HelloWorld helloWorld2 = new HelloWorld();
		HelloWorld helloWorld3 = new HelloWorld();
		HelloWorld helloWorld4 = new HelloWorld();
		
		Date data = new Date();
		String DataFormatada = formatar.format(data);
		helloWorld.setNome("Gabriel");
		helloWorld.setData(DataFormatada);
		helloWorld.imprimir();
		
		Date data2 = new Date();
		String DataFormatada2 = formatar.format(data2);
		helloWorld2.setNome("Ana");
		helloWorld2.setData(DataFormatada2);
		helloWorld2.imprimir();
		
		Date data3 = new Date();
		String DataFormatada3 = formatar.format(data3);
		helloWorld3.setNome("Augusto");
		helloWorld3.setData(DataFormatada3);
    	helloWorld3.imprimir();
    	
    	Date data4 = new Date();
		String DataFormatada4 = formatar.format(data4);    	
		helloWorld4.setData(DataFormatada4);
		helloWorld4.imprimir();
		
	}

}
