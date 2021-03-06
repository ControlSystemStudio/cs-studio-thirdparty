//$Id: Stuff.java 14736 2008-06-04 14:23:42Z hardy.ferentschik $
package org.hibernate.test.annotations.generics;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author Emmanuel Bernard
 */
@MappedSuperclass
public class Stuff<Value> {
	private Value value;

	@ManyToOne
	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
}
