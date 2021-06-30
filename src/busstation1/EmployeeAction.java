/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author wadiebishoy
 */
public interface EmployeeAction {
    
          Boolean Login (String userName , String Password);   

           void NewTrip ( String from , String To , Date Date , Time time , Vehicle vehicle ,String stopType,String driverName,double price);
           void EditTripPrice (double NewPrice , int tripNo );
           void EditTripTime (Time NewTime , int tripNo );
           void DeleteTrip ( int tripNo );

           void ShowAllTrips ();
           void ShowTrips ( String from , String To , Date Date );
            
            
}
