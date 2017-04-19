package com.arpith.goal;

public class GoalScanner {

	public int goalDiff(int goalFor, int goalAgainst) {
		int diff = goalFor - goalAgainst;
		if(diff <0) return diff * -1;
		else return (goalFor - goalAgainst);
	}

	public int getMin(int StoredNo, int NewNo){

		return (StoredNo < NewNo)? Math.abs(StoredNo):Math.abs(NewNo);
	}

	public int soccerTable(int[] forGoal, int[] againstGaol){
		int storedNo = -1;
		int newNo = -1;
		for(int i =0;i< forGoal.length;i++){
			newNo = goalDiff(forGoal[i],againstGaol[i]);
			storedNo = getMin(storedNo,newNo);
		}
		return storedNo;
	}

	public boolean checklength(int[] forGoal, int[] againtsgoal){
		if(forGoal.length == againtsgoal.length) return true;
		else return false;
	}

}
