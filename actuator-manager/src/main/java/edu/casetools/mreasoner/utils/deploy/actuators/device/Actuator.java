package edu.casetools.mreasoner.utils.deploy.actuators.device;

import edu.casetools.mreasoner.utils.deploy.actuators.data.Action;
import edu.casetools.mreasoner.utils.deploy.actuators.data.ActuatorConfigs;

public interface Actuator {
	
	public void performAction(Action action);
	public ActuatorConfigs getConfigs();
}
