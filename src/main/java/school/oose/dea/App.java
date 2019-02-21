package school.oose.dea;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TranslateToDutch translate = new TranslateToDutch();
        System.out.println(translate.translate("cat"));
        System.out.println(translate.getName());
    }
}
