package SeatBooking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MultiSeatBookingService {

    private final Map<String, SeatInfo> seatsMap = new ConcurrentHashMap<>();

    public MultiSeatBookingService(List<String> seatNumbers){
        for(String seatNo : seatNumbers ){
            seatsMap.put(seatNo, new SeatInfo(seatNo));
        }
    }

    public void bookAllSeats(List<String> seatNos) throws SeatAlreadyBookedException {

        if( seatNos == null || seatNos.isEmpty()){
            throw new IllegalArgumentException("Invalid Seat Numbers");
        }

        if (seatNos.size() > 6) {
            throw new IllegalArgumentException("Cannot book more than 6 seats");
        }

        List<SeatInfo> requestedSeats = new ArrayList<>();
        for( String seat : seatNos){
            SeatInfo newSeat = seatsMap.get(seat);
            if (newSeat == null) {
                throw new IllegalArgumentException("Invalid seat: " + newSeat);
            }
            requestedSeats.add(newSeat);
        }

        requestedSeats.sort(Comparator.comparing(SeatInfo::getSeatNo));

        for( SeatInfo seat : requestedSeats){
            seat.getLock().lock();
        }
        try {

            for ( SeatInfo seat : requestedSeats){
                if(seat.getStatus() == Status.BOOKED){
                    throw new SeatAlreadyBookedException("Seat " + seat.getSeatNo()+ "is already booked");
                }
            }


            for (SeatInfo seat : requestedSeats){
                seat.setStatus(Status.BOOKED);
            }


        }finally {
            for (int i = requestedSeats.size()-1; i >= 0; i--) {
                requestedSeats.get(i).getLock().unlock();
            }
        }


    }


}
