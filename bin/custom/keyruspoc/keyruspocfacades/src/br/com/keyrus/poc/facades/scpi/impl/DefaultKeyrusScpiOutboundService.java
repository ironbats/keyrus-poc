package br.com.keyrus.poc.facades.scpi.impl;

import br.com.keyrus.poc.facades.scpi.KeyrusCpiOutboundService;
import de.hybris.platform.outboundservices.facade.OutboundServiceFacade;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundCustomerModel;
import de.hybris.platform.sap.sapcpiadapter.service.impl.SapCpiOutboundServiceImpl;
import org.springframework.http.ResponseEntity;
import rx.Observable;

import java.util.Map;

public class DefaultKeyrusScpiOutboundService  extends SapCpiOutboundServiceImpl implements KeyrusCpiOutboundService {

    // Customer Outbound
    private static final String OUTBOUND_CUSTOMER_OBJECT = "OutboundB2CCustomer";
    private static final String OUTBOUND_CUSTOMER_DESTINATION = "scpiCustomerDestination";

    private OutboundServiceFacade outboundServiceFacade;


    @Override
    public Observable<ResponseEntity<Map>> sendCustomer(SAPCpiOutboundCustomerModel sapCpiOutboundCustomerModel) {
        return outboundServiceFacade.send(sapCpiOutboundCustomerModel,OUTBOUND_CUSTOMER_OBJECT,OUTBOUND_CUSTOMER_DESTINATION);
    }

    public void setOutboundServiceFacade(OutboundServiceFacade outboundServiceFacade) {
        this.outboundServiceFacade = outboundServiceFacade;
    }

    public OutboundServiceFacade getOutboundServiceFacade() {
        return outboundServiceFacade;
    }
}
