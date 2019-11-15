import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class Mymap extends Mapper<LongWritable, Text, Text,Text>{
@Override
protected void map(LongWritable key, Text value,
		org.apache.hadoop.mapreduce.Mapper.Context context)
		throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	String rec = value.toString();
	String a = rec.split(",")[2];
	String b = rec.split(",")[4];
	context.write(new Text(a+" "+b), new Text(a+" "+b));
			
}
}
