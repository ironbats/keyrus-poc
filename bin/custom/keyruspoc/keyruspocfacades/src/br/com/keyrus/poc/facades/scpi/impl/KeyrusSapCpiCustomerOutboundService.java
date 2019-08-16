package br.com.keyrus.poc.facades.scpi.impl;

import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundCustomerModel;
import de.hybris.platform.sap.sapcpicustomerexchange.service.impl.SapCpiCustomerDefaultConversionService;

public class KeyrusSapCpiCustomerOutboundService extends SapCpiCustomerDefaultConversionService {


    @Override
    public SAPCpiOutboundCustomerModel convertCustomerToSapCpiCustomer(CustomerModel customerModel, AddressModel addressModel, String baseStoreUid, String sessionLanguage) {
        return super.convertCustomerToSapCpiCustomer(customerModel, addressModel, baseStoreUid, sessionLanguage);
    }
}
