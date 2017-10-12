package rental;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ICarRentalCompany extends Remote{
	Set<CarType> getAvailableCarTypes(Date start,Date end) throws RemoteException;
	Quote createQuote(ReservationConstraints constraints,String guest) throws ReservationException,RemoteException;
	void cancelReservation(Reservation reservation) throws RemoteException;
	Reservation confirmQuote(Quote quote) throws ReservationException,RemoteException;
	List<Reservation> getRenterReservations(String name) throws RemoteException;
	int getNumberOfReservationsForCarType(String carType) throws RemoteException;
}
