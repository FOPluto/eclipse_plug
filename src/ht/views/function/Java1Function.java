package ht.views.function;

import ht.views.BaseView;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class Java1Function extends BrowserFunction {

	public Java1Function(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {
		int len = arguments.length;
		System.out.println("len=" + len);
		for (int i = 0; i < len; i++) {
			System.out.println(arguments[i]);
		}

		BaseView.codeEditBrowser.setText(BaseView.codeEditBrowser.getText()
				+ "<br>" + arguments[0]);

		return super.function(arguments);
	}
}
