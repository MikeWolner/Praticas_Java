import javax.swing.JOptionPane;

public class Impar {
    public static void main (String args[]) {
        int inicio, fim, soma = 0;
        inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o inicio: "));
        fim = Integer.parseInt(JOptionPane.showInputDialog("Informe o inicio: "));

        if(inicio % 2 == 0){
            inicio++;
            for(int i = inicio; i <= fim; i++){
                soma += inicio;
            }
        } else{
            for(int i = inicio; i <= fim; i++){
                soma += inicio;
            }
        }
     JOptionPane.showInternalMessageDialog(null, "A soma e: "+soma);

    }
}
