/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.webservices12.ejb.descriptors.WSEjbOverrideWSRefWithDDsTest;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface TxRemote extends EJBObject {
  public String txRequired(String str) throws RemoteException;

  public String txRequiresNew(String str) throws RemoteException;

  public String txSupports(String str) throws RemoteException;

  public String txNotSupported(String str) throws RemoteException;

  public String txNever(String str) throws RemoteException;
}
