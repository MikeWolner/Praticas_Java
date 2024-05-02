import javax.swing.JOptionPane;

public class MaiorMenor {  
public static void main (String args[]) {
    int menor = Integer.MAX_VALUE, maior= Integer.MIN_VALUE;
    String entrada;
    do{
        entrada = JOptionPane.showInputDialog("Informe o numero: ");

        
        if (Integer.parseInt(entrada) > maior) {
            maior = Integer.parseInt(entrada);
        }

        if (Integer.parseInt(entrada) < menor) {
            menor = Integer.parseInt(entrada);
        }
        entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
    } while(entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    JOptionPane.showInternalMessageDialog(null,"Maior: " + maior+ " Menor: "+ menor);
    }
}
