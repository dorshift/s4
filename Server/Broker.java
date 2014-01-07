




public class Broker implements QueueListener {

   private StompClient stompClient;
   //...

   public Broker(...) {
      //...
      this.stompClient = new StompClient();
      this.stompClient.subscribe(this);
      //...
   }

   public void processIncomingMessage(String queueName, String message) {
      // do something with the message
   }

   public void doBrokerStuff(...) {
     // ... 
   }

   public void otherFunctions(...) {
     // ... 
   }



}
