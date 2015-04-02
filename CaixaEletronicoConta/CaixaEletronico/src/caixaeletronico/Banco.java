
package caixaeletronico;


public class Banco {
    private String numerobanco;
    private String nomebanco;

    public String getNumerobanco() {
        return numerobanco;
    }

    public void setNumerobanco(String numerobanco) {
        this.numerobanco = numerobanco;
    }

    public String getNomebanco() {
        return nomebanco;
    }

    public void setNomebanco(String nomebanco) {
        this.nomebanco = nomebanco;
    }

    String buscarBanco(){
       if ("001".equals(numerobanco)){
           return "Banco do brasil";
       }
           else if ("047".equals(numerobanco)){
               return "Banco do Estado de Segipe";
           }
               else if ("037".equals(numerobanco)){
                   return "Banco do para";
               }
                   else if ("041".equals(numerobanco)){
                       return "Banco rs";
                   }
                   else if ("004".equals(numerobanco)){
                   return "Banco do nordeste do brasil";
                   }
                   else 
                   {
                      return""; 
                   }
                       
        
    }
                      
                       
                       
       }
       
    


