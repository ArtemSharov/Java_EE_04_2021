import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ShoppingCart", urlPatterns = "/shopping_cart")
public class ShoppingCart extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ShoppingCart.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Products");
        Product p1 = new Product(1,"Rice",3.24f);
        Product p2 = new Product(1,"Sugar",1.4f);
        Product p3 = new Product(1,"Milk",0.8f);
        Product p4 = new Product(1,"Tea",4.1f);
        Product p5 = new Product(1,"Tomato",2.7f);
        Product p6 = new Product(1,"Banana",3.15f);
        Product p7 = new Product(1,"Meat",5.7f);
        Product p8 = new Product(1,"Fish",7f);
        Product p9 = new Product(1,"Spring",10f);
        Product p10 = new Product(1,"Coffee",4.24f);
        resp.getWriter().println(p1.getName());
        resp.getWriter().println(p2.getName());
        resp.getWriter().println(p3.getName());
        resp.getWriter().println(p4.getName());
        resp.getWriter().println(p5.getName());
        resp.getWriter().println(p6.getName());
        resp.getWriter().println(p7.getName());
        resp.getWriter().println(p8.getName());
        resp.getWriter().println(p9.getName());
        resp.getWriter().println(p10.getName());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New POST request");

        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}

