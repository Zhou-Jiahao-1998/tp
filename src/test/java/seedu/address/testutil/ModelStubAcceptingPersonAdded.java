package seedu.address.testutil;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Person;

/**
 * A Model stub that always accept the person being added.
 */
public class ModelStubAcceptingPersonAdded extends ModelStub {
    final ArrayList<Person> personsAdded = new ArrayList<>();

    @Override
    public boolean hasPerson(Person person) {
        requireNonNull(person);
        return personsAdded.stream().anyMatch(person::isSamePerson);
    }

    @Override
    public void addPerson(Person person) {
        requireNonNull(person);
        personsAdded.add(person);
    }

    public ArrayList<Person> getPersonsAdded() {
        return personsAdded;
    }

    @Override
    public ReadOnlyAddressBook getAddressBook() {
        return new AddressBook();
    }
}
