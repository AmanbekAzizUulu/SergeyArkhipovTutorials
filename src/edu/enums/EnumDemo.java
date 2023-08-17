package edu.enums;

import edu.enums.Subscription.State;

public class EnumDemo {
    public static void main(String[] args) {
	Subscription subscription = new Subscription();
	Subscription subscription1 = new Subscription();
	Subscription subscription2 = new Subscription();

	subscription.setState(State.ACTIVE);
	subscription1.setState(State.SUSPEND);
	subscription2.setState(State.NONE);

	System.out.println(subscription.getState());

	System.out.println(Subscription.State.valueOf("NONE"));
	System.out.println(Subscription.State.valueOf("SUSPEND"));
	System.out.println(Subscription.State.valueOf("ACTIVE"));

	System.out.println(Subscription.State.ACTIVE.toString());
	System.out.println(Subscription.State.NONE.toString());
	System.out.println(Subscription.State.SUSPEND.toString());

	System.out.println(Subscription.State.ACTIVE.ordinal());
	System.out.println(Subscription.State.NONE.ordinal());
	System.out.println(Subscription.State.SUSPEND.ordinal());

	System.out.println(Subscription.State.values()[0]);
	System.out.println(Subscription.State.values()[1]);
	System.out.println(Subscription.State.values()[2]);

	switch (subscription.getState()) {
	case NONE:
	    System.out.println("NONE");
	    break;
	case ACTIVE:
	    System.out.println("ACTIVE");
	    break;
	case SUSPEND:
	    System.out.println("SUSPEND");
	    break;
	default:
	    break;
	}
    }

}
