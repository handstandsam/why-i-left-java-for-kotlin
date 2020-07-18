package com.handstandsam.playground;

public class JavaUser {

    private final String firstName;

    private final String lastName;

    public JavaUser(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}