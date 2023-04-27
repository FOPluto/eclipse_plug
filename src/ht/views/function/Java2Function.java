package ht.views.function;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

public class Java2Function extends BrowserFunction {

	public Java2Function(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {
		int len = arguments.length;
		if (len > 0) {
			String arg = arguments[0].toString();
			System.out.println(arg);

			JSONObject object = JSONUtil.parseObj(arg);
			String id = object.get("id").toString();
			String name = object.get("name").toString();

			System.out.println(id);
			System.out.println(name);

		}
		return super.function(arguments);
	}
}
