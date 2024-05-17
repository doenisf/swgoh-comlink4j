package de.sf.util;

import com.google.gson.GsonBuilder;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class GsonAdapterRegistrar {
    public static final String BASE_PACKAGE = "de.sf";

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
//                Field adapterField = enumClass.getDeclaredField("Adapter");
//                Class<?> adapterClass = adapterField.getType();
//                gsonBuilder.registerTypeAdapter(enumClass, adapterClass.newInstance());
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e){
                e.printStackTrace();
            }
        }
    }
}
