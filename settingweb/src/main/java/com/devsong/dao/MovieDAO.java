package com.devsong.dao;

import java.util.List;

import com.devsong.vo.MovieVO;


public interface MovieDAO {
	public List<MovieVO> selectMovie() throws Exception;
}
