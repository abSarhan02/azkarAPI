package com.absarhan.muslimbro.rs;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        // Database.init();
        Set<Class<?>> classes = new HashSet<>();
        // Risorse REST
        classes.add(AzkarResource.class);
        // Provider
        classes.add(ValidationExceptionMapper.class);

        classes.add(HeadersFilter.class);


        return classes;
    }

}