package glm.design_patterns.head_first.ch9_iterator;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        CafeMenu cafeMenu=new CafeMenu();
        Waitress waitress=new Waitress(cafeMenu);
        waitress.printMenu();
    }
}
