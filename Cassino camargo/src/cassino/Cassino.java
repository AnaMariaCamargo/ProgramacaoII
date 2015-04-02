package cassino;

import javax.swing.JOptionPane;

public class Cassino {

    public static void main(String[] args) {
        
    Integer opcao = -1;
    
    Conta conta = new Conta();
    
      while(opcao!=0){
          
      opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n 1 - Criar conta \n2 - Entrar na conta \n3 - Adicionar cash na conta \n4 - Comprar roupa 0 - Sair"));
        if(opcao==1){
             Boolean deucerto=conta.realizarCadastro(JOptionPane.showInputDialog("Digite o seu nome: "), JOptionPane.showInputDialog("Digite o login que deseja usar: "), JOptionPane.showInputDialog("Digite a senha: "), JOptionPane.showInputDialog("Confirme a sua senha:"));
        
        if(deucerto==true)
        JOptionPane.showMessageDialog(null, "A sua conta foi criada com sucesso!");
        else
        JOptionPane.showMessageDialog(null, "A sua conta não pode ser criada!");}
        else
        if(opcao==2){
        Boolean senha;
        senha = conta.abrir(JOptionPane.showInputDialog("Digite o seu login:"), JOptionPane.showInputDialog("digite a sua senha:"));
        
        if(senha==true)
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
        else JOptionPane.showMessageDialog(null,"Não foi possível logar!");
        }else if(opcao==3){
            Boolean cash;
            Double valor;
            valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja gastar:"));
            cash=conta.inserirCash(JOptionPane.showInputDialog("Digite o número do cartao de credito"),valor);
        
            
            if(cash==true)
                JOptionPane.showMessageDialog(null, "Valor depositado com sucesso");
            else JOptionPane.showMessageDialog(null, "Valor não pôde ser depositado");
        }
        if(opcao==4){
            Boolean item;
            
            item=conta.comprarRoupa(JOptionPane.showInputDialog("Roupa \n 1-terno 40\n 2-smoking 45\n 3-vestido rosa 35\n 4-tubinho dourado 55\n Acessorios \n5- relogio dourado 50\n 6-sem relogio 100\n 7- pulseira preta 30\n 8- pulseira rosa 60 \n Calcados\n 9- sem sapato 100\n 10-sapato de luxo preto 20\n 11- nike rasgado 80\n 12- sapato furado na ponta 150"));
            if(item==true)
                JOptionPane.showMessageDialog(null, "A compra foi feita com sucesso!");
            else JOptionPane.showMessageDialog(null, "A compra não foi feita!");
            
            
            
          }
      }
   }
}