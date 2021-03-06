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

package org.sf.feeling.swt.win32.extension.jna.ptr;

import org.sf.feeling.swt.win32.extension.jna.exception.NativeException;

public class LongByReference extends ByReference
{

	public LongByReference( ) throws NativeException
	{
		this( 0L );
	}

	public LongByReference( long value ) throws NativeException
	{
		super( 8 );
		setValue( value );
	}

	public void setValue( long value ) throws NativeException
	{
		getPointer( ).setLongAt( 0, value );
	}

	public long getValue( ) throws NativeException
	{
		return getPointer( ).getAsLong( 0 );
	}
}
