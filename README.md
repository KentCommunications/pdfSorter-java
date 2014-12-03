Pdf Sorter
==========

[![Build Badge](https://travis-ci.org/KentCommunications/pdfSorter-java.svg&style=flat)](https://travis-ci.org/KentCommunications/pdfSorter-java)
[![Issues Badge](https://img.shields.io/github/issues/KentCommunications/pdfSorter-java.svg&style=flat)](https://waffle.io/kentcommunications/pdfsorter-java)

Prerequisites
-------------

  - [Oracle Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  installed and properly configured.
  - A [Free GitHub Account](https://github.com/signup/free).

Preparing to Hack
-----------------

Once you have [JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html) installed,
you should clone this repo into your favorite working directory.

#### Clone

    cd <working directory>
    git clone git@github.com:KentCommunications/pdfSorter-java.git pdfsorter
    cd pdfsorter

Next we should make sure [Gradle](http://www.gradle.org/) is working.

#### Gradle

We have included the Gradle Wrapper in our project, to help make it easier for everyone.
All you need to do in order to make sure Gradle is working properly is run gradlew (gradlew.bat for windows users):

    ./gradlew assemble

this should have output which looks similar to this:

    :compileJava
    :processResources
    :classes
    :jar
    :assemble

    BUILD SUCCESSFUL

    Total time: 0.06 secs

If you get an error, your JDK is probably incorrectly configured.

#### Testing

Lastly, we need to make sure the test suite runs as expected. we use gradle here too, just run:

    ./gradlew test

If everything passes, you are ready to begin hacking.

Hacking
-------

There isn't much here right now, so I would suggest just sitting back and relaxing.
once we have a little more done, we will cover how to contribute in more detail.

Contributing
------------

Be sure to read the [CONTRIBUTING.md](https://github.com/KentCommunications/pdfSorter-java/blob/master/CONTRIBUTING.md)
document in this repository for further information about how to contribute to this project.

Before you contribute you will also need to sign our [CLA](https://github.com/KentCommunications/pdfSorter-java/blob/master/CLA.md)
which is hosted by [CLAHub](https://www.clahub.com/).

Copyright
---------

Copyright 2014 Kyle Chamberlin

License
-------

*Licensed under the __Apache License__, Version __2.0__ (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at*

[Apache.org - Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)

*Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an __"AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND__, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*