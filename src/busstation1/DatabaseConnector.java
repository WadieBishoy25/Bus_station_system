/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.util.ArrayList;

/**
 *
 * @author wadiebishoy
 */
public class DatabaseConnector {
    
    Database dp = new Database();

    public DatabaseConnector() {
        dp.connect();
    }
    

//    public ArrayList<Ticket> getTrips ()
//    {
//        ArrayList<Ticket> t;
//        t = new ArrayList<>();
//        int i ;
//        for (i=0 ; i<dp.getNoOfTrips() ; i++)
//        {
//            t.set(i, dp.getTicket(i));  
//        }
//        
//        return t ;
//    }
        public ArrayList<Mangers> getMangers ()
    {
        ArrayList<Mangers> m;
        m = new ArrayList<>();
        int i ;
        for (i=0 ; i<2 ; i++)
        {
            m.set(i,dp.getManger(i));  
        }
        
        return m ;
    }
    public void UpdateBuyTicket (int tripNo, int NoOfTickets){
    dp.updateNoOfSeats(tripNo, (dp.getNoOfSeats(tripNo)-NoOfTickets));
}
    
    public void UpdateDatabase (ArrayList<Mangers> m)
    {
        dp.deleteAll();
        int i;
        for (i=0 ; i<m.size() ; i++ )
        {
            
        }
    }
    
}
