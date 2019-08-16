/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.keyrus.poc.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import br.com.keyrus.poc.fulfilmentprocess.constants.KeyruspocFulfilmentProcessConstants;

public class KeyruspocFulfilmentProcessManager extends GeneratedKeyruspocFulfilmentProcessManager
{
	public static final KeyruspocFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (KeyruspocFulfilmentProcessManager) em.getExtension(KeyruspocFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
