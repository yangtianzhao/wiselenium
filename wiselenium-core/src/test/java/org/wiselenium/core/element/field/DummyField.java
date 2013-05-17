package org.wiselenium.core.element.field;

import org.openqa.selenium.WebElement;
import org.wiselenium.core.Field;

@SuppressWarnings("javadoc")
@Field
public interface DummyField {
	
	WebElement getWrappedElement();
	
}