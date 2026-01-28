import java.util.Scanner;

abstract class GoodsTransport {
	protected String transportId;
  protected String transportDate;
  protected int transportRating ;
  
  public GoodsTransport(String transportId,String transportDate,int transportRating ) {
	  this.transportId = transportId;
	  this.transportDate = transportDate;
	  this.transportRating = transportRating;
  }
  
  public String getTransportDate() {
	  return this.transportDate;
  }
  public String getTransportId() {
	  return this.transportId;
  }
  public int getTransportRating() {
	  return this.transportRating;
  }
  public void setTransportId(String transportId) {
	  this.transportId = transportId ;
  }
  public void setTransportDate(String transportDate) {
	  this.transportDate = transportDate ;
  }
  public void setTransportRating(int transportRating) {
	  this.transportRating = transportRating ;
  }
  abstract public String vehicleSelection();
  abstract public float calculateTotalCharge();
}

class BrickTransport extends GoodsTransport {
        private float brickSize;
        private int   brickQuantity;
        private float brickPrice ;
	public BrickTransport(String transportId,String transportDate,int transportRating,float brickSize,int brickQuantity, float brickPrice  ) {
		super(transportId,transportDate,transportRating );
		this.brickPrice = brickPrice;
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
	}
	
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	@Override
	public String vehicleSelection() {
		// TODO Auto-generated method stub
		if(brickQuantity < 300)
			return "Truck";
		else if(brickQuantity >=300 && brickQuantity <=500) {
			return "Lorry" ;
		}
		else 
			return "Monster Lorry";
	}

	@Override
	public float calculateTotalCharge() {
		// TODO Auto-generated method stub
		float price = brickPrice * brickQuantity ;
		float tax = (float) (price * 0.3);
		int discountPercentage ;
		if(transportRating == 5)
			discountPercentage = 20 ;
		else if(transportRating ==3 || transportRating == 4)
			discountPercentage = 10;
		else
			discountPercentage = 0;
		float discount = price * discountPercentage/100;
		int vehiclePrice ;
		if(this.vehicleSelection() == "Truck")
			vehiclePrice = 1000;
		else if((this.vehicleSelection() == "Truck"))
			vehiclePrice= 1700;
		else
			vehiclePrice = 3000;
		float totalCharge = price + vehiclePrice + tax - discount ;
		return totalCharge;
	}

}

class TimberTransport extends GoodsTransport {
      float timberLength ;
      float timberRadius ;
      String timberType ;
      float timberPrice ;
      
      TimberTransport(String transportId,String transportDate,int transportRating,float timberLength, float timberRadius,String timberType, float timberPrice ){
    	  super(transportId,transportDate,transportRating);
    	  this.timberLength = timberLength;
    	  this.timberRadius = timberRadius ;
    	  this.timberType = timberType;
    	  this.timberPrice = timberPrice ;
      }
      
      public float getTimberLength() {
    	  return this.timberLength ;
      }
      public float getTimberRadius() {
    	  return this.timberRadius ;
      }
      public float getTimberPrice() {
    	  return this.timberPrice ;
      }
      public String getTimberTyoe() {
    	  return this.timberType ;
      }
      public void setTimberLength(float timberLength) {
    	 this.timberLength = timberLength ;
      }
      public void setTimberRadius(float timberRadius) {
    	   this.timberRadius = timberRadius ;
      }
      public void setTimberPrice(float timberPrice) {
    	   this.timberPrice  = timberPrice;
      }
      public void setTimberTyoe(String timberType) {
    	   this.timberType  = timberType;
      }
	@Override
	public String vehicleSelection() {
		// TODO Auto-generated method stub
		float area = (float) (2*Math.PI*timberRadius*timberLength);
		if(area < 250)
			return "Truck";
		else if(area >=250 && area <= 400) {
			return "Lorry" ;
		}
		else 
			return "Monster Lorry";
	}
	

	@Override
	public float calculateTotalCharge() {
		// TODO Auto-generated method stub
		float volume = (float) (Math.PI * timberRadius * timberRadius * timberLength) ;
	    float timbertype ;
	    if(timberType.equalsIgnoreCase("premium"))
	    timbertype = (float) 0.25;
	    else
	    	timbertype = (float) 0.15;
		float price = volume * timberPrice * timbertype ;
		float tax =(float) (price * 0.3) ;
		
		int discountPercentage ;
		if(transportRating == 5)
			discountPercentage = 20 ;
		else if(transportRating ==3 || transportRating == 4)
			discountPercentage = 10;
		else
			discountPercentage = 0;
		float discount = price * discountPercentage/100;
		int vehiclePrice ;
		if(this.vehicleSelection() == "Truck")
			vehiclePrice = 1000;
		else if((this.vehicleSelection() == "Truck"))
			vehiclePrice= 1700;
		else
			vehiclePrice = 3000;
		float totalCharge = price + vehiclePrice + tax - discount ;
		
		return totalCharge;
	}

}

class Utility {
 public GoodsTransport parseDetails(String input) {
	 Scanner sc = new Scanner(System.in);
	 if(input.equalsIgnoreCase("BrickTransport")) {
		
		     System.out.print("Enter transport Id : ");
		     String transportId = sc.next();
		     System.out.print("Enter transport Date : ");
		     String transportDate = sc.next();
		     System.out.print("Enter transport Rating : ");
		     int transportRating  = sc.nextInt();
		     System.out.print("Enter Brick Size : ");
		     float brickSize = sc.nextFloat();
		     System.out.print("Enter Brick Quantity : ");
	         int   brickQuantity = sc.nextInt();
	         System.out.print("Enter Brick Price : ");
	         float brickPrice = sc.nextFloat() ;
		 return new BrickTransport(transportId,transportDate,transportRating,brickSize,brickQuantity,brickPrice);
	 }
	 else{
		 
	     System.out.print("Enter transport Id : ");
	     String transportId = sc.next();
	     System.out.print("Enter transport Date : ");
	     String transportDate = sc.next();
	     System.out.print("Enter transport Rating : ");
	     int transportRating  = sc.nextInt();
	     System.out.print("Enter Timber Length : ");
	     float timberLength  = sc.nextFloat();
	     System.out.print("Enter Timber Radius : ");
         float timberRadius = sc.nextFloat();
         System.out.print("Enter Timber Type : ");
         String timberType = sc.next() ;
         System.out.print("Enter Timber Price : ");
         float timberPrice = sc.nextFloat();
	 return new TimberTransport(transportId,transportDate,transportRating,timberLength,timberRadius,timberType,timberPrice);
 }
 }	 
 }
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Utility obj = new Utility();
      GoodsTransport brick =  obj.parseDetails("bricktransport");
      GoodsTransport timber =  obj.parseDetails("timbertransport");
      
     System.out.println( brick.calculateTotalCharge());
      System.out.println(timber.calculateTotalCharge());
	}

}