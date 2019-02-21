package school.oose.dea;

public class TranslatorFactory
{
    private static TranslatorFactory factory;

    public static TranslatorFactory getInstance()
    {
        factory = new TranslatorFactory();
        return factory;
    }

    public Translator create(String word)
    {
        if(null != new KoenenAdapter().translate(word))
            return new KoenenAdapter();

        else
            return new KramersAdapter();
    }
}
