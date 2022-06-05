import Repository.ReadFileRepository;
import Repository.ReadFileRepositoryImpl;
import Service.ReadFileService;
import Service.ReadFileServiceImpl;



public class MainApp {
    public static void main(String[] args) {

        ReadFileRepository readFileRepository = new ReadFileRepositoryImpl();
        ReadFileService readFileService = new ReadFileServiceImpl(readFileRepository);

        readFileService.showMenu();


    }
}