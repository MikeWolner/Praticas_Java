import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Principal {
    public static void main (String args[]) {
        String entrada;
        int n1, rN1, soma, Spos = 0;
        do {
            entrada = JOptionPane.showInputDialog("Informe o número da conta: ");
            // Converte a entrada para inteiro e armazena em numero1:
            n1 = Integer.parseInt(entrada);
            
            // Inverte o número e soma
            rN1 = Integer.parseInt(new StringBuilder(String.valueOf(n1)).reverse().toString());
            soma = n1 + rN1;

            //Tranforma soma em lista e multiplica pela casa
            String numStr = String.valueOf(soma);
            List<Integer> result = numStr.chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
            for (int i = 0; i < result.size(); i++){
                result.set(i, result.get(i)* i);
            }
            for(Integer ch : result){
                Spos += Integer.parseInt(ch.toString());
            }

            JOptionPane.showMessageDialog(null, "O digito verificador e: " + Spos);
            // System.exit(0);
            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }
}