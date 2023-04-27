package ht.views;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class XwDriverEditor extends ViewPart {

	Composite bottom;
	Text text;
	
	private String file = null;

	public XwDriverEditor() {

	}

	public void createPartControl(Composite parent) {
		System.out.println("������ͼ");

		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER
				| SWT.MULTI | SWT.FULL_SELECTION);

		Table table = tableViewer.getTable();
		// table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
		// 1));

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		String[] tableHeader1 = { "�к�", "��ʼ���룩", "�������룩","����","����","����","����/����","�洢��ʽ","��ע"};

		for (int i = 0; i < tableHeader1.length; i++) {
			TableColumn tableColumn = new TableColumn(table, SWT.NONE);
			tableColumn.setText(tableHeader1[i]);
			tableColumn.setWidth(300);
		}
		TableItem tableItem = null;
		for (int i = 1; i < 6; i++) {
			tableItem = new TableItem(table, SWT.NONE);
			tableItem.setText(new String[] { "����" + i,
					100 * i + "," + (200 * i) });
		}

		for (int i = 0; i < tableHeader1.length; i++) {
			table.getColumn(i).pack();
		}

		TableEditor tableEditor = new TableEditor(table);

		// ProgressBar bar = new ProgressBar(table, SWT.HORIZONTAL|SWT.SMOOTH);
		// bar.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		// bar.setSelection(10);

		Text text = new Text(table, SWT.BORDER);
		tableEditor.grabHorizontal = true;

		tableEditor.setEditor(text, tableItem, 1);

		TableEditor tableEditor1 = new TableEditor(table);
		Combo combo = new Combo(table, SWT.READ_ONLY | SWT.BORDER);
		combo.setItems(new String[] { "8-bit Hex", "8-bit Int", "8-bit uint",
				"16-bit Hex" });
		combo.select(1);

		tableEditor1.grabHorizontal = true;
		tableEditor1.setEditor(combo, tableItem, 0);
		
		TableEditor tableEditor2 = new TableEditor(table);
		Button button = new Button(table, SWT.BORDER);
		button.setText("���ǰ�ť");

		tableEditor2.grabHorizontal = true;
		tableEditor2.setEditor(button, tableItem, 2);

		/*
		 * CellEditor[] editors = new CellEditor[2]; editors[0] = new
		 * TextCellEditor(table,SWT.BORDER); editors[1] = new
		 * TextCellEditor(table,SWT.BORDER);
		 * tableViewer.setCellEditors(editors);
		 */

	}

	public void setFocus() {

	}
	
	/**
	 * �򿪽ű��ļ�
	 */
	public void load(String file) {
		System.out.println("���ز��Խű���+" + file);
		this.file = file;
		this.setPartName("�ű�-" + file);
	}
}
