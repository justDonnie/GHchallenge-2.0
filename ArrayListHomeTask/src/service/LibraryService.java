package service;

import models.Library;

import java.util.List;

public interface LibraryService {
    List<Library>saveLibrary(List<Library>libraries);
    List<Library>getAllLibraries();
    Library getLibraryById(Long ID);
    Library updateLibrary(Long ID, Library library);
    String deleteLibrary(Long ID);


}
