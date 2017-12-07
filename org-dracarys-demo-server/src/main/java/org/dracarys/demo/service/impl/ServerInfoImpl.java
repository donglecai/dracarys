package org.dracarys.demo.service.impl;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.dracarys.demo.api.IServerInfo;

public class ServerInfoImpl implements IServerInfo {
	private AtomicInteger count = new AtomicInteger(0);
	public String getServerInfo() {
		return System.getProperty("os.name") + ", " + new Date() + ", invokeCount=" + count.incrementAndGet();
	}

	public String getServerInfo(String prop) {
		return System.getProperty(prop) + ", invokeCount=" + count.incrementAndGet();
	}
}