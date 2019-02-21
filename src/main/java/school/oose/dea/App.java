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
        System.out.println(translate.translate("monkey"));
        System.out.println(translate.getName());
    }
}
