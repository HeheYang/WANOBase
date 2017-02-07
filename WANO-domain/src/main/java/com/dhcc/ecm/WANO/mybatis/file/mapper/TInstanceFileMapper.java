package com.dhcc.ecm.WANO.mybatis.file.mapper;

import com.dhcc.ecm.WANO.mybatis.file.model.TInstanceFile;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

public interface TInstanceFileMapper extends MyMapper<TInstanceFile,TInstanceFile> {

	List<TInstanceFile> fileListForClass(TInstanceFile tf);
	
	public List<TInstanceFile> findTInstanceFilePage(TInstanceFile tInstanceFile);
}