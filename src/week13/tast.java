package week13;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;

public class tast {

	public static void main(String[] args) {
		clock[] a=new clock[3];
		a[0] =new clock(5,"t");
		a[1] =new clock(10,"t");
		a[2] =new clock(8,"m");
		System.out.print(Arrays.toString(a));
		
		
		
		Object h=new Object();
		Date n=new Date();
		String mm="heloo omer";
		JOptionPane aa=new JOptionPane();
		System.out.print(aa.getMessage());
		aa.getMessage();
		//aa.showMessageDiaog(null, mm);
		//aa.showInputDialog(null, mm);
		
		clock[] m=new clock[5];
		double[] num= {5,4,6,3};
		for(int i=0;i<m.length;i++) {
		
		}
		long j=System.currentTimeMillis();
		StringBuffer k=new StringBuffer(mm);
		for(int i=0;i<k.length();i++) {
			if(((char)k.charAt(i)>='0')&&((char)k.charAt(i)<='9')) {
				k.deleteCharAt(i);
			}
		}
		
		
		
		
		
	}

}
