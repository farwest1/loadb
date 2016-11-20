package com.moeller.security;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.apache.deltaspike.security.api.authorization.SecurityBindingType;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Bernd on 20.11.2016.
 */
@Retention(value = RUNTIME)
@Target({TYPE, METHOD})
@Documented
@SecurityBindingType
public @interface UserHasRight {
}
