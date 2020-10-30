package hilorunnableproject;

class HiloRun implements Runnable
{@Override
	public void run() {
		for(int x=0;x<10;x++) {
		String nombreHilo = Thread.currentThread().getName();
		System.out.println(nombreHilo);
	}
}
	
}
