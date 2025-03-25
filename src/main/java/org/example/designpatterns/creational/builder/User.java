package org.example.designpatterns.creational.builder;

public class User {
    private final String id;
    private final String name;

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
    }

    public static class UserBuilder {
        private String id;
        private String name;

        public UserBuilder() {
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
