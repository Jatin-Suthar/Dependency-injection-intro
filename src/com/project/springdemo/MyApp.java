package com.project.springdemo;

public class MyApp {
	public static void main(String[] args) {
		Coach baseballCoach = new TrackCoach();
		System.out.println(baseballCoach.getDailyWorkout());
	}
}
