/*-
 * ========================LICENSE_START=================================
 * smooks-edi-cartridge
 * %%
 * Copyright (C) 2020 Smooks
 * %%
 * Licensed under the terms of the Apache License Version 2.0, or
 * the GNU Lesser General Public License version 3.0 or later.
 *
 * SPDX-License-Identifier: Apache-2.0 OR LGPL-3.0-or-later
 *
 * ======================================================================
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
 *
 * ======================================================================
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * =========================LICENSE_END==================================
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;

import org.junit.jupiter.api.Test;
import org.smooks.Smooks;
import org.smooks.api.ExecutionContext;
import org.smooks.api.SmooksException;
import org.smooks.io.payload.JavaResult;
import org.smooks.support.StreamUtils;
import org.xml.sax.SAXException;

public class ConvertFromEdiToJavaOnePTestCase {

	Smooks smooks = null;

	@Test
	public void convertFromEdiToJava() throws IOException, SAXException, URISyntaxException {

		URI uri = new URI("file:C://dev//smooks//PoC//SmooksPoC//smooks-request-config-1p.xml");
		URL url = uri.toURL();
		smooks = new Smooks(url.getFile());

		/*FileInputStream fileInputStream = new FileInputStream("C:\\dev\\smooks\\PoC\\SmooksPoC\\input-message1p.edi");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		Stream<String> streamOfString = new BufferedReader(inputStreamReader).lines();
		String streamToString = streamOfString.collect(Collectors.joining());
		System.out.println(streamToString);*/

		ExecutionContext executionContext = smooks.createExecutionContext();
		org.smooks.io.payload.JavaResult result = this.runSmooksTransform(executionContext);
		System.out.println(result);

	}

	protected JavaResult runSmooksTransform(ExecutionContext executionContext) throws IOException, SmooksException {
		try {
			JavaResult javaResult = new JavaResult();

			byte[] messageIn = StreamUtils.readStream(new FileInputStream("input-message1p.edi"));
			smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(messageIn)), javaResult);
			return javaResult;
			
		} finally {
			smooks.close();
		}
	}
}