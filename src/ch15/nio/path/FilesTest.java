package ch15.nio.path;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

public class FilesTest {
	public static void main(String[] args) throws IOException {
		FilesTest ft = new FilesTest();
		ft.copyTest();
		ft.dirInfo();
		ft.readTextFile();
		ft.deleteTest();
	}
	
	public void copyTest() throws IOException {
		Path src = Paths.get("c:/windows/explorer.exe");
		Path target = Paths.get("c:/Temp/files_copy_explorer.exe");
		if (Files.isReadable(src)) {
			Files.copy(src, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("복사 완료!!");
		}
	}
	
	public void dirInfo() throws IOException {
		Path target = Paths.get(".");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(target);
		for(Path path: directoryStream) {
			Date time = new Date( Files.getLastModifiedTime(path).toMillis());
			String name = path.getFileName().toString();
			long length = Files.size(path);
			if (Files.isDirectory(path)) {
				name = "[" + name + "]";
			}
			System.out.printf("%-20s\t%tF %<tT\t%s%n", name, time, length);
		}
	}
	
	public void readTextFile() throws IOException{
		Path target = Paths.get("./pom.xml");
		BufferedReader reader = Files.newBufferedReader(target);
		String line = null;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		
		List<String> lines = Files.readAllLines(target);
		for(String line2: lines) {
			System.out.println(line2);
		}
	}
	
	public void deleteTest() throws IOException{
		Path target = Paths.get("c:/Temp/files_copy_explorer.exe");
		boolean result = Files.deleteIfExists(target);
		String resultStr = result?"삭제 성공":"삭제 실패";
		System.out.println(resultStr);
	}
}