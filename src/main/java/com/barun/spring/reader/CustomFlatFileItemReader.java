package com.barun.spring.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barun.spring.mapper.CustomLineMapper;

/**
 * {@link ItemReader} with hard-coded input data.
 * @param <T>
 */

//@Component("flatFileReader")
public class CustomFlatFileItemReader<Model> extends FlatFileItemReader<Model> {
	
	
	
	

}
