/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xbean.osgi.bundle.util;

/**
 * @version $Rev: 939977 $ $Date: 2010-05-01 13:29:43 +0200 (Sat, 01 May 2010) $
 */
public interface ClassDiscoveryFilter {

    public boolean rangeDiscoveryRequired(DiscoveryRange discoveryRange);

    public boolean jarFileDiscoveryRequired(String url);

    public boolean directoryDiscoveryRequired(String url);

    public boolean packageDiscoveryRequired(String packageName);
}
