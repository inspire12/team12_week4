package com.your.dream.real;

/**
 * Hello world!
 *
 */
public class App 
{
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
int total =0;
int silver_rate;
int gold_rate;
    	for(String arg : args) {
		System.out.println("전화요금 관리 시스템을 시작합니다.");
    		System.out.println("++parameter: " + arg);
		
		System.out.println("총 전화요금은 "+ total +"입니다.");
    	}
    }
}
