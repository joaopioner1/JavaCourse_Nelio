package date_examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class MyExample1 {

	public static void main(String[] args) throws ParseException {
		//Author: João Vítor Souza Pioner | Date: 28/03/2021 13:02
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date y1 = sdf1.parse("29/03/2021 19:02:56");
		Date y2 = sdf1.parse("28/03/2021 14:05:07");
		Date x2 = new Date(System.currentTimeMillis());//pega instante do meu sistema, converte para milisegundos

		System.out.println("x2 = " + sdf1.format(x2));
		Date x4 = new Date(1000L * 60L * 60L * 5L);//o L significa milisegundo
		
		System.out.println("y2 = " + y2);
		System.out.println("x4 = " + x4);
		System.out.println("y1 = " + y1);
		System.out.println(sdf1.format(x1));
		System.out.println("-------------------------");
		
		Date d = Date.from(Instant.parse("2021-03-28T15:42:09Z"));
		
		System.out.println(sdf1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_WEEK, 0);//o zero representa quantos dias atras/na frente
		d = cal.getTime();
		
		System.out.println("---"+sdf1.format(d));
		
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); //O 1 soma porque date inicia contando os meses em 0
		
		System.out.println("Month: " + month);
		System.out.println("Minute: " + minutes);
	}

}
