/**
 *
 */
package com.shakti.coding.assignment;

/**
 * @author sparid2
 *
 */
public class BuilderPatterLaunchOrder {



	public static class Builder{

		public Builder(){

		}

		public BuilderPatterLaunchOrder build(){
			return new BuilderPatterLaunchOrder(this);
		}

		private String Bread;
		private String condiment;
		private String dressing;
		private String meat;

		public Builder bread(String bread){
			this.Bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiment = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

	}

	private final String Bread;
	private final String condiment;
	private final String dressing;
	private final String meat;

	public BuilderPatterLaunchOrder(Builder builder){
		this.Bread = builder.Bread;
		this.condiment = builder.condiment;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}

	public String getBread() {
		return Bread;
	}
	public String getCondiment() {
		return condiment;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}




}
