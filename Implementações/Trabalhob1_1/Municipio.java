
package atividaderosa01;

// Classe Municipio
import java.util.ArrayList;
import java.util.List;

class Municipio {
    
    private final List<Imovel> imoveis;

    Municipio() {
        this.imoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }


    
    public double calcularMulta(Imovel imovel) {
    int mesesAtraso = imovel.getMesesAtraso();
    double imposto = imovel.getImposto();
    double percentualMulta = 0.0;

    if (mesesAtraso >= 1 && mesesAtraso <= 5) {
        percentualMulta = 0.01; // 5% de multa para até 3 meses de atraso
    } else if (mesesAtraso > 5 && mesesAtraso <= 8) {
        percentualMulta = 0.023; // 10% de multa para mais de 3 meses e até 6 meses de atraso
    } else if(mesesAtraso > 8 && mesesAtraso <= 10) {
        percentualMulta = 0.03; // 15% de multa para mais de 6 meses de atraso
    } else if(mesesAtraso > 10 && mesesAtraso <= 12){
        percentualMulta = 0.054;
    } else if(mesesAtraso > 12){
    percentualMulta = 0.1;
    }

    return imposto * percentualMulta;
}
}







