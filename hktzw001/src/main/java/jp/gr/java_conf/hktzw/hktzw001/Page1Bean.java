/**
 * 
 */
package jp.gr.java_conf.hktzw.hktzw001;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.*;

/**
 * @author kitazawahro
 * 
 */

@ManagedBean
@SessionScoped
public class Page1Bean implements Serializable {
	private static final long serialVersionUID = 1L;
	private HtmlCommandButton button1;
	private HtmlOutputText text1;
	private HtmlInputText field1;

	/**
	 * @return button1
	 */
	public HtmlCommandButton getButton1() {
		return button1;
	}

	/**
	 * @param button1 セットする button1
	 */
	public void setButton1(HtmlCommandButton button1) {
		this.button1 = button1;
	}

	/**
	 * @return text1
	 */
	public HtmlOutputText getText1() {
		return text1;
	}

	/**
	 * @param text1 セットする text1
	 */
	public void setText1(HtmlOutputText text1) {
		this.text1 = text1;
	}

	/**
	 * @return field1
	 */
	public HtmlInputText getField1() {
		return field1;
	}

	/**
	 * @param field1 セットする field1
	 */
	public void setField1(HtmlInputText field1) {
		this.field1 = field1;
	}

	public String button1_action() {
		String s = (String) field1.getValue();
		text1.setValue("こんばんわ、"+ s + "さん！");
		return "";
	}
	
}
