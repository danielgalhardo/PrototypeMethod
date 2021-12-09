public abstract class TelevisaoPrototype {

    protected double valor;
    protected String visorTamanho;
    protected String tipoTela;
    protected String tecnologia;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVisorTamanho() {
        return visorTamanho;
    }

    public void setVisorTamanho(String visorTamanho) {
        this.visorTamanho = visorTamanho;
    }



    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }



    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public abstract String informacoesTv();

    public abstract TelevisaoPrototype clonar();
}
