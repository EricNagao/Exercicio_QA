package EASY;

import javax.swing.JOptionPane;

public class execucao {
    /*
    public static void main(String[] args) {
        Exercicio_02_Easy exercicio_02_Easy = new Exercicio_02_Easy();
        String palavra = exercicio_02_Easy.retornaPalavra("Eric Dias");
        System.out.println(palavra);
    }
*/
    public static void main(String[] args) {
        String primeiroValor =JOptionPane.showInputDialog("Digite o primeiro Valor: ");
        String segundoValor = JOptionPane.showInputDialog("Digite o Segundo valor: "); 
        
        Exercicio_03_Easy exercicio_03_Easy = new Exercicio_03_Easy(); //instanciando a classe do exercicio 3 easy.
        System.out.println(exercicio_03_Easy.doisValores(primeiroValor, segundoValor)); // chama a o valor.
        
    }
}
