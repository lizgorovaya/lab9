package Tests;


import models.Artwork;
import models.Authors;
import org.apache.catalina.User;
import org.hibernate.boot.model.relational.Database;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import repositories.ArtworkRepository;
import repositories.AuthorsRepository;

import static javax.management.Query.times;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.util.Arrays;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMv
public class ArtworkSorting {

    @Test
    public void sort_artwork() {
        List<Artwork> artworks = Arrays.asList();
        ArtworkSorter artworkSorter = new ArtworkSorter();
        List<Artwork> sortedArtworks = artworkSorter.sortArtworks(artworks);
    }

    @Test
    public void CreatePortfolio() {
        AuthorsRepository portfolioRepository = mock(AuthorsRepository.class);
        Database database = mock(Database.class);
        when(portfolioRepository.getDatabase()).thenReturn(database);
        when(database.getAssets()).thenReturn(getMockedAssets());
        Portfolio portfolio = create_portfolio(portfolioRepository);
        assertNotNull(portfolio);
        assertEquals(getMockedAssets().size(), portfolio.getAssets().size());

        verify(portfolioRepository, times(1)).getDatabase();
        verify(database, times(1)).getAssets();
    }

    @Test
    public void ViewInfo() {
        AuthorsRepository portfolioRepository = mock(AuthorsRepository.class);
        when(portfolioRepository.getPortfolioInfo()).thenReturn("Дополнительная информация о портфолио");
        Authors authors = new Authors(portfolioRepository);
        portfolio.view_info();
        verify(portfolioRepository, times(1)).getPortfolioInfo();
    }

        @Mock
        private ArtworkRepository artworkRepository;

        @Test
        public void testFindAuthor() {
            ArtworkSearch artworkSearch = new ArtworkSearch(artworkRepository);
            List<Artwork> expectedArtworks = Arrays.asList(artwork1, artwork2);
            when(artworkRepository.findByAuthor("Author 1")).thenReturn(expectedArtworks);
            List<Artwork> artworksByAuthor = artworkSearch.find_author("Author 1");
            assertEquals(expectedArtworks, artworksByAuthor);
        }

        @Mock
        private ArtworkRepository artworkRepository;

        @Test
        public void AddArtwork() {
            Artwork artwork = new Artwork("Title", "Author");
            ArtworkAdd artworkAdd = new ArtworkAdd(artworkRepository);

            artworkAdd.addArtwork(artwork);

            verify(artworkRepository).add(artwork);
        }

    @Test
    public void testDeleteUser() {
        UserDelete userDelete = new UserDelete();

        String userId = "123456";
        String username = "johndoe";
        String email = "johndoe@example.com";
        String phoneNumber = "555-1234";
        String role = "user";


        User user = new User(userId, username, email, phoneNumber, role);
        userDelete.addUser(user);
        boolean isDeleted = userDelete.deleteUser(userId);
        assertTrue(isDeleted);
        assertNull(userDelete.getUser(userId));
    }

    @Mock
    private UserRepository userRepository;

    @Test
    public void testChangeRole() {
        User user = new User("username", "admin");
        UserManagement userManagement = new UserManagement(userRepository);

        when(userRepository.getUser("username")).thenReturn(user);

        userManagement.changeRole("username", "administrator");

        assertEquals("administrator", user.getRole());
        verify(userRepository).save(user);
    }

    @Test
    public void testBlockUser() {
        User user = new User("username", "user");
        UserManagement userManagement = new UserManagement(userRepository);

        when(userRepository.getUser("username")).thenReturn(user);

        userManagement.blockUser("username");

        assertTrue(user.isBlocked());
        verify(userRepository).save(user);
    }

    @Mock
    private AuthorsRepository portfolioRepository;

    @Test
    public void testUpdatePortfolio() {
        Portfolio portfolio = new Portfolio("username", "Description", "Skills");
        PortfolioUpdate portfolioUpdate = new PortfolioUpdate(portfolioRepository);
        when(portfolioRepository.getPortfolio("username")).thenReturn(portfolio);

        portfolioUpdate.updatePortfolio("username", "New Description", "New Skills");

        assertEquals("New Description", portfolio.getDescription());
        assertEquals("New Skills", portfolio.getSkills());
        verify(portfolioRepository).save(portfolio);
    }
    @Mock
    private AuthorsRepository portfolioRepository;

    @Test
    public void testViewPortfolio() {
        Portfolio expectedPortfolio = new Portfolio("username", "Description", "Skills");
        PortfolioView portfolioView = new PortfolioView(portfolioRepository);

        when(portfolioRepository.getPortfolio("username")).thenReturn(expectedPortfolio);

        Portfolio viewedPortfolio = portfolioView.viewPortfolio("username");

        assertEquals(expectedPortfolio, viewedPortfolio);
    }
    @Mock
    private ArtworkRepository artworkRepository;

    @Test
    public void testSortArtworksByStyle() {
        Artwork artwork1 = new Artwork("Title 1", "Author 1", "Impression-ism");
        Artwork artwork2 = new Artwork("Title 2", "Author 2", "Surrealism");
        Artwork artwork3 = new Artwork("Title 3", "Author 3", "Cubism");

        List<Artwork> artworks = Arrays.asList(artwork1, artwork2, artwork3);
        List<Artwork> expectedSortedArtworks = Arrays.asList(artwork3, art-work1, artwork2);

        ArtworkSort artworkSort = new ArtworkSort(artworkRepository);

        when(artworkRepository.getAllArtworks()).thenReturn(artworks);

        List<Artwork> sortedArtworks = artworkSort.sortArtworksByStyle();

        assertEquals(expectedSortedArtworks, sortedArtworks);
    }

}










