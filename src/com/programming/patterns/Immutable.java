package com.programming.patterns;

public final class Immutable {
    private final String name;
    private final String email;

    public Immutable(String name, String email){
        this.name = name;
        this.email= email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
