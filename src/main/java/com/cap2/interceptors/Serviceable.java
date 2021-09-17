package com.cap2.interceptors;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
public @interface Serviceable {

}
