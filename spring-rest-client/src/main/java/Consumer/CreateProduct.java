package Consumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CreateProduct {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);
		
    //create product obj
    Product product = new Product();
		product.setArticleId(128);
		product.setTitle("sony cameraaaaa");
		product.setCategory("cameara23");

		String status = service.createProduct(product);

		System.out.println(status);

	}
}

  	