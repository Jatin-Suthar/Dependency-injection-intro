package com.project.springdemo;

public class TrackCoach implements Coach {
	FortuneService theFortuneService;
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) {
		theFortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5 kilometer";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It! "+theFortuneService.getFortune();
	}
	
	//add an init method:
	public void doMyStartupStuff() {
		System.out.println("Track Coach: Do my startupStuff");
	}
	//add an destroy method:
	public void doMyCleanupStuff() {
		System.out.println("Tack Coach: Do my cleanupStuff");
	}
}
