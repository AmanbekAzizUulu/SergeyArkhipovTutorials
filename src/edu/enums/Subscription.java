package edu.enums;

public class Subscription {
    
    private String name;
    private String description;
    private State state;
    
    
    enum State {
	ACTIVE, NONE, SUSPEND;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public State getState() {
	return state;
    }
    public void setState(State state) {
	this.state = state;
    }
    
    
}
