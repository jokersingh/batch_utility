/**
 * 
 */
package com.barun.spring.mapper;

import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;

import com.barun.spring.model.Model;

/**
 * @author bibhu
 *
 */
public class CustomLineMapper<T> extends DefaultLineMapper<T> {
	@Autowired	
	public LineTokenizer lineTokenizer;
	@Autowired
	public FieldSetMapper<Model> fieldSetMapper;

		@SuppressWarnings("unchecked")
		@Override
		public T mapLine(String line, int lineNumber) throws Exception {
		    System.out.println("======" + line);

		    DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		    char delimiter = 0;
		    if (line.indexOf("|") == -1) {
		        if (line.indexOf(",") == -1) {
		        } else {
		        	delimiter = ',';
		        }
		    } else {
		    	delimiter = '|';
		    }
		    delimitedLineTokenizer.setDelimiter(delimiter);
		    String type = line.substring(0,line.indexOf(delimiter)); 
		    line = line.substring(line.indexOf(delimiter)+1);
		    delimitedLineTokenizer.setNames(new String[]{"firstName","lastName"});
		    setLineTokenizer(delimitedLineTokenizer);
		    return (T) this.fieldSetMapper.mapFieldSet(this.lineTokenizer.tokenize(line));
		}

		public LineTokenizer getLineTokenizer() {
		    return lineTokenizer;
		}
		@Override
		public void setLineTokenizer(LineTokenizer lineTokenizer) {
			super.setLineTokenizer(lineTokenizer);
		    this.lineTokenizer = lineTokenizer;
		}

		public FieldSetMapper<Model> getFieldSetMapper() {
		    return fieldSetMapper;
		}

		@Override
		public void setFieldSetMapper(FieldSetMapper<T> fieldSetMapper) {
		    super.setFieldSetMapper(fieldSetMapper);
		}
}
