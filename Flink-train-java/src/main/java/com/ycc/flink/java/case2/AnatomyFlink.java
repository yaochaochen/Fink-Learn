package com.ycc.flink.java.case2;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class AnatomyFlink {
    //step1: Obtain an execution environment
    final  StreamExecutionEnvironment environment = StreamExecutionEnvironment.getExecutionEnvironment();
    /**
     * is the basis for these static static methods StreamExecutionEnvironment
     * createLocalEnvironment()
     * createRemoteEnvironment(String host, int port, String... jarFiles)
     */
    //step2: load/create the initial data
    DataStream<String> text = environment.readTextFile("file://path/to/file");
    //step3: transformations on this data
    DataStream<Integer> pasred = text.map(new MapFunction<String, Integer>() {
        @Override
        public Integer map(String s) throws Exception {
            return Integer.parseInt(s);
        }
    });


}
