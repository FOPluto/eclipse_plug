package ht.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

public class MyCodeEdit extends BaseView {

	public MyCodeEdit() {
		// TODO Auto-generated constructor stub
	}

	public void createPartControl(Composite parent) {
		codeEditBrowser = new Browser(parent, SWT.NONE);

		codeEditBrowser.setUrl("http://www.baidu.com");
		codeEditBrowser.setText("<b>这里是脚本编辑页面</b>");
	}

	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
