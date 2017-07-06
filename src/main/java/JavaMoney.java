import java.util.function.Function;

class JavaMoney {
    private final int amount;
    private final String currency;

    JavaMoney( int amount, String currency ) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;

        JavaMoney javaMoney = (JavaMoney) o;

        return amount == javaMoney.amount && ( currency != null ?
                currency.equals( javaMoney.currency ) :
                javaMoney.currency == null );
    }

    @Override public int hashCode() {
        int result = amount;
        result = 31 * result + ( currency != null ? currency.hashCode() : 0 );
        return result;
    }

    private int method( Function<String, Integer> length ) {
        String str = "Hello World";
        return length.apply( str );
    }

    public static void main( String[] args ) {
        final JavaMoney money = new JavaMoney( 10, "$" );

        final int length = money.method( String::length );
        System.out.println( length );
    }
}
