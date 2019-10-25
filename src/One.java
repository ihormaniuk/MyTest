
public class One {
    public static void main(String[] args){
        System.out.println ( "ведіть радіус" );
        Circle c = new Circle ();
        c.scanner.nextLine ();
        System.out.println ( "діаметер - "  + c.diameter () );
        System.out.println ("площа - " + c.area () );
        System.out.println ( "довжина - " + c.length () );
    }

}
