package school.oose.dea;

public class TranslateToDutch
{
    private String dictionary;
    public String translate(String word)
    {
        var translator = TranslatorFactory.getInstance().create(word);
        dictionary = translator.getName();
        return translator.translate(word);

    }

    public String getName()
    {
        return dictionary;
    }
}
