package gov.nist.toolkit.toolkitFramework.client.util;

public class CookieManager {
	
	/*
	 * Relevant Cookie management calls are:
	 * 
	 * Cookies.getCookie(cookieName);
	 * Cookies.removeCookie(cookieName);
	 * Cookies.setCookie(cookieName, value);
	 */

	static public final String ENVIRONMENTCOOKIENAME = "gov.nist.registry.xdstools2.EnvironmentCookie";
	static public final String TESTSESSIONCOOKIENAME = "gov.nist.registry.xdstools2.TestSessionCookie";
	static public final String PATIENTIDCOOKIENAME = "gov.nist.registry.xdstools2.PatientIDCookie";
	static public final String LASTSITECOOKIENAME = "gov.nist.registry.xdstools2.LastSiteCookie";
	static public final String FAVORITEPIDSCOOKIENAME = "gov.nist.registry.xdstools2.FavoritePidsCookie";

}