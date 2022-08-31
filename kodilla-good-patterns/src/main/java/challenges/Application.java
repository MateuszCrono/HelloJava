package challenges;

public class Application {

        public static void main(String[] args) {




            // Zadanie 13.1
    //        MovieStore movieStore = new MovieStore();
    //
    //
    //        Map<String, List<String>> streamedListResult = movieStore.ge      tMovies();
    //
    //        streamedListResult.entrySet()
    //                .stream()
    //                .forEach(each -> System.out.print(each.getValue() + " ! "));

            // Zadanie 13.2
                ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();

                ProductOrderRequest productOrderRequest = productOrderRetriever.retrieve();

                ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new InformationService(), new ProductOrderService(), new ProductOrderRepository());

                productOrderProcessor.process(productOrderRequest);



        }

}

