/*******************************************************************************
 * Copyright (c) 2011 cnfree.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  cnfree  - initial API and implementation
 *******************************************************************************/
package org.sf.feeling.swt.win32.extension.jna.datatype.win32;


public class HANDLE extends IntPtr {
	
	public static final HANDLE INVALID_HANDLE_VALUE = new HANDLE(-1);
	
	public HANDLE(int value) {
		super(value);
	}

	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj instanceof HANDLE) {
			return obj.hashCode() == hashCode();
		} else {
			return false;
		}
	}


	public int hashCode() {
		return getValue();
	}
	
	
}
