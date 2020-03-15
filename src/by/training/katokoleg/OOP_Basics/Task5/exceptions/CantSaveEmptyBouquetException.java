package exceptions;

public class CantSaveEmptyBouquetException extends Exception {

    public CantSaveEmptyBouquetException() {
    }

    public CantSaveEmptyBouquetException(String message) {
        super(message);
    }
}
