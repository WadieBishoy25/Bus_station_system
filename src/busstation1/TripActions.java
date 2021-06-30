/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author wadiebishoy
 */
public class TripActions implements CustomerAction , EmployeeAction {
    
    DatabaseConnector dpc = new DatabaseConnector();

    public Date SetDate(int day , int month , int year) {
        return Date.valueOf(String.format("%d-%d-%d", year,month,day));
    }

    public Time SetTime(int hour , int minute) {
        return Time.valueOf(String.format("%d:%d:00", hour,minute));
    }

    public Vehicle SetVehicle(String VehicleType) {
            
         Vehicle v = null ;
            switch (VehicleType)
            {
                case "Bus" :
                {  v = new Bus() ;
                        break;}
                case "MiniBus" :
                {  v = new MiniBus(); 
                           break;}
                case "Limousine" :
                {  v = new Limousine();
                           break;}
            }
            
            return v ;
    }

    
    
    
    @Override
    public void BuyTicket(int tripNo, int NoOfTickets) {
        
        dpc.UpdateBuyTicket(tripNo, NoOfTickets);
    }

    
    
    
    
    
    @Override
    public Boolean Login(String userName, String Password) {
        
        ArrayList<Mangers> mList;
        mList = dpc.getMangers();
        int i ;
        for (i=0 ; i< mList.size() ; i++)
        {
            if (mList.get(i).getPassword().equals(Password) && mList.get(i).getUsername().equals(userName))
                return true ;
        }
        return false ;
    }

    @Override
    public void NewTrip(String from, String To, Date Date, Time time, Vehicle vehicle, String stopType, String driverName, double price) {
        
    }

    @Override
    public void EditTripPrice(double NewPrice, int tripNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EditTripTime(Time NewTime, int tripNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteTrip(int tripNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ShowAllTrips() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ShowTrips(String from, String To, Date Date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
