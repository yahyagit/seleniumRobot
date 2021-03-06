/**
 * Orignal work: Copyright 2015 www.seleniumtests.com
 * Modified work: Copyright 2016 www.infotel.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.seleniumtests.it.reporter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumtests.reporter.TestLogging;
import com.seleniumtests.reporter.TestStep;

public class StubTestClass {

	@Test(groups="stub")
	public void test1() {
		TestStep step1 = new TestStep("etape 1");
		step1.setDuration(1230L);
		TestStep step2 = new TestStep("etape 2");
		step2.setDuration(14030L);
		TestLogging.logTestStep(step1);
		TestLogging.logTestStep(step2);
	}
	
	@Test(groups="stub")
	public void testInError() {
		Assert.fail("error");
	}
}
