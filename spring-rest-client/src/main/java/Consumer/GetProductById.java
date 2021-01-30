package Consumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetProductById {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);
		Product product = service.getProductById("62");
		if (product == null) {
				System.out.println("invald product");
		} else {
			System.out.println(product.getArticleId());
			System.out.println(product.getCategory());
			System.out.println(product.getTitle());

		}
	}
}

	