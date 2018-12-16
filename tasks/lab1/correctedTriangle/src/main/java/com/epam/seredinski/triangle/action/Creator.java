package com.epam.seredinski.triangle.action;

public interface Creator<T> {
    T create(int numOfLine);
}
