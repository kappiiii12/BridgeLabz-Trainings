package DownloadManagerMultiThreading;

class FileDownloader implements Runnable {
    private String fileName;
    
	public FileDownloader(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
     try {
		int i = 0;
      while(i<=100) {
    	  if(i%5 == 0)
    		  System.out.println("Downloading "+this.fileName+" ------- "+i+"% Completed");
    	  i++;
    	  Thread.sleep(1000);
      }
      System.out.println("Download Complete "+this.fileName);
	}catch( InterruptedException e){
         System.out.println("Interrupted file"+this.fileName);
	}
}
}