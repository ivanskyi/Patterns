package creational.builder;

public class BackendDeveloper extends Developer {
    protected String position;

    private BackendDeveloper(Builder builder) {
        super(builder);
        this.position = builder.position;
    }

    public static class Builder extends Developer.Builder<Builder> {
        private String position;

        public Builder position(String position) {
            this.position = position;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public BackendDeveloper build() {
            return new BackendDeveloper(this);
        }
    }
}
