package services;

import models.Authors;
import models.Image;
import models.User;

import repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import repositories.AuthorsRepository;

import java.io.*;
import java.security.Principal;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorsService {

    public final AuthorsRepository authorsRepository;
    private final UserRepository userRepository;
    public List<Authors> listAuthors(String name){
        if(name != null) return authorsRepository.findByName(name);
        return authorsRepository.findAll();
    }
    public List<Authors> list(){
        return authorsRepository.findAll();
    }

    public void saveFlowers(Principal principal, Authors authors, MultipartFile file1) throws IOException {
        authors.setUser(getUserByPrincipal(principal));
        Image image1;
        if (file1.getSize() != 0) {
            image1=toImageEntity(file1);
            image1.setPreviewImage(true);
            authors.addImageToAuthor(image1);
        }

        log.info("Saving new Product.Title:{}", authors.getName(),authors.getUser().getEmail());
        Authors authorsFromDb=authorsRepository.save(authors);
        authorsFromDb.setPreviewImageID(authorsFromDb.getImages().get(0).getID());
        authorsRepository.save(authors);
    }

    public User getUserByPrincipal(Principal principal) {
        if(principal==null)return new User();
       User user=userRepository.findByEmail(principal.getName());
       writeToFile(user.getId().toString());
       return user;

    }

    private Image toImageEntity(MultipartFile file) throws IOException {
        Image image =new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize(file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }
    public void deleteAuthors(Long ID){
        authorsRepository.deleteById(ID);
    }
    public Authors getAuthorsByID(Long ID){
        return authorsRepository.findById(ID).orElse(null);
    }
    public List<Authors> getAllAuthors() {
            // Получите все цветки из репозитория или другого источника данных
            return authorsRepository.findAll();
    }


    public  void writeToFile(String ID){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", false));
            writer.write(ID);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    public int read(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                return Integer.valueOf(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();

        }
        return 0;
    }

    public List<Authors> getAuthorsByName(String searchQuery) {
        return authorsRepository.findByName(searchQuery);
    }
}
