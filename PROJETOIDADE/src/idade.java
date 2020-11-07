import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class idade {
    public static void main(String[] args) {
        //pegando a data do sistema
        Calendar cal = GregorianCalendar.getInstance();
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);
        int semanaAtual =cal.get(Calendar.WEEK_OF_MONTH)

        //recebendo a data de nascimento usuario
        Scanner in = new Scanner(System.in);
        System.out.println("Dia em que você nasceu: ");
        int diaNasc = in.nextInt();
        if ((diaNasc<=0) && (diaNasc>31))
        {
            System.out.println("Dia Invalido");
        }
        else
        {
            System.out.println("Mes em que você nasceu: ");
            int mesNasc = in.nextInt();
            if ((mesNasc<=0) && (mesNasc>12))
            {
                System.out.println("Mes invalido");
            }
            else
            {
                System.out.println("Ano em que você nasceu: ");
                int anoNasc = in.nextInt();
                if ((anoNasc<=0) && (anoNasc>anoAtual))
                {
                    System.out.println("Ano Invalido");
                }
                else
                {
                    int Nasc = anoNasc*365;
                    Nasc = Nasc+(mesNasc*31);
                    Nasc = Nasc+diaNasc;
                    int Atual = anoAtual*365;
                    Atual = Atual+(mesAtual*31);
                    Atual = Atual+diaAtual;

                    System.out.println("Atualmente você tem "+(Atual-Nasc)+" dias, "+((Atual-Nasc)/31)+" meses e "+((Atual-Nasc)/365)+" anos.");

                }
            }


        }

    }
}