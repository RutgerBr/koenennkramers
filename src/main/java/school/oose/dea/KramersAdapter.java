package school.oose.dea;

import nl.oose.dea.koenenkramers.KramersDictionary;

public class KramersAdapter implements Translator
{
    private KramersDictionary kramers = new KramersDictionary();

    @Override
    public String translate(String word) {
        return kramers.find(word);
    }

    @Override
    public String getName()
    {
        return String.valueOf(DictionaryType.KRAMERS);
    }
}
