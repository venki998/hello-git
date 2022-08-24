package org.com;

public class Desktop implements Hardware,Software {
	
	private void desktopModel() {
		System.out.println("Samsung");

	}

	@Override
	public void softwareResources() {
		System.out.println("Software = Operating System");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware = monitor, mouse");
		
		
		}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	}

}
