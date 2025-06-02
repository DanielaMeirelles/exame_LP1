package fatec.sjc.sp.tarefa3javafxlp1.classes;

public class Bicicleta {
    private String modelo;
    private String cor;
    private int marchas;

    public Bicicleta(String modelo, String cor, int marchas) {
        setModelo(modelo);
        setCor(cor);
        setMarchas(marchas);
    }

    public void pedalar() {
        System.out.println("A bicicleta " + modelo + " está pedalando.");
    }

    public void frear() {
        System.out.println("A bicicleta " + modelo + " está freando.");
    }

    public void detalhes() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Marchas: " + marchas);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
}
