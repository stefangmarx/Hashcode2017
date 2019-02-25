package model;

public class Connection {
	private int idCache, idEndpoint, latency;

	public Connection(int idEnpoint, int latency) {
		this.idEndpoint = idEnpoint;
		this.latency = latency;
	}

	public int getIdEndpoint() {
		return idEndpoint;
	}

	public void setIdEndpoint(int idEndpoint) {
		this.idEndpoint = idEndpoint;
	}

	public int getLatency() {
		return latency;
	}

	public void setLatency(int latency) {
		this.latency = latency;
	}
	
	public int getIdCache() {
		return idCache;
	}

	public void setIdCache(int idCache) {
		this.idCache = idCache;
	}
	
	
}
