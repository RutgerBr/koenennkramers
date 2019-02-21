package school.oose.dea;

import nl.oose.dea.koenenkramers.KoenenDictionary;

public class KoenenAdapter implements Translator
{
    private KoenenDictionary koenen = new KoenenDictionary();

    @Override
    public String translate(String word) {
        koenen.openDutchEnglish();
        koenen.openEnglishDutch();
        return koenen.lookUp(word);
    }

    @Override
    public String getName()
    {
        return String.valueOf(DictionaryType.KOENEN);
    }
}
