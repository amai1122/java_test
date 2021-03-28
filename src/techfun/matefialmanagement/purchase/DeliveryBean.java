package techfun.matefialmanagement.purchase;

public class DeliveryBean {
	private String buyerCd;
	private String componentCd;
	private String supplierCd;
	private String supplierNe;
	private int orderQty;
	/**
	 * @return buyerCd購買担当
	 */
	public String getBuyerCd() {
		return buyerCd;
	}
	/**
	 * @param buyerCd セットする buyerCd購買担当
	 */
	public void setBuyerCd(String buyerCd) {
		this.buyerCd = buyerCd;
	}
	/**
	 * @return componentCd部品
	 */
	public String getComponentCd() {
		return componentCd;
	}
	/**
	 * @param componentCd セットする componentCd部品
	 */
	public void setComponentCd(String componentCd) {
		this.componentCd = componentCd;
	}
	/**
	 * @return supplierCd仕入れ先コード
	 */
	public String getSupplierCd() {
		return supplierCd;
	}
	/**
	 * @param supplierCd セットする supplierCd仕入れ先コード
	 */
	public void setSupplierCd(String supplierCd) {
		this.supplierCd = supplierCd;
	}
	/**
	 * @return supplierNe仕入れ先名称
	 */
	public String getSupplierNe() {
		return supplierNe;
	}
	/**
	 * @param supplierNe セットする supplierNe仕入れ先名称
	 */
	public void setSupplierNe(String supplierNe) {
		this.supplierNe = supplierNe;
	}
	/**
	 * @return orderQty発注数量
	 */
	public int getOrderQty() {
		return orderQty;
	}
	/**
	 * @param orderQty セットする orderQty発注数量
	 */
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

}
