package com.programming.basic;

import com.programming.Test;

import java.util.HashMap;

public class Mutable {
    private int value;

    public Mutable(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mutable that = (Mutable) o;
        return value == that.value;
    }
}
