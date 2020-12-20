package com.devsong.service;

import java.util.List;

import com.devsong.vo.MovieVO;

public interface MovieService {

	public List<MovieVO> selectMovie() throws Exception;
}
