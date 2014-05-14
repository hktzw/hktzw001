/**
 * 
 */
package jp.gr.java_conf.hktzw.hktzw001;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author kitazawahro
 * 
 */

@Entity
@Table(name="test")
public class Entity_test implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private int param1;
	private String param2;
	/**
	 * @return id
	 */

	public Entity_test(){
		this(1,2,"0");
	}
	
	public Entity_test(int id, int param1, String param2) {
		this.id = id;
		this.param1 = param1;
		this.param2 = param2;
	}
	
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return param1
	 */
	public int getParam1() {
		return param1;
	}
	/**
	 * @param param1 セットする param1
	 */
	public void setParam1(int param1) {
		this.param1 = param1;
	}
	/**
	 * @return param2
	 */
	public String getParam2() {
		return param2;
	}
	/**
	 * @param param2 セットする param2
	 */
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	
	
	
	
}
