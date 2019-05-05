package ingsw.pdd.State.states;

import ingsw.pdd.State.Server;

public abstract class AbstractServerState {

	public AbstractServerState() {
	}

	public abstract void handleMessage(Server server, String message);

}