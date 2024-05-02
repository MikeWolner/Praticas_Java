import javax.swing.JOptionPane;
    public class Principal_02 {
    public static void main (String args[]) {
        String entrada;
        int nota, idade;
        double salario;
        String sexo;

        do {
            do{
                entrada = JOptionPane.showInputDialog("Informe a nota: ");
                nota = Integer.parseInt(entrada);
                if (nota < 0 || nota >= 11) {JOptionPane.showInternalMessageDialog(null, "Invalido");}
            } while (nota < 0 || nota >= 11);
            do{
                entrada = JOptionPane.showInputDialog("Informe o salario: ");
                salario = Double.parseDouble(entrada);
                if (salario < 0.0) {JOptionPane.showInternalMessageDialog(null, "Invalido");}
            } while (salario < 0.0);
            do{
                entrada = JOptionPane.showInputDialog("Informe o genero (M/F): ");
                sexo = entrada;
                if (!sexo.equals("M") && !sexo.equals("F")){JOptionPane.showInternalMessageDialog(null, "invalida");}
            } while (!sexo.equals("M") && !sexo.equals("F"));
            do{
                entrada = JOptionPane.showInputDialog("Informe a idade: ");
                idade = Integer.parseInt(entrada);
                if (idade < 0 || idade > 150) {JOptionPane.showInternalMessageDialog(null, "Invalido");}
            } while (idade < 0 || idade > 150);
            

            JOptionPane.showInternalMessageDialog(null ,"Todos os dados estao validos");
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
            entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION)
            entrada = "não";
            } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
            System.exit(0);
            
        }
    }