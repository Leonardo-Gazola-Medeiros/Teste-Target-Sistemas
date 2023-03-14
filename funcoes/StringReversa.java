package funcoes;

public class StringReversa {
    

    public static void reverter(String stringQualquer) {

        char[] letras = new char[stringQualquer.length()];
        for (int i = 0; i < stringQualquer.length(); i++ ){

            char letra = stringQualquer.charAt(i);
            letras[i] = letra;
        }
        
        int tamanho = letras.length;
        String revertida = "";

        for(int l = tamanho-1; l >= 0 ; l--){

            revertida += String.valueOf(letras[l]);

        }
        System.out.println(revertida);


    }
}
