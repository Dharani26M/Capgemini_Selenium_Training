package com.saucelabs.seleniumuiframework.loginanlogout;

import org.testng.annotations.Test;

import com.saucelags.seleniumuiframework.pomutilities.BaseClassForSauce;
import com.saucelags.seleniumuiframework.pomutilities.LoginInPage;

public class LoginTest extends BaseClassForSauce {
	@Test
	public void Login() {
		LoginInPage lp=new LoginInPage(driver);
		lp.setUsername("standard_user");
//		lp.setPassword("secret_sauce");
		lp.loginclick();
	}
}
