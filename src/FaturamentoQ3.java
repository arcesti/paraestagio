public class FaturamentoQ3 {
    static private double fatMes[] = new double[28];
    static public void insereVal (){
        fatMes[0] = 1500;
        for (int i = 1; i < 27; i++) {
            fatMes[i] = 1700;
        }
        fatMes[8] = 0;
        fatMes[15] = 0;
        fatMes[21] = 1400;
        fatMes[24] = 1300;
        fatMes[27] = 1900;
    }

    static public double menorVal() {
        double men = fatMes[0];
        int i = 1;
        while(i < fatMes.length) {
            if(men > fatMes[i] && fatMes[i]>0) {
                men = fatMes[i];
            }
            i++;
        }
        return men;
    }

    static public double maiorVal() {
        double men = fatMes[0];
        int i = 1;
        while(i < fatMes.length) {
            if(men < fatMes[i]) {
                men = fatMes[i];
            }
            i++;
        }
        return men;
    }

    static public int diasFatAcimaMedia() {
        int dias = 0;
        for (int i = 0; i < fatMes.length; i++) {
            if(fatMes[i]>media()) {
                dias++;
            }
        }
        return dias;
    }

    static public double media() {
        double media, soma=0, cont=0;
        for (int i = 0; i < 28; i++) {
            if(fatMes[i]>0)
                soma += fatMes[i];
            cont++;
        }
        media = soma/cont;
        return media;
    }
}
