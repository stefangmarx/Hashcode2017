package model;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private int id, size;
	private List<Integer> videoList;
	
	public Cache(int id, int size, List<Connection> connectionList) {
		this.id = id;
		this.size = size;
		this.videoList = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Integer> getVideoList() {
		return videoList;
	}
}
