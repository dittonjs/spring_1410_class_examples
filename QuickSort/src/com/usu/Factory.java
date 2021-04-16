package com.usu;

import java.lang.reflect.InvocationTargetException;

public class Factory {
    public <T> T instantiate(Class<T> klass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return klass.getConstructor().newInstance();
    }
}
