package SeatBooking;

import java.util.*;

public class SingleSeatBookingService {

    private final Map<String, SeatInfo> seatsMap = new HashMap<>();

    public SingleSeatBookingService(List<String> seatNumbers){
        for (String seatNumber : seatNumbers){
            seatsMap.put(seatNumber, new SeatInfo(seatNumber));
        }
    }


    public List<String> viewAvailableSeats(){
        List<String> availableSeats = new ArrayList<>();

        for (SeatInfo seat : seatsMap.values()){
            if(seat.getStatus() == Status.AVAILABLE){
                availableSeats.add(seat.getSeatNo());
            }
        }

        return availableSeats;
    }

    public void bookSeat(String requestedSeatNo) throws SeatAlreadyBookedException {

        SeatInfo requestedSeat = seatsMap.get(requestedSeatNo);

        if (requestedSeat == null){
            throw new IllegalArgumentException("Invalid Seat");
        }

        requestedSeat.getLock().lock();
        try {
            //payment business logic
            if(requestedSeat.getStatus() == Status.BOOKED){
                throw new SeatAlreadyBookedException("This seat is already booked");
            }
            requestedSeat.setStatus(Status.BOOKED);

        } finally {
            requestedSeat.getLock().unlock();
        }

    }



}
