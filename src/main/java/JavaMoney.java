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
}
