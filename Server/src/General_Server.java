import Client.Client;


public class General_Server {

	
	public boolean connect(Client client)
	{
		return true;
	}
	public boolean send(Client sender,Client reciever)
	{
		return true;
	}
	public boolean subscribe(Client follower,Client followed)
	{
		return true;
	}
	public boolean unsubscribe(Client follower,Client followed){
		return true;
	}
	public boolean disconnect(Client client)
	{
		return true;
	}
}
