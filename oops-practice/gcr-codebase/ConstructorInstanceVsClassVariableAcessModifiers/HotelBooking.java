

public class HotelBooking {
    private String guestName ;
    private String roomType;
    private int days ;
     
     HotelBooking(){}
     HotelBooking(String guestName , String roomType , int days){
        this.days = days;
        this.guestName = guestName;
        this.roomType = roomType;
     }
     HotelBooking(HotelBooking h){
        this.days = h.days;
        this.guestName = h.guestName;
        this.roomType = h.roomType;
     }
}
