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
package com.kentcommunications.lib;


import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class iTextPDFLibTest {

    private PdfReader reader;
    private RegionTextRenderFilter filter;

    @Before
    public void setUp() throws Exception {
        reader = new PdfReader("src/test/resources/testpdf.pdf");

    }

    @Test
    public void iTextGetsTextFromBoxOnPageOne() throws Exception {
        String text = PdfTextExtractor.getTextFromPage(reader, 2, strategy(new Rectangle(30,173,31,174)));
        assertEquals("Text from test box extracts as expected", "TOWNSHIP OF CLAY", text);
    }

    private FilteredTextRenderListener strategy(Rectangle rectangle) {
        return new FilteredTextRenderListener(new LocationTextExtractionStrategy(), new RegionTextRenderFilter(rectangle));

    }

}