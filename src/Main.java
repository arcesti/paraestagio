public class Main {
    public static void main(String[] args) {

        //QUESTAO 1;
        int indice = 13, soma = 0, k = 0;
        while(k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("Soma da questao 1: " + soma);


        //QUESTAO 2;
        boolean confere = FibonacciQ2.confereValor(54);
        if(confere) {
            System.out.println("O numero pertence a sequencia de fibonacci");
        } else {
            System.out.println("O numero nao pertence a sequencia de fibonacci");
        }


        //QUESTAO 3;
        FaturamentoQ3.insereVal();
        System.out.println("Menor faturamento diario do mes: " + FaturamentoQ3.menorVal());
        System.out.println("Maior faturamento diario do mes: " + FaturamentoQ3.maiorVal());
        System.out.println("Dias em que o faturamento foi acima da media: " + FaturamentoQ3.diasFatAcimaMedia());


        //QUESTAO 4;
        FaturamentoQ4.addFat();
        FaturamentoQ4.mostraPercentual();


        //QUESTAO 5;
        System.out.println("A string abacaxi invertida é: " + InverteStrQ5.inverteCarcter("abacaxi"));
    }
}