/*
 * #%L
 * Talend :: ESB :: Job :: Controller
 * %%
 * Copyright (C) 2011 - 2012 Talend Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.talend.esb.job.controller;

import org.apache.cxf.Bus;
import org.apache.neethi.Policy;

public interface PolicyProvider {

    Policy getUsernamePolicy(Bus cxf);

    Policy getSAMLPolicy(Bus cxf);

    Policy getSAMLAuthzPolicy(Bus cxf);

    Policy getSAMLCryptoPolicy(Bus cxf);

    Policy getSAMLAuthzCryptoPolicy(Bus cxf);

    void register(Bus cxf);

}