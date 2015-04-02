package cassino;

public class Conta {
    
    private String nome;
    private String login;
    private String senha;
    private Double gold;
    private Double cash;
    private Boolean jogando;
    private String roupa;
    private String sapato;
    private String acessorio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Boolean isJogando() {
        return jogando;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getSapato() {
        return sapato;
    }

    public void setSapato(String sapato) {
        this.sapato = sapato;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }
    
    public Conta(){
        
        this.nome = null;
        this.login = null;
        this.senha = null;
        this.gold = 0.0;
        this.cash = 0.0;
        this.jogando = false;
        this.roupa = null;
        this.sapato = null;
        this.acessorio = null;
    }
            
    Boolean realizarCadastro(String vnome, String vlogin, String vsenha, String vconfirma)
    {
        Boolean deucerto;
        if(vsenha.equals(vconfirma))
        {
           nome = vnome;
           login = vlogin;
           senha = vsenha;
           gold = 50.0;
           cash = 0.0;
           jogando = false;
           roupa = "Calça e camisa";
           sapato = "Chinelo rider";
           acessorio = "Relógio do camelô";
           
           deucerto = true;
        }
        else
        {
            deucerto = false;
        }
        return deucerto;
}
    
    Boolean abrir(String vlogin, String vsenha)
    {
        Boolean deucerto;
        if(vlogin.equals(login) && vsenha.equals(senha))
        {
            jogando = true;
            deucerto = true;
        }
        else
        {
            jogando = false;
            deucerto = false;
        }
        
        return deucerto;
    }   
    Boolean inserirCash(String cartao, Double valor)
    {
        Boolean deucerto;
        if(jogando == true && cartao.length()==16)
        {
           if(valor <= 10){
              cash = cash + valor * 1;
           }
           else if(valor >= 11 && valor <= 50){
               cash = cash + valor * 2;
           }
           else if(valor > 50){
               cash = cash + valor * 3;
           }
           
           deucerto = true;
           
           return deucerto;
        }
        else
        {
            deucerto = false;
            
            return deucerto;
            
        }
    }    
    Boolean comprarRoupa(String vroupa)
    {
        Boolean certo=false;
        switch (vroupa) {
            case ("1"): {
                
                if (cash >= 40) {
                    roupa = "Terno";
                    cash = cash - 40;
                    certo = true;
                } else {
                    certo = false;
                }

                break;
            }
            case ("2"): {
                
                if (cash >= 45) {
                    roupa = "Smoking";
                    cash = cash - 45;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("3"): {
                
                if (cash >= 35) {
                    roupa = "Vestido Rosa";
                    cash = cash - 35;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("4"): {
                
                if (cash >= 55) {
                    roupa = "Tubinho Dourado";
                    cash = cash - 55;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("5"): {
                
                if (cash >= 50) {
                    acessorio = "Relogio Azul";
                    cash = cash - 50;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("6"): {
                
                if (cash >= 100) {
                    acessorio = "Pulseira Colorida";
                    cash = cash - 100;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("7"): {
                
                if (cash >= 30) {
                    acessorio = "Óculos Preto";
                    cash = cash - 30;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("8"): {
                
                if (cash >= 60) {
                    acessorio = "Colar Pérola";
                    cash = cash - 60;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("9"): {
                
                if (cash >= 100) {
                    sapato = "Bota";
                    cash = cash - 100;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("10"): {
                
                if (cash >= 20) {
                    sapato = "sapato de salto";
                cash = cash - 20;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("11"): {
                
                if (cash >= 80) {
                    sapato = "Sapatilha Vermelha";
                    cash = cash - 80;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            case ("12"): {
                
                if (cash >= 150) {
                    sapato = "Tênis com Gliter";
                    cash = cash - 150;
                    certo = true;
                } else {
                    certo = false;
                }
                break;
            }
            

        }
        return certo;
    }
}
                    
        
    
            

