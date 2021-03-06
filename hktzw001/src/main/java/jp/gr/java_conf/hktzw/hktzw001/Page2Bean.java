/**
 * 
 */
package jp.gr.java_conf.hktzw.hktzw001;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.*;

import javax.persistence.*;
import javax.ejb.*;

import jp.gr.java_conf.hktzw.hktzw001.entity.*;

/**
 * @author kitazawahro
 * 
 */

@ManagedBean
@SessionScoped
@Stateless
public class Page2Bean implements Serializable {
	private static final long serialVersionUID = 1L;
	// @PersistenceUnit
	// EntityManagerFactory emf;
	@PersistenceContext(unitName = "test")
	EntityManager em;

	private HtmlCommandButton button1;
	private HtmlCommandButton button2;
	private HtmlOutputText text1;
	private HtmlInputText id;
	private HtmlInputText param1;
	private HtmlInputText param2;

	/**
	 * @return button1
	 */
	public HtmlCommandButton getButton1() {
		return button1;
	}

	/**
	 * @param button1
	 *            セットする button1
	 */
	public void setButton1(HtmlCommandButton button1) {
		this.button1 = button1;
	}

	/**
	 * @return button2
	 */
	public HtmlCommandButton getButton2() {
		return button2;
	}

	/**
	 * @param button2
	 *            セットする button2
	 */
	public void setButton2(HtmlCommandButton button2) {
		this.button2 = button2;
	}

	/**
	 * @return id
	 */
	public HtmlInputText getId() {
		return id;
	}

	/**
	 * @return text1
	 */
	public HtmlOutputText getText1() {
		return text1;
	}

	/**
	 * @param text1
	 *            セットする text1
	 */
	public void setText1(HtmlOutputText text1) {
		this.text1 = text1;
	}

	/**
	 * @param id
	 *            セットする id
	 */
	public void setId(HtmlInputText id) {
		this.id = id;
	}

	/**
	 * @return param1
	 */
	public HtmlInputText getParam1() {
		return param1;
	}

	/**
	 * @param param1
	 *            セットする param1
	 */
	public void setParam1(HtmlInputText param1) {
		this.param1 = param1;
	}

	/**
	 * @return param2
	 */
	public HtmlInputText getParam2() {
		return param2;
	}

	/**
	 * @param param2
	 *            セットする param2
	 */
	public void setParam2(HtmlInputText param2) {
		this.param2 = param2;
	}

	public String button1_action() {
		Integer i = new Integer(id.getValue().toString());
		Integer p1 = new Integer(param1.getValue().toString());
		String p2 = (String) param2.getValue();
		addData(i, p1, p2);
		text1.setValue("追加しました！（" + i + "," + p1 + "," + p2 + ")");
		return "";
	}

	public void addData(Integer id, Integer param1, String param2) {
		Test entity = new Test();
		entity.setId(id);
		entity.setParam1(param1);
		entity.setParam2(param2);
		em.persist(entity);
	}

	public String button2_action() {
		text1.setValue(getCount());
		return "";
	}

	public String getCount() {
		// emf = Persistence.createEntityManagerFactory("hktzw001");
		// manager = emf.createEntityManager();
//		em.find(test<T>, 99);
//		em.find(entityClass, 99);
		return "";

	}
}
