import javax.swing.JOptionPane;

public class Media {
    public static void main (String args[]) {
        int idades = 0, q = 0;
        String entrada;
        do{
            q++;
            entrada = JOptionPane.showInputDialog("Informe a idade: ");
            idades += Integer.parseInt(entrada);
            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
        } while(entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        JOptionPane.showInternalMessageDialog(null,"A media é 15" + idades/q);
    }

}
