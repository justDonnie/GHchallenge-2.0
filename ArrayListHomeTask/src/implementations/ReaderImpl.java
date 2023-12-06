package implementations;

import models.Book;
import models.DataBase;
import models.Library;
import models.Reader;
import service.ReaderService;

import java.util.List;

public class ReaderImpl implements ReaderService {

    private final DataBase dataBase;

    public ReaderImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void saveReader(Reader reader) {
        dataBase.getReaders().add(reader);
        System.out.println(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        return dataBase.getReaders();
    }

    @Override
    public Reader getReaderById(Long id) {
        for (Reader j:getAllReaders()) {
            if (id.equals(j.getID())){
                return j;
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (Reader k:getAllReaders()) {
            if (id.equals(k.getID())){
                k.setFullName(reader.getFullName());
                k.setEmail(reader.getEmail());
                k.setPhoneNumber(reader.getPhoneNumber());
                k.setGender(reader.getGender());
                return k;
            }

        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (Library l: dataBase.getLibraries()) {
            if (libraryId.equals(l.getID())){
                l.setReader(getReaderById(readerId));
                System.out.println("Reader is successfully assigned!!!");
            }
        }
    }
}
