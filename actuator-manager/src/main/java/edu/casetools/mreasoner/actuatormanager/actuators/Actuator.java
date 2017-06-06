package edu.casetools.mreasoner.actuatormanager.actuators;

import edu.casetools.mreasoner.actuatormanager.Action;
import edu.casetools.mreasoner.actuatormanager.actuators.lamp.LampConfigs;

public interface Actuator {
	
	public void performAction(Action action);
	public LampConfigs getConfigs();
}
