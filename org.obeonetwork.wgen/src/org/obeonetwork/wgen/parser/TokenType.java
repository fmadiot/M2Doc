/*******************************************************************************
 *  Copyright (c) 2016 Obeo. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *******************************************************************************/
package org.obeonetwork.wgen.parser;

public enum TokenType {
	AQL("aql:"), GDFOR("gd:for"), GDENDFOR("gd:endfor"), GDIF("gd:if"), GDELSEIF("gd:elseif"), GDELSE(
			"gd:else"), GDENDIF("gd:endif"), GDTABLE("gd:table"), GDLET("gd:let"), GDENDLET("gd:endlet"), ELT(
					"elt:"), VAR("var:"), STATIC("static"), GDIMAGE("gd:image"), EOF("end of file."), WTABLE("table");

	private String value;

	public String getValue() {
		return value;
	}

	private TokenType(String theValue) {
		this.value = theValue;
	}
}