package com.app.service;

public class MyServiceImpl implements MyService {

	@Override
	public boolean isValidPan(String pan) {

		if (pan == null) {
			return false;
		} else {
			return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		}
	}

	@Override
	public boolean isValidPrimeNumber(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidIndianMobileNumber(String mobileNumber) {

		if (mobileNumber == null) {
			return false;
		} else {
			return mobileNumber.matches("\\+91-[0-9]{10}");
		}
	}

}
