/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.keyrus.poc.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import br.com.keyrus.poc.core.constants.KeyruspocCoreConstants;
import br.com.keyrus.poc.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class KeyruspocCoreManager extends GeneratedKeyruspocCoreManager
{
	public static final KeyruspocCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (KeyruspocCoreManager) em.getExtension(KeyruspocCoreConstants.EXTENSIONNAME);
	}
}
