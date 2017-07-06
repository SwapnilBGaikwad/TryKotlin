import com.google.auto.value.AutoValue;

@AutoValue
abstract class JavaMoney {
    abstract Integer amount();

    abstract String currency();

    static Builder builder() {
        return new AutoValue_JavaMoney.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setAmount( Integer amount );

        abstract Builder setCurrency( String currency );

        abstract JavaMoney build();
    }
}
