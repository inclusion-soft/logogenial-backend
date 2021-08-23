package com.rc.logogenial.basicadminservice.utils;


import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * Clase objeto que permite el tratamiento de objetos JSON a java
 *
 * @author lurbina.ext
 * @version 1.0
 */
public class ConversorJSON {
    private static final ObjectMapper mapper = new ObjectMapper();

    private ConversorJSON() {
        mapper.setSerializationInclusion(Include.ALWAYS);
    }

    public static Object fromJSON(final String jsonSource, final Class<?> valueType) throws IOException {
        return mapper.readValue(jsonSource, valueType);
    }

    /** Mapea un listado de objetos de tipo JSON
     * @param jsonSource
     * @param valueType
     * @return El listado del objecto mapeado
     * @throws IOException
     */
    public static Object fromJSONList(final String jsonSource, final Class<?> valueType) throws IOException {
        return mapper.readValue(jsonSource, mapper.getTypeFactory().constructCollectionType(List.class, valueType));
    }
}
