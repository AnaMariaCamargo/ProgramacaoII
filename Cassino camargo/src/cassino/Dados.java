
package cassino;

import javax.swing.JOptionPane;

public class Dados {
    private Integer dado1 ;
    private Integer dado2 ;
    private Integer escolhauser ;
    private Integer somadados;
     private Double golds=0.0;
     private Double goldsap=0.0;
     
    public Integer getDado1() {
        return dado1;
    }

    public void setDado1(Integer dado1) {
        this.dado1 = dado1;
    }

    public Integer getDado2() {
        return dado2;
    }

    public void setDado2(Integer dado2) {
        this.dado2 = dado2;
    }

    public Integer getEscolhauser() {
        return escolhauser;
    }

    public void setEscolhauser(Integer escolhauser) {
        this.escolhauser = escolhauser;
    }

    public Double escolhajog ()
    {
       Double retorno=0.0;
       dado1 =  1 +(int)(Math.random() * 6);
       dado2 = 1 +(int)(Math.random() * 6);
       somadados = dado1 +dado2;
               
        //testar o jog colocou e soma dados
        if (escolhauser==somadados)
        {
            //
           retorno=(goldsap * 12);
        }
        else if (escolhauser==somadados-1 ||escolhauser==somadados+1) {
            retorno= goldsap*5;
        }
        else
        {
           retorno= -goldsap;
        }    
        return retorno;
    }        

    public Double getGolds() {
        return golds;
    }

    public void setGolds(Double golds) {
        this.golds = golds;
    }

    public Double getGoldsap() {
        return goldsap;
    }

    public void setGoldsap(Double goldsap) {
        this.goldsap = goldsap;
    }
}
