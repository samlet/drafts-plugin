package com.drafts.generic;

public interface ComponentProvider {
    <T> T inject(T object);
}

