package k;

public class mainkais {

	public static void main(String[] args) {
		Cell cell04 = new Cell(0, 4, true);

		Cell cell11 = new Cell(1, 1, true);

		Cell cell22 = new Cell(2, 2, true);
		Cell cell23 = new Cell(2, 3, true);

		Cell cell31 = new Cell(3, 1, true);
		Cell cell32 = new Cell(3, 2, true);

		
		Cell[] cells = {cell04,cell11,cell22,cell23,cell31,cell32};
		Grid newGrid = new Grid(cells,4,5);
		newGrid.computeGeneration(1);
		Cell[][] finalCells = newGrid.getGridArray();
		for (int i = 0; i < finalCells.length; i++) {
			System.out.println("");
			System.out.println("row"+ i);
			System.out.println("");
			for (int j = 0; j < finalCells[i].length; j++) {
				System.out.println(finalCells[i][j].isAlive() + "   "+finalCells[i][j].getIndexRow()+ "   "+ finalCells[i][j].getIndexCol());
			}
		}

	}

}
