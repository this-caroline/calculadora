package calculadora;

        import javax.swing.JOptionPane;
     

public class Calculadora {

       
   
    public static void main(String[] args) {
        
        float n1, n2;
        int op;
   
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro número: ")); // recebe o primeiro valor.
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo número: ")); // recebe o segundo valor.
        op = Integer.parseInt(JOptionPane.showInputDialog(" Informe a operação! Digite 1- para soma, 2- para subtração, 3- para multiplicação, 4- divisão.")); // recebe o comando de operação!
        
            switch (op) {
            
                case 1: op = (int) (n1+n2);
                    
                    JOptionPane.showMessageDialog(null, " O resultado da soma é: " + op);
                         break; // Recebe os dados e efetua a operação da soma.
                    
                        case 2: op = (int) (n1-n2);
                            JOptionPane.showMessageDialog(null, " O resultado da subtração é: " + op);
                                break; // Recebe os dados e efetua a operação da subtração.
                                
                                case 3: op = (int) (n1*n2);
                                    JOptionPane.showMessageDialog(null, " O resultado da multiplicação é: " + op);
                                         break; // recebe os dados e efetua a operação da multiplicação.
                                     
                                        case 4: op = (int) (n1/n2);
                                            JOptionPane.showMessageDialog(null, " O resultado da divisão é: " + op);
                                                break; // Recebe os dados e efetua a operação da divisão.
                                                
                                        default: JOptionPane.showMessageDialog(null, " Erro! tente novamente!"); // Retorna erro na escolha da opção e pede para executar novamente.
                                                       
                                            
                                            
                                        }
            
            }
    }
    

