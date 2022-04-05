package EASY;

public class execucao {
    /*
    public static void main(String[] args) {
        Exercicio_02_Easy exercicio_02_Easy = new Exercicio_02_Easy();
        String palavra = exercicio_02_Easy.retornaPalavra("Eric Dias");
        System.out.println(palavra);
    }
*/
    public static void main(String[] args) {
        Exercicio_03_Easy exercicio_03_Easy =new Exercicio_03_Easy();
        String primeiroValor = exercicio_03_Easy.doisValores("O Primeiro valor é 10");
        System.out.println(primeiroValor);

        String segundoValor = exercicio_03_Easy.doisValores("O Segundo valor é 4");
        System.out.println(segundoValor);
    }
}
