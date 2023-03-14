package funcoes;

import java.util.List;

public class PorcentualRepresentativo {
    
    String estado;
    double valor;

    

    public PorcentualRepresentativo(String estado, double valor) {
        this.estado = estado;
        this.valor = valor;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void porcentualRepresent(List<PorcentualRepresentativo> representacoes) {
        
        double soma = 0;

        for(PorcentualRepresentativo estados : representacoes){

            estados.getValor();
            soma += estados.getValor();

        }

        for(PorcentualRepresentativo estados : representacoes){

            estados.getValor();
            double percentual = ((estados.getValor())/soma)*100;
            String percentF = String.format("%.2f", percentual);
            System.out.println(estados.getEstado() + ": "+ percentF + "%");
        }
    }
    



}
