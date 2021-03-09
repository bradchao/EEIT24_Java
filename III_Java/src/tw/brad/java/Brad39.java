package tw.brad.java;

import java.io.File;

public class Brad39 {
	public static void main(String[] args) {
		File f1 = new File("d:/brad/test2");
		System.out.println(f1.exists());
		File[] roots = File.listRoots();
		for (File f : roots) {
			System.out.println(f);
		}
		
		File dir1 = new File("./dir1");
		System.out.println(dir1.exists());
		File dir2 = new File("dir1/dir2");
		if (!dir2.exists()) {
			dir2.mkdir();
		}else {
			System.out.println("dir2 exist");
		}
		File dir345 = new File("dir1/dir2/dir3/dir4/dir5");
		boolean isOK = dir345.mkdirs();
		System.out.println(isOK);
		
		
	}
}
