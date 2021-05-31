package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 8001.0);
		controller.createBossEmployee("Paca Boss", "Direccion molona", "666666666", 8000.0);
		controller.createManagerEmployee("Pedro Manager", "Direccion molona 2", "665226666", 3001.0);
		controller.createManagerEmployee("Natalia Manager", "Direccion molona 2", "665226666", 5000.0);
		controller.createJuniorEmployee("Pedro Junior", "Direccion molona 2", "665266666", 1600.0);
		controller.createJuniorEmployee("Luisa Junior", "Direccion molona 2", "665266666", 901.0);
		controller.createMidEmployee("Laura Mid", "Direccion molona 3", "625266666", 1800.0);
		controller.createMidEmployee("Diego Mid", "Direccion molona 3", "625266666", 2500.0);
		controller.createSeniorEmployee("Delia Senior", "Direccion aun mas molona" , "636636636", 2700.0);
		controller.createSeniorEmployee("Juan Senior", "Direccion aun mas molona" , "636636636", 4000.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666", "Es voluntario, no cobra");
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}
