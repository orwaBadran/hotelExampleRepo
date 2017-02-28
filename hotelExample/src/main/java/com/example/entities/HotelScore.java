package com.example.entities;

public class HotelScore {
	
	private double rawAppealScore;

	private double movingAverageScore;

	public double getRawAppealScore() {
		return this.rawAppealScore;
	}

	public void setRawAppealScore(double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	public double getMovingAverageScore() {
		return this.movingAverageScore;
	}

	public void setMovingAverageScore(double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	@Override
	public String toString() {
		return "HotelScores [rawAppealScore=" + rawAppealScore + ", movingAverageScore=" + movingAverageScore + "]";
	}
}