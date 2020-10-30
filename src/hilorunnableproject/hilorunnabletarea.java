package hilorunnableproject;

public class hilorunnabletarea   
{
	public static void main(String args[])
	{
		HiloRun trabajoHilo= new HiloRun();
		
		Thread hiloAlfa= new Thread(trabajoHilo);
		Thread hiloBeta = new Thread(trabajoHilo);
		Thread hiloOmega= new Thread(trabajoHilo);
		Thread hiloGamma = new Thread(trabajoHilo);
		hiloAlfa.setName("Hilo Alfa");
		hiloBeta.setName("Hilo Beta");
		hiloOmega.setName("Hilo Omega");
		hiloGamma.setName("Hilo Gamma ");
		hiloAlfa.start();
		hiloBeta.start();
		hiloOmega.start();
		hiloGamma.start();
		try {
			hiloAlfa.join();
			hiloBeta.join();
			hiloOmega.join();
			hiloGamma.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Termina Hilo main");
	}
	
	
}
