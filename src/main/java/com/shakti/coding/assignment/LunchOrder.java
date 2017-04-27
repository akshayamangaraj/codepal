/**
 *
 */
package com.shakti.coding.assignment;

/**
 * @author sparid2
 *
 */
public class LunchOrder {

	private String bread;
	private String dressing;
	private String meat;



	public static class Builder{

		private String bread;
		private String dressing;
		private String meat;

	}

	public String getBread() {
		return bread;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}



}
