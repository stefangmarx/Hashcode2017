package model;

import java.util.ArrayList;
import java.util.List;

public class RequestItem {
	private int idVideo, amountVideos, videoSize, idEndpoint, datacenterLatency;
	private List<Integer> idCacheList;
	
	public RequestItem(int idVideo, int amountVideos, int videoSize, int idEndpoint, int datacenterLatency, List<Connection> connectionList) {
		this.idVideo = idVideo;
		this.amountVideos = amountVideos;
		this.videoSize = videoSize;
		this.idEndpoint = idEndpoint;
		this.datacenterLatency = datacenterLatency;
		
		// Create list.
		this.idCacheList = new ArrayList<Integer>();
		
		// Add elements to list (it is already sorted).
		for (Connection connection : connectionList) {
			if (connection.getIdEndpoint() == idEndpoint) {
				this.idCacheList.add(connection.getIdCache());
			}
		}
	}

	public int getIdVideo() {
		return idVideo;
	}

	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}

	public int getAmountVideos() {
		return amountVideos;
	}

	public void setAmountVideos(int amountVideos) {
		this.amountVideos = amountVideos;
	}

	public int getVideoSize() {
		return videoSize;
	}

	public void setVideoSize(int videoSize) {
		this.videoSize = videoSize;
	}

	public int getIdEndpoint() {
		return idEndpoint;
	}

	public void setIdEndpoint(int idEndpoint) {
		this.idEndpoint = idEndpoint;
	}

	public int getDatacenterLatency() {
		return datacenterLatency;
	}

	public void setDatacenterLatency(int datacenterLatency) {
		this.datacenterLatency = datacenterLatency;
	}

	public List<Integer> getCacheList() {
		return idCacheList;
	}
}
