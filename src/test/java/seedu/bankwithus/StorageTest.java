package seedu.bankwithus;

import org.junit.jupiter.api.Test;
import seedu.bankwithus.storage.Storage;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class StorageTest {
    @Test
    public void load_normalSaveFile_noMessage() {
        assertDoesNotThrow(() -> new Storage("data/save.txt", "data/transaction.txt"));
        // Storage storage = new Storage("data/save.txt");
        // assertDoesNotThrow(() -> storage.load());
    }

    // @Test
    // public void save_accountList_noMessage() {
    //     AccountList accountList = new AccountList();
    //     Storage storage = new Storage("data/save.txt");
    //     assertDoesNotThrow(() -> storage.saveToFile(accountList));
    // }
}
