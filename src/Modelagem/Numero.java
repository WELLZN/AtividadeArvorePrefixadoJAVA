package Modelagem;

public class Numero {
    private int dado;

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "Dado=" + getDado();
    }
}