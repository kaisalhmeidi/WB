package k;

public class Cell {
	
	private int indexRow;
	private int indexCol;
	private boolean alive;
	private int numLivingNeighbors;
	private boolean isAliveNextGen;
	
	public Cell(int indexRow, int indexCol, boolean alive) {
		this.indexRow = indexRow;
		this.indexCol = indexCol;
		this.alive = alive;
		
	}
	
	public Cell(int indexRow, int indexCol){
		this.indexRow = indexRow;
		this.indexCol = indexCol;
	}
	
	
	public void countLivingNeighbors(Cell[][] gridArray) {
//		erste Zeile
		if (gridArray[this.indexRow][this.indexCol].indexRow == 0) {
//			erste Spalte
			if (gridArray[this.indexRow][this.indexCol].indexCol ==0) {
				if(gridArray[this.indexRow][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				
//			letzte Spalte	
			}else if (gridArray[this.indexRow][this.indexCol].indexCol == gridArray[this.indexRow].length-1) {
				if(gridArray[this.indexRow][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
//				Mitte
			}else {
				if(gridArray[this.indexRow][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
			}
//		letzte Zeile
		}else if (gridArray[this.indexRow][this.indexCol].indexRow == gridArray.length-1) {
//			erste Spalte
			if (gridArray[this.indexRow][this.indexCol].indexCol == 0) {
				if(gridArray[this.indexRow][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
//				letzte Spalte		
			}else if (gridArray[this.indexRow][this.indexCol].indexCol == gridArray[this.indexRow].length-1) {
				if(gridArray[this.indexRow][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
//				Mitte
			}else {
				if(gridArray[this.indexRow][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
			}
//		Mitte	
		}else {
//			erste Spalte
			if (gridArray[this.indexRow][this.indexCol].indexCol == 0) {
				if(gridArray[this.indexRow][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
//				letzte Spalte	
			}else if (gridArray[this.indexRow][this.indexCol].indexCol == gridArray[this.indexRow].length-1) {
				if(gridArray[this.indexRow][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
//				Mitte
			}else {
				if(gridArray[this.indexRow][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol-1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow+1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
				if(gridArray[this.indexRow-1][this.indexCol+1].alive){
					gridArray[this.indexRow][this.indexCol].numLivingNeighbors++;
				}
			}	
		}
		gridArray[this.indexRow][this.indexCol].decideNextStatus();
	}
	
	private void decideNextStatus() {
		
		if ((this.alive && (this.numLivingNeighbors == 2 || this.numLivingNeighbors == 3))) {
			this.isAliveNextGen = true;
		}else if ((!this.alive) && this.numLivingNeighbors == 3) {
			this.isAliveNextGen = true;
		}else {
			this.isAliveNextGen = false;
		}
		
	}
	
	
	public int getIndexRow() {
		return indexRow;
	}
	public void setIndexRow(int indexRow) {
		this.indexRow = indexRow;
	}
	public int getIndexCol() {
		return indexCol;
	}
	public void setIndexCol(int indexCol) {
		this.indexCol = indexCol;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public int getNumLivingNeighbors() {
		return numLivingNeighbors;
	}
	public void setNumLivingNeighbors(int numLivingNeighbors) {
		this.numLivingNeighbors = numLivingNeighbors;
	}
	public boolean isAliveNextGen() {
		return isAliveNextGen;
	}
	public void setAliveNextGen(boolean isAliveNextGen) {
		this.isAliveNextGen = isAliveNextGen;
	}
	
	

}
