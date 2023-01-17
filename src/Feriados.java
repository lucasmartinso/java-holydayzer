import java.util.HashMap;
import java.util.Map;

public class Feriados {
    Map<String, String> feriado = new HashMap<>(); 

    public Feriados() { 
        addFeriados();
    }

    public void ehFeriado(String data) { 
        String confereFeriado = feriado.get(data);

        if(confereFeriado == null) { 
            System.out.println("Não existe feriado nessa data");
            return;
        }

        System.out.println("Na data " + data + " será o feriado " + confereFeriado);
    }

    public void addFeriados() { 
        feriado.put("01/01/2023","Confraternização mundial");
        feriado.put("21/02/2023","Carnaval");
        feriado.put("17/04/2023","Páscoa");
        feriado.put("21/04/2023","Tiradentes");
        feriado.put("01/05/2023","Dia do trabalho");
        feriado.put("08/06/2023","Corpus Christi");
        feriado.put("07/09/2023","Independência do Brasil");
        feriado.put("12/10/2023","Nossa Senhora Aparecida");
        feriado.put("02/11/2023","Finados");
        feriado.put("15/11/2023","Proclamação da República");
        feriado.put("25/12/2023","Natal");
    }

    public void tabelaFeriados() { 
        feriado.forEach((key,value) -> System.out.println("Data: " + key + " é o feriado conhecido como " + value));
    }
}
