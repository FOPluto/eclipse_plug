/**
 * 
 */
package ht.xwdriver;

/**
 * @author 盛铭吉智
 *
 */
public class CommandFactory {
	
	/**
	 * 根据命令名称和命令行创建命令行对象
	 * @param cmdname
	 * @param cmdstr
	 * @return
	 */
	public ICommand parse(String cmdname, String cmdstr) {
		switch (cmdname) {
			default:
				return null;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
