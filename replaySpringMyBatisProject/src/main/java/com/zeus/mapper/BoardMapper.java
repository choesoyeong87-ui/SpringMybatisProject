package com.zeus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zeus.domain.Board;
@Mapper
public interface BoardMapper {
	public int create(Board board) throws Exception; 
	public Board read(Board b) throws Exception; 
	public int update(Board board) throws Exception; 
	public int delete(Board board) throws Exception; 
	public List<Board> list() throws Exception;
	public List<Board> search(Board board) throws Exception;
}
