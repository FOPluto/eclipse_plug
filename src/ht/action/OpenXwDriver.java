package ht.action;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import ht.views.XwDriverEditor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.IWorkbenchPage;

public class OpenXwDriver implements IWorkbenchWindowActionDelegate {

	public void run(IAction action) {
		// TODO Auto-generated method stub
		Display display=Display.getCurrent();
        Shell shell=new Shell(display);
        
		FileDialog fileDialog = new FileDialog(shell, SWT.OPEN | SWT.SINGLE);		
		//SWT.*大家可以去查一下SWT.MULTI 表示可以多选
		fileDialog.setFilterExtensions(new String[]{"*.txt","*.conf"});
		//文件过滤的后缀名表示可以被选 择的文件类型
		String file = fileDialog.open();
		if (null != file) {
			System.out.println("You chose to open this file: " + file);
			try {
				XwDriverEditor iview = (XwDriverEditor)PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow()
						.getActivePage()
						.showView("ht.XwDriverEditor", this.getSecondId(file), IWorkbenchPage.VIEW_ACTIVATE);
				iview.load(file);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("You do not chose any file!!!");
		}    
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		
	}
	
	private String getSecondId(final String file) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(file.getBytes());
	        BigInteger number = new BigInteger(1, messageDigest);
	        String hashtext = number.toString(16);
	        return "id_" + hashtext;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
