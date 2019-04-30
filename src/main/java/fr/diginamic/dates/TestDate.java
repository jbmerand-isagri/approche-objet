/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Jean-Baptiste
 *
 */
public class TestDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		Date date2 = new Date(119, 3, 30);
		System.out.println(date2);

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 3);
		calendar.set(Calendar.DAY_OF_YEAR, 123);
		Date maDate = calendar.getTime();

		SimpleDateFormat formatteur = new SimpleDateFormat("'Le' EEEEE (dd) MM/yyy' à 'HH:mm:ss");
		String maDateFormatee = formatteur.format(maDate);

		System.out.println(maDate);
		System.out.println(maDateFormatee);
	}

}
