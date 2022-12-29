package k;

public class Grid {
	
	private	Cell[][] gridArray;
	
	public Grid(Cell[] cells, int gridRows, int gridCols) {
		
//		gridArray modifizieren 
		this.gridArray = new Cell[gridRows][gridCols]; 
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[i].length; j++) {
					gridArray[i][j] = new Cell(i, j,false);   
			}
		}
		
//		Die Zellen als lebendig markieren
		for (int i = 0; i < cells.length; i++) {
			if (cells[i].getIndexRow()<=gridArray.length-1 && cells[i].getIndexCol()<=gridArray[0].length-1) {
				gridArray[cells[i].getIndexRow()][cells[i].getIndexCol()].setAlive(true);		
			}
		}
//      Die Anzahl der lebendigen Nachbarn jeder Zelle berechenen
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[i].length; j++) {
				gridArray[i][j].countLivingNeighbors(gridArray); 
			}
		}
			
	}
	
	public void computeNextGen() {
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[i].length; j++) {
				gridArray[i][j].setNumLivingNeighbors(0);
				gridArray[i][j].countLivingNeighbors(gridArray); 
			}
		}
		
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[i].length; j++) {
				gridArray[i][j].setAlive(gridArray[i][j].isAliveNextGen());
			}
		}
	}
	
	
	public void computeGeneration(int n) {
		while (n>=1) {
			computeNextGen();
			n--;
		}
	}
	
	

	public Cell[][] getGridArray() {
		return gridArray;
	}

	public void setGridArray(Cell[][] gridArray) {
		this.gridArray = gridArray;
	}  
	
	
	
	

}
