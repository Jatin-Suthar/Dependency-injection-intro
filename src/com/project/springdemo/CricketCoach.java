package com.project.springdemo;



public class CricketCoach implements Coach {
	private FortuneService fortuneService1;
	
	public CricketCoach() {System.out.println("CricketCoach : inside the non-arg constructor");}
	//setter method here we inject our dependencies
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach inside setter method - setFortuneService");
		this.fortuneService1 = fortuneService;
	} 

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Toss goes in our favour " + fortuneService1.getFortune();
	}
}
