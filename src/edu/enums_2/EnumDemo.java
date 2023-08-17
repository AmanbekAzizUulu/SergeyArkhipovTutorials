package edu.enums_2;

import java.util.Arrays;

public class EnumDemo {
    public static void main(String[] args) {
	NotificationOptions options = new NotificationOptions();
	
	Channels.EMAIL.setChannelEnabled(options, true);
	Channels.SMS.setChannelEnabled(options, true);
	Channels.PUSH.setChannelEnabled(options, true);

	System.out.println(Arrays.toString(Channels.values()));
    }

    private static class NotificationOptions {
	boolean isPushEnabled;
	boolean isEmailEnabled;
	boolean isSmsEnabled;
    }

    private enum Channels {
	PUSH {

	    @Override
	    boolean isChannelEnabled(NotificationOptions options) {
		return options.isPushEnabled;
	    }

	    @Override
	    void setChannelEnabled(NotificationOptions options, boolean isEnabled) {
		options.isPushEnabled = isEnabled;
	    }

	},

	EMAIL {

	    @Override
	    boolean isChannelEnabled(NotificationOptions options) {
		return options.isEmailEnabled;
	    }

	    @Override
	    void setChannelEnabled(NotificationOptions options, boolean isEnabled) {
		options.isEmailEnabled = isEnabled;
	    }

	},

	SMS {
	    @Override
	    boolean isChannelEnabled(NotificationOptions options) {
		return options.isSmsEnabled;
	    }

	    @Override
	    void setChannelEnabled(NotificationOptions options, boolean isEnabled) {
		options.isSmsEnabled = isEnabled;
	    }
	};

	abstract boolean isChannelEnabled(NotificationOptions options);
	abstract void setChannelEnabled(NotificationOptions options, boolean isEnabled);
    }
}
