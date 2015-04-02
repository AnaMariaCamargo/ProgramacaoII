package caixaeletronico;
import javax.swing.JOptionPane;
public class CaixaEletronico {
 private static String nome ;
  private static String numero;
  private static String agencia;
    public static void main(String[] args) {
        Integer opcao = -1;
       
      
        
       Conta c = new Conta();
       
        
       
 Banco b = new Banco();
     
  String banco = null;
  
     
        
        while(opcao!=0)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico\n\n"
        + "1 - Abrir\n"
        + "2 - Depositar\n"
        + "3 - sacar\n"
        + "4 - Saldo\n"
        +"5 - Fechar\n"
        +"6 - Resumo\n"
        +"7 - Verificar Banco\n" 
        +"8 - Sair\n"));
        
        switch (opcao)
        {
       
            case 1 :
            
             
                nome = JOptionPane.showInputDialog("correntista");
                banco = JOptionPane.showInputDialog("INFORME O NOME DO BANCO");
                agencia =  JOptionPane.showInputDialog("Agencia");
                numero  = JOptionPane.showInputDialog("numero");
                 c.abrir (agencia,numero,nome);
                 JOptionPane.showMessageDialog(null,"conta aberta com sucesso");
                break;
            case 2 :
                Double valor = Double.parseDouble(JOptionPane.showInputDialog("rs deposito"));
                Boolean ret = c.depositar (valor);
                if (ret ==true)
                {
                    JOptionPane.showMessageDialog(null,"Deposito ok");
                }
            else
                {
                  JOptionPane.showMessageDialog(null,"nao foi possivel depositar");
                  
                }  
 break;
            case 3 :
                String saque; 
                saque = JOptionPane.showInputDialog("informe o valor do saque");
                if ( c.sacar(Double.parseDouble(saque))== false)
                {
                    JOptionPane.showMessageDialog(null,"Saque nao realizado !A conta nao esta aberta ou nao ha saldo suficiente"); 
                    
                }
                else{
                    
                   JOptionPane.showMessageDialog(null,"saque realizado com sucesso");
                }break;
            case 4:
                 JOptionPane.showMessageDialog(null,"saldo restante"+ c.retornarSaldo());
                
                break;
            case 5:
                Integer sair =JOptionPane.showConfirmDialog(null,"tem certeza???");
                
               int f = JOptionPane.showConfirmDialog(null,"deseja fechar sua conta?");
               System.out.println(f);
        
                             if (f == 0){
                             c.fecharConta();
        
                               JOptionPane.showMessageDialog(null,"conta fechada com sucesso");
        }else{
          JOptionPane.showMessageDialog(null,"conta continua aberta");
        }
        break;
        case 6:
        JOptionPane.showMessageDialog(null,"Dados do cliente:\n"+"nome do cliente:" +nome +"\nNumero: "+numero+" \nAgencia: "+agencia+" \n saldo: "+ c.retornarSaldo());
       
        break;
        case 7:
         JOptionPane.showMessageDialog(null,"Banco da conta:" + banco);
            break;
        default:
        opcao = 0;
        break;
        
        
                                 
        }           
                
                
                
                          
                    
                   
                }
        }
        }
    


