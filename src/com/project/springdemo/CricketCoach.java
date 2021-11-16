package com.project.springdemo;



public class CricketCoach implements Coach {
	private FortuneService fortuneService1;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {System.out.println("CricketCoach : inside the non-arg constructor");}
	//setter method here we inject our dependencies
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("this is debugger for our Fortune Service setter method");
		this.fortuneService1 = fortuneService;
	} 

	public void setEmailAddress(String emailAddress) {
		System.out.println("this is debugger for our email address setter method");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("this is debugger for our team setter method");
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
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
