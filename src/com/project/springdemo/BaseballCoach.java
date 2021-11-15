package com.project.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	//make a constructure for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my FortuneService to get a fortune
		return fortuneService.getFortune();
 	}
}
