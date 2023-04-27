package ht.views;

import java.util.Random;

import ht.views.function.Java1Function;
import ht.views.function.Java2Function;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.widgets.Composite;

public class MyCodeGenerator extends BaseView {

	public MyCodeGenerator() {
		// TODO Auto-generated constructor stub
	}

	public void createPartControl(Composite parent) {

		codeGeneratorBrowser = new Browser(parent, SWT.NONE);

		codeGeneratorBrowser.setUrl("http://localhost/eclipse.html?t="
				+ new Random().nextInt());

		codeGeneratorBrowser.addProgressListener(new ProgressListener() {

			public void completed(ProgressEvent event) {
				codeGeneratorBrowser.execute("alert('来自java的alert')");
				codeGeneratorBrowser.execute("f1('java调用f1')");

				new Java1Function(codeGeneratorBrowser, "java1");
				new Java2Function(codeGeneratorBrowser, "java2");
			}

			public void changed(ProgressEvent event) {
				// TODO Auto-generated method stub

			}
		});

	}

	public void setFocus() {
		// TODO Auto-generated method stub

	}
}
