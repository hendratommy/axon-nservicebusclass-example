package org.billing;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.sales.events.OrderAccepted;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OrderAcceptedHandler 
{
	private static final Logger LOG = LoggerFactory.getLogger(OrderAcceptedHandler.class);	
	
	@EventHandler
    public void Handle(OrderAccepted message)
    {
        LOG.info("Received Order Accepted: {}", message.getOrderId());
    }
}
