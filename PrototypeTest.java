public class PrototypeTest {

    public static void main(String[] args)
    {
        TvSamsung tvPrototype = new TvSamsung();
        TelevisaoPrototype tvNew = tvPrototype.clonar();
        tvNew.setValor(1500);
        tvNew.informacoesTv();
    }
}
