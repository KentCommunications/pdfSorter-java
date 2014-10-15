/**
* Copyright 2014 Kyle Chamberlin
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.kentcommunications;

public class Address {

    private String name;
    private String company;
    private String address2;
    private String address1;
    private String CSZ;

    public Address(String addressString) {
        name = addressString;
        company = "";
        address2 = "";
        address1 = "";
        CSZ = "";
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCSZ() {
        return CSZ;
    }
}
