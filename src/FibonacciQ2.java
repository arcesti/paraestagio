public class FibonacciQ2 {
    static public boolean confereValor(int num) {
        int atual = 0, ant=1;
        while (atual < num) {
            if(atual <= 1) {
                atual++;
            } else {
                atual = atual + ant;
                ant = atual - ant;
            }
        }
        return num == atual;
    }
}
