package desafiopoo;

import entidades.Funcionario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SalarioMaisReajuste {
	public static double calcularSalarioComReajuste(Funcionario funcionario, String data) {
        Double total = funcionario.getCargo().getSalario();
        Date inicioContrato = stringToDate(funcionario.getDataContratacao());
        Date dataEscolhida = stringToDate(data);

        if (inicioContrato == null || dataEscolhida == null) {
            throw new RuntimeException("Data inválida!!");
        }

        Calendar c = Calendar.getInstance();
        c.setTime(inicioContrato);

        while (c.getTime().before(dataEscolhida)) {
            total = total + funcionario.getCargo().getReajuste();
            c.add(Calendar.YEAR, 1);
        }

        return total;
    }
	
	public static Date stringToDate(String dataString) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
			return dateFormat.parse(dataString);
		}
		
		catch (Exception e){
			System.out.print("Erro: ");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String formatDateToString(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
		return dateFormat.format(date);
	}
}
