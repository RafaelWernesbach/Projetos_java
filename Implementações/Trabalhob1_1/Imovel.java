
package atividaderosa01;

class Imovel {
    private String nomeProprietario;
    private double imposto;
    private int mesesAtraso;
    private String matricula;

    public Imovel(String matricula, String nomeProprietario, double imposto, int mesesAtraso) {
        this.nomeProprietario = nomeProprietario;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
        this.matricula = matricula;
    }

    public double getImposto() {
        return imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }
}
