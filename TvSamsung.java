public class TvSamsung extends TelevisaoPrototype {


    protected TvSamsung(TvSamsung tv)
    {
        this.tecnologia = "Smart TV / Bluetooth 5.0";
        this.tipoTela = "OLED";
        tv.visorTamanho = "55'";
        this.valor = tv.getValor();
        this.visorTamanho = tv.getVisorTamanho();
    }


    public TvSamsung() {
        super();
    }

    public String informacoesTv() {
        System.out.println("Televisão com as seguintes especificações: " + '\n'
                + "Tipo de Tela:" + this.tipoTela + '\n'
                + "Tamanho da Tela:" + this.visorTamanho + '\n'
                + "Tecnologias:" + this.tecnologia + '\n'
                + "Preço:" + this.valor);
        return null;
    }


    public TelevisaoPrototype clonar() {
        return new TvSamsung(this);
    }
}
