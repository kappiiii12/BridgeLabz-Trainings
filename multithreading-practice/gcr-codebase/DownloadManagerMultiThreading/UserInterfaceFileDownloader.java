package DownloadManagerMultiThreading;

public class UserInterfaceFileDownloader {
      public static void main(String args[]) {
    	  FileDownloader f1 = new FileDownloader("document.pdf");
    	  FileDownloader f2 = new FileDownloader("image.jpg");
    	  FileDownloader f3 = new FileDownloader("vedio.mp4");
    	  
    	  Thread t1 = new Thread(f1);
    	  Thread t2 = new Thread(f2);
    	  Thread t3 = new Thread(f3);
    	  
    	  t1.start();
    	  t2.start();
    	  t3.start();
      }
}



