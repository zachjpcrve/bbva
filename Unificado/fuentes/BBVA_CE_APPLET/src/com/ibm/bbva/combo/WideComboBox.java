package com.ibm.bbva.combo;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

//got this workaround from the following bug: 
//http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4618607 
public class WideComboBox extends JComboBox {

	public WideComboBox() {
	}

	public WideComboBox(final Object items[]) {
		super(items);
	}

	public WideComboBox(Vector items) {
		super(items);
	}

	public WideComboBox(ComboBoxModel aModel) {
		super(aModel);
	}

	private boolean layingOut = false;

	public void doLayout() {
		try {
			layingOut = true;
			super.doLayout();
		} finally {
			layingOut = false;
		}
	}

	public Dimension getSize() {
		Dimension dim = super.getSize();
		if (!layingOut)
			dim.width = Math.max(dim.width, getPreferredSize().width);
		return dim;
	}
}