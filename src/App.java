import repository.ReadFileRepository;
import repository.ReadFileRepositoryImpl;
import service.ReadFileService;
import service.ReadFileServiceImpl;

public class App {
    public static void main(String[] args) {

        ReadFileRepository readFileRepository = new ReadFileRepositoryImpl();
        ReadFileService readFileService = new ReadFileServiceImpl(readFileRepository);

        readFileService.showMenu();

    }


}