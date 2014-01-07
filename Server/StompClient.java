


public class StompClient {

   private List<QueueListener> listeners;

   public subscribe(QueueListener listener) {
      this.listeners.add(listener);
   }

   protected somewhereInTheClientCode() {
      //...
      Message message = readMessage(...);
      for (QueueListener listener : listeners) {
         listener.processIncomingMessage(message.getQueue(), message.getText());
      }
      //...

   }

   public sendMessage(String queue, String text) {
      String messageId = "12345"
      String = "MESSAGE:\ndestination:" + queue + "\nmessage-id:" + messageId +"\n\n" +
               text + "\n\2";

      this.streamWriter.write(String); // write to the tcp socket

   }


}

