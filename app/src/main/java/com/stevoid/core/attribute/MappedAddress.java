/*
 * This file is part of JSTUN. 
 * 
 * Copyright (c) 2005 Thomas King <king@t-king.de> - All rights
 * reserved.
 * 
 * This software is licensed under either the GNU Public License (GPL),
 * or the Apache 2.0 license. Copies of both license agreements are
 * included in this distribution.
 */

package com.stevoid.core.attribute;

import java.util.logging.Logger;


public class MappedAddress extends MappedResponseChangedSourceAddressReflectedFrom {
	private static Logger logger = Logger.getLogger("com.jstun.core.attribute.MappedAddress");
	public MappedAddress() {
		super(MessageAttribute.MessageAttributeType.MappedAddress);
	}
	
	public static MessageAttribute parse(byte[] data) throws MessageAttributeParsingException {
		MappedAddress ma = new MappedAddress();
		MappedResponseChangedSourceAddressReflectedFrom.parse(ma, data);
		logger.finer("Message Attribute: Mapped Address parsed: " + ma.toString() + ".");
		return ma;
	}
}
