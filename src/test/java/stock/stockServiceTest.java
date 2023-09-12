package stock;

import com.demos.arche7.project.service.Stock.StockService;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

/**
 * @test simule le comportement d'un stock en décrémentation,
 */

public class stockServiceTest {

    @Mock
    private StockService stockService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(stockService.decrementeStock(Mockito.anyString(), Mockito.anyInt())).thenReturn(true);
    }


//   @Before
//    public void setUp() {
//       MockitoAnnotations.initMocks(this);
//        }

    /*@Test
    public <Stock> void testDecrementeStock() {
        // Arrange
        String articleId = "article123";
        int initialStock = 10;
        int decrementAmount = 2;

        Stock stock = new Stock();
        stock.setArticleId(articleId);
        stock.setQuantity(initialStock);

        when(stockRepository.findByArticleId(articleId)).thenReturn(stock);

        // Act
        boolean result = stockService.decrementeStock(articleId, decrementAmount);

        // Assert
        assertTrue(result); // Vérifiez que la méthode retourne true
        assertEquals(initialStock - decrementAmount, stock.equals(2)); // Vérifiez que le stock a été décrémenté correctement
        verify(stockRepository, times(1)).findByArticleId(articleId); // Vérifiez que findByArticleId a été appelé une fois
        verify(stockRepository, times(1)).save((com.demos.arche7.project.model.Stock) stock); // Vérifiez que save a été appelé une fois pour mettre à jour le stock
    }*/
/*    @Test
    public void testAjouterArticle() {
        //Arrange
        String article = "article_test";
        int quantite = 5;

        //Act
        boolean result = stockService.ajouterArticle(article, quantite);

        //Assert
        *//**vérifie que la méthode reourne true*//*
        assertTrue(result);
        *//** Vérifiez que le mock a été appelé avec les bons arguments*//*
        verify(stockService, times(1)).enleverStock(article, quantite);
    }*/



}





