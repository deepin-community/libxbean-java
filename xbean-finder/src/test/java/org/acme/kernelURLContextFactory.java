/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme;

import javax.naming.spi.ObjectFactory;
import javax.naming.Name;
import javax.naming.Context;
import java.util.Hashtable;

/**
 * @version $Revision: 1393346 $ $Date: 2012-10-03 10:38:26 +0200 (Wed, 03 Oct 2012) $
 */
public class kernelURLContextFactory implements ObjectFactory {
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable environment) throws Exception {
        return "kernel";
    }
}
