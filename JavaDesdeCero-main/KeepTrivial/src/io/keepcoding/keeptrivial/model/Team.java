package io.keepcoding.keeptrivial.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Team {
	private String teamName;
	private HashMap<Topic,Boolean> wedgeMap = new HashMap<>();
	
	public Team(String teamName, ArrayList<Topic> wedgeList) {
		this.teamName = teamName;

        for (Topic element : wedgeList) {
        	wedgeMap.put(element,Boolean.valueOf(false));
        }
	}

	public String getTeamName() {
		return teamName;
	}
	
	public ArrayList<Topic> getPendingTopics() {
		var list = new ArrayList<Topic>();
		
		for (Map.Entry<Topic, Boolean> entry: wedgeMap.entrySet()) {
			if (!entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		
		return list;
	}
	
	public boolean isWinner() {
		
		for (Topic topic: wedgeMap.keySet()) {
			if (!wedgeMap.get(topic)) {
				return false;
			}
		}
		
		return true;
	}
	
	public void markTopicDone(Topic topic) {
		wedgeMap.put(topic, true);
	}
	
	public String getTeamStatus() {
		String str = teamName + "\n";
		
		for (var topic: wedgeMap.keySet()) {
			str += " - " + topic.getTopicName() + ": ";
			if (wedgeMap.get(topic)) {
				str += "1";
			} else {
				str += "0";
			}
			str += "\n";
		}
		
		return str;
	}
	
	@Override
	public String toString() {
		return teamName;
	}
}
