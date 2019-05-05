package ingsw.pdd.State.states;

import ingsw.pdd.State.Server;

public class StopServerState extends AbstractServerState {

	public StopServerState(Server server) {
		server.getMessageProcess().stop();
	}

	@Override
	public void handleMessage(Server server, String message) {
		System.out.println("The server is stopped");
	}

}