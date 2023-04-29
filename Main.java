import java.io.*;
import java.util.Scanner;

public class Main{
	 public static void main(String[] args)throws Exception {
			
			File dosya = new File("arazi.txt");
			int satir=0;
			int sütun=0 ;
			int j;
			int sayac=0;
			try {
				BufferedReader br = new BufferedReader(new FileReader(dosya));
				String line;
				
				while ((line = br.readLine()) != null) {
					satir++;
					
					
					int sütunUzunlugu = line.length();
					if (sütunUzunlugu > sütun) {
						sütun = sütunUzunlugu;
					}
				}
				br.close();   
			} 
			catch (IOException e) {
				System.out.println("Dosya Okunamadı!" + e.getMessage());
			}
	
			BufferedReader br1 = new BufferedReader(new FileReader(dosya));
			String line;
			String[] dosya1=new String[satir];
			int i=0;
			while ((line = br1.readLine()) != null) {
			if(line.contains("\t")){
				line=line.replaceAll("\t", "        ");
			}
			dosya1[i]=line;
			i++;
			}
  	         for( j=0;j<satir;j++){
  	            for(i=0;i<
				dosya1[j].length();i++) {
  	               if( dosya1[j].length()>=i&&dosya1[j].charAt(i)==('|')) {
					if( i+5<=sütun &&dosya1[j].length()>i+5&&dosya1[j].charAt(i+5)==('_')){
  	            	 if(i+1<=sütun&& j+1<=satir&&dosya1[j+1].length()>i+1&&  dosya1[j+1].charAt(i+1)==('#')){
  	            		 if(i+2<=sütun&&j+1<=satir&&dosya1[j+1].length()>i&&  dosya1[j+1].charAt(i+2)==('#')) {
  	            			 if(i+3<=sütun&&j+1<=satir&&dosya1[j+1].length()>i&&  dosya1[j+1].charAt(i+3)==('#')) {
  	            				 if(i+4<=sütun&& j+1<=satir&&dosya1[j+1].length()>i&& dosya1[j+1].charAt(i+4)==('O') ){
  	            						 if(j+2<=satir&&dosya1[j+2].length()>i&&  dosya1[j+2].charAt(i)==('|')) {
  	            							 sayac++;
  	            	  	         }
  	          	               }
  	      	               }
  	  	               } 
					}
    	        }
  	        }     
  	    }            
  	}
  	        System.out.println("Bocek Sayisi=" +sayac);  }
}