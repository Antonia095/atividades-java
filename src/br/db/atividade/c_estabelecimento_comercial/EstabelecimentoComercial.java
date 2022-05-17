package br.db.atividade.c_estabelecimento_comercial;


import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.time.LocalTime;


/**
 * Faça com que essa classe tenha informações e inteligência para imprimir o seguinte texto:
 *
 * Cristal Box Comércio e Representações
 * Endereço: R. Morretes, 181 - Santa Maria Goretti, Porto Alegre - RS
 * Horas: Aberto ⋅ Fecha às 18:00
 * Telefone: (51) 3012-6666
 * Website: https://cristalbox.com.br
 */

public class EstabelecimentoComercial {
    private String nomeEmpresa;
    private String endereco;
    private LocalTime horarioAberto;
    private LocalTime horarioFechado;
    private String telefone;
    private String website;

    public EstabelecimentoComercial(String nomeEmpresa, String endereco, LocalTime horarioAberto, LocalTime horarioFechado, String telefone,
                                    String website) {
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
        this.horarioAberto = horarioAberto;
        this.horarioFechado = horarioFechado;
        this.telefone = telefone;
        this.website = website;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    // Horas: Aberto ⋅ Fecha às 18:00
    public String isAberto() {
        LocalTime horaAtual = LocalTime.now();
        String resultado;

        if(!horaAtual.isAfter(this.horarioFechado) && !horaAtual.isBefore(this.horarioAberto)) {
            resultado = "Aberto";
        } else {
            resultado = "Fechado";
        }

        return resultado;
    }

    public String imprimeFuncionamento() {
        String funcionamento;

        if (isAberto() == "Aberto") {
            funcionamento = "Aberto . Fecha às " + horarioFechado;
        } else {
            funcionamento = "Fechado . Abre às " + horarioAberto;
        }

        return funcionamento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private static String formato(String pattern, Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter(pattern);
            mask.setValueContainsLiteralCharacters(false);
            return  mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    // (51) 3012-6666
    public String imprimeTelefone() {
        String mascara = "(##) ####-####";
        String telefone  = this.telefone;

        if(telefone.length() > 10) {
           String resultado = "Número inválido";
           return resultado;
        }

        String telefoneFormatado = formato(mascara, telefone);
        return telefoneFormatado;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "EstabelecimentoComercial: " +
                 nomeEmpresa  +
                ", Endereço: " + endereco  +
                ", Horas: " + imprimeFuncionamento() +
                ", Telefone: " + imprimeTelefone()  +
                ", Website: " + website;
    }
}

