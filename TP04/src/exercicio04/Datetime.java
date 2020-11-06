package exercicio04;
import java.util.Calendar;

public class Datetime
{
	private static final String YEAR = null;
	private static final String MONTH = null;
	private static final String DAY_OF_MONTH = null;

	public static void main(String[] args) {
		Datetime c = Datetime.getInstance();

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Datetime.YEAR));
		System.out.println("Mês: "+c.get(Datetime.MONTH));
		System.out.println("Dia do Mês: "+c.get(Datetime.DAY_OF_MONTH));
	}

	private String get(String year) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Datetime getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
