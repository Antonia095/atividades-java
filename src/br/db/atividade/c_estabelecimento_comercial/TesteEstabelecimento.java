package br.db.atividade.c_estabelecimento_comercial;


import java.time.LocalTime;

//Cristal Box Comércio e Representações
//         Endereço: R. Morretes, 181 - Santa Maria Goretti, Porto Alegre - RS
//         Horas: Aberto ⋅ Fecha às 18:00
//         Telefone: (51) 3012-6666
//         Website: https://cristalbox.com.br
public class TesteEstabelecimento {
    public static void main(String[] args) {
        EstabelecimentoComercial ec = new EstabelecimentoComercial("Cristal Box Comércio e Representações",
                "R. Morretes, 181 - Santa Maria Goretti, Porto Alegre - RS",  LocalTime.parse("07:00:00"),LocalTime.parse("19:00:00"),
                "5130126666",
                "https://cristalbox.com.br");

       System.out.println(ec);

//       LocalTime horaAtual = LocalTime.now();
//        int hora = horaAtual.getHour();
//        System.out.println(hora);
    }
}
