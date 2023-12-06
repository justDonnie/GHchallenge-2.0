package implementations;

import models.DataBase;
import models.Library;
import service.LibraryService;

import java.util.List;

public class LibraryImpl implements LibraryService {

    public DataBase dataBase;

    public LibraryImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Library> saveLibrary (List<Library> libraries) {
        dataBase.getLibraries().addAll(libraries);
        return libraries;
    }

    @Override
    public List<Library> getAllLibraries() {
        return dataBase.getLibraries();
    }

    @Override
    public Library getLibraryById(Long ID) {
        for (Library l:dataBase.getLibraries()) {
            if (ID.equals(l.getID())) {
                return l;
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long ID, Library library) {
      Library library1= getLibraryById(ID);
      library1.setName(library.getName());
      library1.setAddress(library.getAddress());
      library1.setBooks(library.getBooks());
      library1.setReaders(library.getReaders());
      return library1;
    }

    @Override
    public String deleteLibrary(Long ID) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getID().equals(ID)){
                dataBase.getLibraries().remove(dataBase.getLibraries().get(i));
            }
        }return "Last Library is deleted !!!";
    }
}
