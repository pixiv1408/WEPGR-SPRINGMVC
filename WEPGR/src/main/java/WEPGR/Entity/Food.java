package WEPGR.Entity;

import javax.persistence.Entity;
@Entity
public class Food {
	private int FoodID;
	private String FName;
	private int FPrice;
	private String FDescribe;
	private String Fimage;
	private String FStatus;
	private int CID;
	public Food(int foodID, String fName, int fPrice, String fDescribe,String fImage,
			String fStatus, int cID) {
		super();
		FoodID = foodID;
		FName = fName;
		FPrice = fPrice;
		FDescribe = fDescribe;
		Fimage = fImage;
		FStatus = fStatus;
		CID = cID;
	}
	@Override
	public String toString() {
		return "Food [FoodID=" + FoodID + ", FName=" + FName + ", FPrice=" + FPrice + ", FDescribe=" + FDescribe
				+ ", Fimage=" + Fimage + ", FStatus=" + FStatus + ", CID=" + CID + "]";
	}
	
	public int getFoodID() {
		return FoodID;
	}
	public void setFoodID(int foodID) {
		FoodID = foodID;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public int getFPrice() {
		return FPrice;
	}
	public void setFPrice(int fPrice) {
		FPrice = fPrice;
	}
	public String getFDescribe() {
		return FDescribe;
	}
	public void setFDescribe(String fDescribe) {
		FDescribe = fDescribe;
	}
	public String getFimage() {
		return Fimage;
	}
	public void setFimage(String fimage) {
		Fimage = fimage;
	}
	public String getFStatus() {
		return FStatus;
	}
	public void setFStatus(String fStatus) {
		FStatus = fStatus;
	}
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	
}
