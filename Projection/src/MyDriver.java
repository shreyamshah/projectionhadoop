import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class MyDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();
		Job jb = Job.getInstance(conf);
		jb.setJarByClass(MyDriver.class);
		jb.setJobName("Cust wise Projection Program");
		jb.setOutputKeyClass(Text.class);
		jb.setOutputValueClass(Text.class);
		jb.setMapperClass(Mymap.class);
		jb.setReducerClass(MyReduce.class);
		FileInputFormat.addInputPath(jb,new Path(args[0]));
		FileOutputFormat.setOutputPath(jb, new Path(args[1]));
		jb.waitForCompletion(true);
	}
}
