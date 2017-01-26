package hdfs;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/* This sample demonstrate use of HDFS Java API
*/

public class HDFSJavaAPIDemo {

	public static void main(String[] args) throws IOException {
		Configuration conf = new Configuration();
		conf.addResource(new Path(
				"/etc/hadoop/core-site.xml"));
		conf.addResource(new Path(
				"/etc/hadoop/hdfs-site.xml"));

		FileSystem fileSystem = FileSystem.get(conf);
		System.out.println(fileSystem.getUri());

		Path file = new Path("/home/training/workspace/hdfs-demo/data/Gitanjali-Tagore.txt");
		Path f = new Path("Gitanjali-Tagore.txt");
		if (fileSystem.exists(file)) {
			System.out.println("File exists.");
		} else {
			// Writing to file
			FSDataOutputStream outStream = fileSystem.create(f);
			outStream.writeUTF("Welcome to HDFS Java API!!!");
			outStream.close();
		}

		// Reading from file
		FSDataInputStream inStream = fileSystem.open(file);
		String data = inStream.readUTF();
		System.out.println(data);
		inStream.close();

		// deleting the file. Non-recursively.
		// fileSystem.delete(file, false);

		fileSystem.close();
	}
}
