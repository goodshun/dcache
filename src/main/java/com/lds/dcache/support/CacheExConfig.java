package com.lds.dcache.support;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheExConfig {
    String region() default "default";
    String[] cacheNames() default {};
    CacheType cachetype() default CacheType.ALL;
    expire expire() default expire.SHORT_TIME;
    public static enum expire{
        FOREVER_TIME,
        LONG_TIME,
        SHORT_TIME;
    }
    public static enum CacheType{
        ALL,
        REDIS,
        J2CACHE;
    }
}
