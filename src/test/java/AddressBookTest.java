
import com.addressbook.AddressBookList;
import com.addressbook.AddressBookMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
public class AddressBookTest {


    static AddressBookList addressBookList;

    @Test
    public void givenAddressBookContactsInList_WhenName_ShouldMatchContacts() {
        AddressBookList addressBookList = new AddressBookList();
        List<AddressBookMain> addressBookMain = addressBookList.personList;
        Assertions.assertEquals(1, addressBookMain.size());
    }

    @Test
    public void givenAddressBookContactsInList_WhenName_ShouldNotMatchContacts() {
        AddressBookList addressBookList = new AddressBookList();
        List<AddressBookMain> addressBookMain = addressBookList.personList;
        Assertions.assertEquals(1, addressBookMain.size());
    }

}