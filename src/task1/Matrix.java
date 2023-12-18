package task1;

public class Matrix {

    long[][] array;
    int rows;
    int columns;

    public void addMatrix(Matrix matrix) {
        if(this.rows != matrix.getRows() || this.columns != matrix.getColumns()) {
            System.out.println("You can not add this array");
            return;
        }

        long[][] matrixArray = matrix.getArray();
        for(int i = 0; i< matrix.rows; i++) {
            for(int j = 0; j < matrix.columns; j++) {
                array[i][j] += matrixArray[i][j];
            }
        }
    }

    public void multiplyByNumber(int number) {
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                array[i][j] *= number;
            }
        }
    }

    public void multiplyByMatrix(Matrix matrix) {
        if(this.columns != matrix.getRows()) {
            System.out.println("You can not multiply this matrix");
        }
        Matrix newMatrix = new Matrix();
        newMatrix.setRows(this.rows);
        newMatrix.setColumns(matrix.getColumns());
        newMatrix.setArray(new long[newMatrix.getRows()][newMatrix.getColumns()]);
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < matrix.getColumns(); j++) {
                for(int k = 0; k < matrix.getRows(); k++) {
                    newMatrix.getArray()[i][j] = this.array[i][k] * matrix.array[k][j];
                }
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i< this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }



    public long[][] getArray() {
        return array;
    }

    public void setArray(long[][] array) {
        this.array = array;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
