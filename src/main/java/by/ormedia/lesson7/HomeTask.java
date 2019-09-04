package by.ormedia.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeTask {
	
	private static char TARGET = '%';
	private static char EMPTY = 'O';
	private static char STEP = 'X';
	
	private static char[][] FIELD;
	
	static{
		Map<Integer,String>map = new HashMap<>();
		map.put(0,"OOOOOOOO");
		map.put(1,"O%OOOOOO");
		map.put(2,"O#####OO");
		map.put(3,"O#OOO#OO");
		map.put(4,"OOOOOOOO");
		map.put(5,"OOOOOOOO");
		map.put(6,"OOOOOOOO");
		map.put(7,"OOOOOOOO");
		FIELD = new char[8][];
		for(int i=0;i<FIELD.length;i++)FIELD[i]=map.get(i).toCharArray();
	}
	
	
	public static void main(String...args){
		show(FIELD);
		System.out.println();
		int row = 7;
		int column = 3;
		int steps = 0;
		List<Cell>cells = Arrays.asList(new Cell(row,column));
		boolean spread = true;
		while(spread){
			steps++;
			for(Cell cell:cells){
				if(isTargetSomewhereNearby(FIELD,cell)){
					spread = false;
					break;
				}
			}
			if(spread){
				cells = step(FIELD,cells);
			}
		}
		System.out.println("STEPS: "+steps);
	}
	
	
	private static void show(char[][] chars){
		for(char[] ch:chars){
			for(char c:ch)System.out.print(c+" ");
			System.out.println();
		}
	}
	
	public static boolean isTarget(char[][]field,int row,int column){
		if(row<0||row>=field.length)return false;
		if(column<0||column>=field[row].length)return false;
		return field[row][column]==TARGET;
	}

	public static boolean isTargetSomewhereNearby(char[][]field, Cell cell){
		int row = cell.getRow();
		int column = cell.getColumn();
		if(isTarget(field,row-1,column-1))return true;
		if(isTarget(field,row-1,column))return true;
		if(isTarget(field,row-1,column+1))return true;
		if(isTarget(field,row,column-1))return true;
		if(isTarget(field,row,column+1))return true;
		if(isTarget(field,row+1,column-1))return true;
		if(isTarget(field,row+1,column))return true;
		if(isTarget(field,row+1,column+1))return true;
		return false;
	}
	
	public static List<Cell> step(char[][]field,Cell cell){
		if(field[cell.getRow()][cell.getColumn()]==EMPTY)field[cell.getRow()][cell.getColumn()]=STEP;
		return Arrays.asList(cell);
	}
	
	public static List<Cell> step(char[][]field,List<Cell>cellsFrom){
		for(Cell cell:cellsFrom){
			if(field[cell.getRow()][cell.getColumn()]==EMPTY)field[cell.getRow()][cell.getColumn()]=STEP;
		}
		Set<Cell>cells = new HashSet<>();
		for(Cell cell:cellsFrom){
			addIfExistAndEmpty(FIELD,cells,cell.getRow()-1,cell.getColumn()-1);
			addIfExistAndEmpty(FIELD,cells,cell.getRow()-1,cell.getColumn());
			addIfExistAndEmpty(FIELD,cells,cell.getRow()-1,cell.getColumn()+1);
			addIfExistAndEmpty(FIELD,cells,cell.getRow(),cell.getColumn()-1);
			addIfExistAndEmpty(FIELD,cells,cell.getRow(),cell.getColumn()+1);
			addIfExistAndEmpty(FIELD,cells,cell.getRow()+1,cell.getColumn()-1);
			addIfExistAndEmpty(FIELD,cells,cell.getRow()+1,cell.getColumn());
			addIfExistAndEmpty(FIELD,cells,cell.getRow()+1,cell.getColumn()+1);
		}
		return new ArrayList<>(cells);
	
	}
	
	public static void addIfExistAndEmpty(char[][]field, Set set, int row, int column){
		if(row<0||row>=field.length||column<0||column>=field[row].length)return;
		if(field[row][column]==EMPTY)set.add(new Cell(row,column));
	}
	
	private static class Cell{
		private int row;
		private int column;
		public Cell(int row,int column){
			this.row = row;
			this.column = column;
		}
		public int getRow() {
			return row;
		}
		public void setRow(int row) {
			this.row = row;
		}
		public int getColumn() {
			return column;
		}
		public void setColumn(int column) {
			this.column = column;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + column;
			result = prime * result + row;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cell other = (Cell) obj;
			if (column != other.column)
				return false;
			if (row != other.row)
				return false;
			return true;
		}
		
		
	}
}
