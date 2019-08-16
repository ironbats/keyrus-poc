package br.com.keyrus.poc.facades.scpi;

import de.hybris.platform.sap.sapcpiadapter.service.SapCpiOutboundService;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;

public interface KeyrusCpiOutboundService extends SapCpiOutboundService {

    static String getPropertyValue(ResponseEntity<Map> responseEntityMap, String property) {

        Object next = responseEntityMap.getBody().keySet().iterator().next();
        checkArgument(next != null, String.format("SCPI response entity key set cannot be null for property [%s]!", property));

        String responseKey = next.toString();
        checkArgument(responseKey != null && !responseKey.isEmpty(), String.format("SCPI response property can neither be null nor empty for property [%s]!", property));

        Object propertyValue = ((HashMap) responseEntityMap.getBody().get(responseKey)).get(property);
        checkArgument(propertyValue != null, String.format("SCPI response property [%s] value cannot be null!", property));

        return propertyValue.toString();

    }


}
