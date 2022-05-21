package com.example.core.handler;

import com.example.core.enums.EnumSerializer;
import com.example.core.enums.IEnum;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class CustomJacksonAnnotationIntrospector extends JacksonAnnotationIntrospector {
    @Override
    public Object findSerializer(Annotated a) {
        IEnum annotation = a.getAnnotation(IEnum.class);
        if(annotation!=null){
            return EnumSerializer.class;
        }
        return super.findSerializer(a);
    }
}
