public class FaturamentoQ4 {
    static private double fat[] = new double[5];
    static String estado[] = new String[5];
    static public void addFat() {
        fat[0] = 67836.43;
        fat[1] = 36678.66;
        fat[2] = 29229.88;
        fat[3] = 27165.48;
        fat[4] = 19849.53;
        estado[0] = "sp";
        estado[1] = "rj";
        estado[2] = "mg";
        estado[3] = "es";
        estado[4] = "outros";
    }

    static public void mostraPercentual() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Percentual faturamento de " + estado[i] + ": " + fat[i]/total()*100 + "%");
        }
    }

    static public double total (){
        double soma=0;
        for (int i = 0; i < 5; i++) {
            soma += fat[i];
        }
        return soma;
    }
}
