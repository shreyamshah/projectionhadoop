import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;


public class MyReduce extends Reducer<Text, Text, Text, Text>{

@Override
protected void reduce(Text arg0, Iterable<Text> arg1,
		Reducer<Text, Text, Text, Text>.Context arg2)
		throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	for(Text i:arg1)
	arg2.write(new Text(""), i);
}
}
