package sarow.lab.java.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * @author wenpingliu
 *
 */
public class Observer {
	public static void main(String[] args) {
		OnlineMonitorServer server = new OnlineMonitorServer();
		GuestServer guestclient = new GuestServer();
		server.registeServer(guestclient);
		server.notifyResgister();
		server.notifyResgister();
		server.notifyResgister();
		server.notifyResgister();
		server.removeFromServer(guestclient);
		server.notifyResgister();
		server.notifyResgister();
		server.notifyResgister();
		server.notifyResgister();
		System.out.println("register again");
		server.registeServer(guestclient);
		server.notifyResgister();
		server.notifyResgister();
		server.notifyResgister();
		server.notifyResgister();
	}
}

/**
 * 主题，支持推，拉模式
 * @author wenpingliu
 *
 */
interface Observerble{
	public boolean registeServer(ObserverObject client);
	public boolean removeFromServer(ObserverObject client);
	public boolean notifyResgister();
	public boolean isChange();
}

/**
 * 观察obj
 * @author wenpingliu
 *
 */
interface ObserverObject{
	public boolean receiveNotify(Observerble server,Object data);
}

class OnlineMonitorServer implements Observerble{

	List<ObserverObject> clients = new ArrayList<ObserverObject>();
	
	boolean isChange = false;
	
	@Override
	public boolean registeServer(ObserverObject clientServer) {
		return clients.add(clientServer);
	}

	@Override
	public boolean removeFromServer(ObserverObject clientServer) {
		return clients.remove(clientServer);
	}

	@Override
	public boolean notifyResgister() {
		isChange = true;
		for(ObserverObject client : clients){
			client.receiveNotify(this,"change");
		}
		isChange = false;
		return true;
	}

	@Override
	public boolean isChange() {
		return false;
	}
}

class GuestServer implements ObserverObject{

	@Override
	public boolean receiveNotify(Observerble server, Object data) {
		System.out.println(data);
		return true;
	}
	
}