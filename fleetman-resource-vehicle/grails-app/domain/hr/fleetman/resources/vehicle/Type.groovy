package hr.fleetman.resources.vehicle

class Type implements Serializable{

    static constraints = {
		name nullable:false, size: 3..50
    }
	
	String name
}
