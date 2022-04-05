package InicioGuanabara;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class segundoPrograma {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.print("o idioma é: ");
        System.out.println(idioma.getDisplayLanguage());

        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("a resolução da tela é: "+d.width+" x " +d.height);
        System.out.println(tela.getScreenSize());

    }    
}
