/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.itest.jetty;

import static org.ops4j.pax.exam.CoreOptions.systemProperty;
import static org.ops4j.pax.exam.OptionUtils.combine;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.web.itest.base.TestConfiguration;
import org.ops4j.pax.web.itest.common.AbstractWarJSFFaceletsIntegrationTest;

/**
 * @author achim
 */
@RunWith(PaxExam.class)
@Ignore("Fails with \"Duplicate import: javax.faces.webapp\" - pax-url-war bug?")
public class WarJSFFaceletsIntegrationTest extends AbstractWarJSFFaceletsIntegrationTest {

	@Configuration
	public static Option[] configure() {
		return combine(
				configureJetty(),
				systemProperty("org.ops4j.pax.logging.DefaultServiceLog.level").value("INFO"),
				TestConfiguration.jsfBundlesWithDependencies()
		);

	}
}
