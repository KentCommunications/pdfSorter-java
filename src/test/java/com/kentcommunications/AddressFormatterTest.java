/**
 * Copyright 2014 Kyle Chamberlin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package com.kentcommunications;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddressFormatterTest {

    @Test
    public void emptyAddressString() throws Exception {
        Address address = new Address("");

        assertEquals("Empty address has no name", "", address.getName());
        assertEquals("Empty address has no Company", "", address.getCompany());
        assertEquals("Empty address has no Address2", "", address.getAddress2());
        assertEquals("Empty address has no Address1", "", address.getAddress1());
        assertEquals("Empty address has no CSZ", "", address.getCSZ());
    }

    @Test
    public void singleLineAddressIsJustName() {
        Address address = new Address("A Name");

        assertEquals("Single line address has a name", "A Name", address.getName());
        assertEquals("Single line address has no Company", "", address.getCompany());
        assertEquals("Single line address has no Address2", "", address.getAddress2());
        assertEquals("Single line address has no Address1", "", address.getAddress1());
        assertEquals("Single line address has no CSZ", "", address.getCSZ());
    }

}