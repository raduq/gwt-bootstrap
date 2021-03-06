package com.geekvigarista.gwt.bootstrap.client.ui;

import com.geekvigarista.gwt.bootstrap.client.ui.resources.BootstrapCssResources;

/**
 * A simple DangerAlertMessage Component based on Twitter's Bootstrap Alert.
 * 
 * @author Carlos Alexandro Becker
 * @since 22/01/2012
 */
public class ErrorAlert extends Alert {

	{
		addStyleName(BootstrapCssResources.error);
	}

	public ErrorAlert(String text) {
		setText(text);
	}
}
