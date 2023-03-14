import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Exemplo_01_Date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		
		//Utilizando a data de agora.
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		//Formato de Greenwich que é 3horas a menos no Brasil começando em 1970.
		Date x3 = new Date(0L);
		//Adicionando 5 horas no calculo, utilizando as 21:00 + 5:00 = 02:00
		Date x4 = new Date(1000L *60L * 60L * 5L);
		
		Date y1 = sdf1.parse("01/10/2022");
		Date y2 = sdf2.parse("02/10/2022 15:02:07");
		//Data definida pelo UTC que é 3 horas a menos de greenwich.
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("----- Data sem Formato -----");	
		System.out.println("x1: " + sdf2);	
		System.out.println("x2: " + sdf2);
		System.out.println("x3: " + sdf2);
		System.out.println("x4: " + sdf2);
		System.out.println("y1: " + sdf2);
		System.out.println("y2: " + sdf2);
		System.out.println("y3: " + sdf2);
		System.out.println();
		
		System.out.println("----- Formato UTC -----");	
		System.out.println("x1: " + sdf2.format(x1));	
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println();
		
		System.out.println("----- Formato GMT -----");	
		System.out.println("x1: " + sdf3.format(x1));	
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}

}
