package ht.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MyCodeEdit1 extends ViewPart {

	Composite bottom;
	Text text;

	public MyCodeEdit1() {

	}

	public void createPartControl(Composite parent) {
		GridLayout g1 = new GridLayout(1, true);
		g1.marginWidth = 0;
		parent.setLayout(g1);

		Composite top = new Composite(parent, SWT.NONE);
		//bottom = new Composite(parent, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.WRAP, true, false, 1, 1));
		//bottom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		// 布局top。 包括地址栏和显示进制选择
		// lable
		top.setLayout(new GridLayout(3, false));
		Label l = new Label(top, SWT.CENTER);
		l.setText("Address :");
		l.setLayoutData(new GridData(SWT.WRAP, SWT.FILL, false, false, 1, 1));
		// text
		text = new Text(top, SWT.BORDER);
		text.setText("Ox");
		text.setSelection(2);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		// combox
		final Combo combo = new Combo(top, SWT.READ_ONLY | SWT.BORDER);
		combo.setItems(new String[] { "8-bit Hex", "8-bit Int", "8-bit uint",
				"16-bit Hex" });
		combo.select(1);
		combo.setLayoutData(new GridData(SWT.WRAP, SWT.FILL, false, false, 1, 1));

	}

	public void setFocus() {

	}

}
