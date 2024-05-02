import javax.swing.JOptionPane;

public class Fatorial {
    public static void main (String args[]) {
        int n, f = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o inicio: "));

        for(int i = 1; i <= n; i++){
            f *= i;
        }
        JOptionPane.showInternalMessageDialog(null, "A soma e: "+ f);

    }
}
