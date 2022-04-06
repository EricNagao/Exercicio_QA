package EASY;

import javax.swing.JOptionPane;

public class execucao {
    /*
    public static void main(String[] args) {
        Exercicio_02_Easy exercicio_02_Easy = new Exercicio_02_Easy();
        String palavra = exercicio_02_Easy.retornaPalavra("Eric Dias");
        System.out.println(palavra);
    }

    public static void main(String[] args) {
        String primeiroValor =JOptionPane.showInputDialog("Digite o primeiro Valor: ");
        String segundoValor = JOptionPane.showInputDialog("Digite o Segundo valor: "); 
        
        Exercicio_03_Easy exercicio_03_Easy = new Exercicio_03_Easy(); //instanciando a classe do exercicio 3 easy.
        System.out.println(exercicio_03_Easy.doisValores(primeiroValor, segundoValor)); // chama a o valor.
        
    }
*/

public static void main(String[] args) {

String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero: ");
int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
Exercicio_04_Easy exercicio_04_Easy = new Exercicio_04_Easy();
System.out.println( "O Dobro do numero digitado " +numeroDigitado +" é: " +exercicio_04_Easy.calcularDobro(numeroDigitado) );
    
}  

}
