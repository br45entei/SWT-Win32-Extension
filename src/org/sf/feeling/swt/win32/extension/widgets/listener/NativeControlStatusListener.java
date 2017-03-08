/*******************************************************************************
 * Copyright (c) 2007 cnfree.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  cnfree  - initial API and implementation
 *******************************************************************************/
package org.sf.feeling.swt.win32.extension.widgets.listener;

import org.eclipse.swt.widgets.Event;

public interface NativeControlStatusListener
{

	public void handleStartEvent(Event event );

	public void handleLoadedEvent(Event event );

	public void handleFailedEvent(Event event );

	public void handleExitedEvent(Event event );

	public void handleTerminatedEvent(Event event );

	public void handleTerminatFailedEvent( Event event );
	
}
