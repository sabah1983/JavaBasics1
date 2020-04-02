package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam extends Employee {
	
	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		WaterfallTeam.company="Syntax";
		wteam.empNumber=123;//protected variables are visible to the child class in different package
		//wteam.salary default is not visible only in the same package
	}

	}
	


