package livedes6quest7tarde;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveDes6Quest7Tarde {

    /**
     * Faça um algoritmo que leia vários números inteiros e calcule o somatório
     * dos números negativos. O fim da leitura será indicado pelo número 0.
     */
    public static void main(String[] args) {
        int numero, somatorioNegativo;
        somatorioNegativo = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um"
                    + " numero ou digite 0 (zero) para sair:\n"
                    + "Digite"));
            if (numero != 0) {
                if (numero < 0) {
                    somatorioNegativo += numero;
//somatorioNegativo = somatorioNegativo + numero;
                } else {
                    JOptionPane.showMessageDialog(null, "Números positivos não são"
                            + " contabilizados!!");
                }
            }

        } while (numero != 0);//fim do loop

        JOptionPane.showMessageDialog(null, "A soma dos números negativo é: "
                + somatorioNegativo);

    }

}
