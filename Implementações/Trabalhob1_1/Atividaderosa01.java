
package atividaderosa01;

// Classe AtividadeRosa01
public class Atividaderosa01 {
    public static void main(String[] args) {
        Municipio municipio = new Municipio();
        
        Imovel imovel1 = new Imovel("10vv", "Albierto reginaldo", 1000, 7);
        Imovel imovel2 = new Imovel("10vv", "Frederico Jumbo", 1600, 10);
         municipio.adicionarImovel(imovel1);
         municipio.adicionarImovel(imovel2);
              
        double multaImovel1 = municipio.calcularMulta(imovel1);
        double multaImovel2 = municipio.calcularMulta(imovel2);
        System.out.printf("Multa para Imóvel 1: R$ %.2f\n", multaImovel1);
        System.out.printf("Multa para Imóvel 2: R$ %.2f\n", multaImovel2);
        

    }
}
