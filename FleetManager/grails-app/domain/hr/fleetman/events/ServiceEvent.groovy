package hr.fleetman.events

import hr.fleetman.Car
import hr.fleetman.common.ServiceFacility

class ServiceEvent extends Event{

    static constraints = {
    }
	
	ServiceFacility serviceFacility
	
}
