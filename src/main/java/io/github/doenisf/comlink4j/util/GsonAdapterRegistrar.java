package io.github.doenisf.comlink4j.util;

import com.google.gson.GsonBuilder;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.logging.Logger;

public class GsonAdapterRegistrar {
    private static final Logger LOGGER = Logger.getLogger(GsonAdapterRegistrar.class.getName());
    public static final String BASE_PACKAGE = "io.github.doenisf";

    public static void registerEnumAdapters(GsonBuilder gsonBuilder) {
        Reflections reflections = new Reflections(BASE_PACKAGE); // Replace with your base package
        Set<Class<?>> annotatedEnums = reflections.getTypesAnnotatedWith(GsonEnumAdapter.class);

        for (Class<?> enumClass : annotatedEnums) {
            try {
                Class<?>[] innerClasses = enumClass.getDeclaredClasses();
                for (Class<?> innerClass : innerClasses) {
                    if (innerClass.getSimpleName().equalsIgnoreCase("adapter")) {
                        gsonBuilder.registerTypeAdapter(enumClass, innerClass.getConstructor().newInstance());
                    }
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException |
                     InvocationTargetException e) {
                LOGGER.warning("Failed to register adapter for " + enumClass.getSimpleName() + "! Response objects may" +
                        " not contain all info returned by the API. Cause: " + e);
            }
        }
    }
}
