public class InverteStrQ5 {
    static public String inverteCarcter(String str) {
        String aux="";
        for (int i = str.length()-1; i> -1; i--) {
            aux += str.charAt(i );
        }
        return aux;
    }
}
