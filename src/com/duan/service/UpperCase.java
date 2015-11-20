package com.duan.service;

import com.duan.inter.IChangeLetter;

/**
 * com.duan.service
 * Created by duanda on 11/20/15.
 */
public class UpperCase implements IChangeLetter {
	private String mString;

	@Override
	public String changeLetter() {
		return mString.toUpperCase();
	}

	public String getString() {
		return mString;
	}

	public void setString(String string) {
		mString = string;
	}
}
