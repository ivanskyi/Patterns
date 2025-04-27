package creational.builder;

public class Developer {
    protected String name;
    protected int age;

    protected Developer(Builder<?> builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder<T extends Builder<T>> {
        protected String name;
        protected int age;

        public T name(String name) {
            this.name = name;
            return self();
        }

        public T age(int age) {
            this.age = age;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public Developer build() {
            return new Developer(this);
        }
    }
}
