public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public void setTime(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setTime(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void setTime(int hora) {
        this.hora = hora;
    }

    public String exibirHoraUniversal() {
        return formataNumero(hora) + ":" + formataNumero(minuto) + ":" + formataNumero(segundo);
    }
    public String exibirHoraPadrao() {
        String strHora, sufixo;
        if(this.hora == 12) {
            strHora = "12";
            sufixo = "PM";
        }
        else if(this.hora == 0) {
            strHora = "12";
            sufixo = "AM";
        }
        else if (this.hora >=1 && this.hora <= 11) {
            strHora = formataNumero(hora);
            sufixo = "AM";
        }
        else {
            strHora = String.valueOf(this.hora - 12);
            sufixo = "PM";
        }
        return strHora + ":" + formataNumero(minuto) + ":" + formataNumero(segundo);
    }

    private String formataNumero(int numero) {
        if(numero < 10) {
            return "0"+numero;
        }
        return String.valueOf(numero);
    }
}
