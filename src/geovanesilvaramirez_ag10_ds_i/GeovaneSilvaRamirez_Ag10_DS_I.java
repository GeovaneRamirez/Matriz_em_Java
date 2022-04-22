package geovanesilvaramirez_ag10_ds_i;

// @author Geovane Silva Ramirez

import javax.swing.JOptionPane;

 
public class GeovaneSilvaRamirez_Ag10_DS_I {

    public static void main(String[] args) {

        // declarando as variáveis
        int valores [] [] = new int [10] [10];
        String exibir = "";
        int soma = 0;
        
        // armazenando valores da matriz
        for (int linha=0; linha<10; linha++)  {
            for (int coluna=0; coluna<10; coluna++) {
                valores [linha] [coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "+"linha: "+linha+" / "+"coluna: "+coluna));
                soma += valores [linha] [coluna];
            }   //final do segundo for (coluna)
        } //final do primeiro for (linha)
        
        for (int linha=0; linha<10; linha++) {
            for (int coluna=0; coluna<10; coluna++) {
                exibir += valores [linha] [coluna] + "|";
            } //final do segundo for (coluna)
            exibir += "\n";
        } //final do primeiro for (linha)
        
        //exibindo matriz
        JOptionPane.showMessageDialog(null,exibir);
                
        //exibindo resultado
        JOptionPane.showMessageDialog(null, "A soma dos valores da matriz é: " + soma);
        
    }
    
}
