package LAB9.Q2;

public class Cashier {

    private static final String str = System.getProperty( "line.separator" );

    // Instance variables
    private Queue<Client> queue;
    private Client currentClient;

    private int ClientTime;
    private int ClientsServed;
    private int ItemsDone;
   
    //Constructor
    public Cashier(){
        queue = new ArrayQueue<Client>();
        currentClient = null;
        ClientTime = 0;
        ClientsServed = 0;
        ItemsDone = 0;
    }
   
    // Instance methods
    public void add( Client client ) {
        queue.enqueue( client );
    }

    public int getQueueSize() {
        return queue.size();
    }

    public void servedClients( int currentTime ){

        if ( currentClient == null && queue.isEmpty() ) {
            return;
        }

        if ( currentClient == null && !queue.isEmpty() ) {
            currentClient = queue.dequeue();
            ClientTime += (currentTime - currentClient.getArriveTime());
        }

        if ( currentClient != null ) {
            currentClient.serve();
        }


        if ( currentClient != null && currentClient.getItems() == 0 ) {
            ItemsDone += currentClient.getItemsDone();
            ClientsServed++;
            currentClient = null;
        }

    }

    public int getClientTime() {      
        return ClientTime;      
    }    

    public int getItemsDone() {      
        return ItemsDone;
    }    

    public int getClientsServed() {
        return ClientsServed;    
    }

   
    public String toString() {

        StringBuffer out= new StringBuffer();

        out.append( "The total number of clients served is " );
        out.append( ClientsServed );
        out.append( str );

        out.append( "The average number of items per client was " );
        out.append( ItemsDone / ClientsServed );
        out.append( str );

        out.append( "The average time (in seconds) was " );
        out.append( ClientTime / ClientsServed );
        out.append( str );

        return out.toString();
    }

}
